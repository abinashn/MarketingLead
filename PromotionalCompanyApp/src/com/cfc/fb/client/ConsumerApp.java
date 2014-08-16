package com.cfc.fb.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;

import com.cfc.sample.persistence.FBPerson;
import com.cfc.sample.persistence.FBPersonBean;
import com.sap.xi.a1s.global.ManageMarketingLeadIn;
import com.sap.xi.a1s.global.MarketingLeadMaintainConfirmationBundleMessageSync;
import com.sap.xi.a1s.global.MarketingLeadMaintainRequestBundle;
import com.sap.xi.a1s.global.MarketingLeadMaintainRequestBundleAddress;
import com.sap.xi.a1s.global.MarketingLeadMaintainRequestBundleMessageSync;
import com.sap.xi.a1s.global.StandardFaultMessage;
import com.sap.xi.ap.common.gdt.CustomerTransactionDocumentOriginTypeCode;
import com.sap.xi.ap.common.gdt.EmailURI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Servlet implementation class ConsumerApp
 */
public class ConsumerApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String APP_ACCESS_TOKEN = null;

	private static String USERNAME = null;

	private static String PASSWORD = null;

	private static String PAGE_ACCESS_TOKEN = null;

	private static String VERIFY_TOKEN = null;

	ServletContext context;
	ArrayList<String> arrl = new ArrayList<String>();
	Properties prop = new Properties();
	
	static Logger LOGGER = LoggerFactory.getLogger(ConsumerApp.class);
	@EJB
	FBPersonBean personBean;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsumerApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String _mode = request.getParameter("hub.mode");
		String _token = request.getParameter("hub.verify_token");		

		if (_mode.equalsIgnoreCase("subscribe") && _token.equals(VERIFY_TOKEN)) {
			response.setContentType("text/plain");
			response.getWriter().print(request.getParameter("hub.challenge"));

		}
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		context = getServletContext();
		try {
			String path = getServletContext()
					.getInitParameter("PropertiesFile");
			final InputStream is = getServletContext()
					.getResourceAsStream(path);
			try {
				prop.load(is);
				VERIFY_TOKEN = prop.getProperty("VERIFY_TOKEN");				
				APP_ACCESS_TOKEN = prop.getProperty("APP_ACCESS_TOKEN");
				PAGE_ACCESS_TOKEN = prop.getProperty("PAGE_ACCESS_TOKEN");
				USERNAME = prop.getProperty("USERNAME");
				PASSWORD = prop.getProperty("PASSWORD");
				
				//To check if properties are loaded correctly
				LOGGER.debug(USERNAME);
			} finally {
				is.close();
			}
		} catch (Exception asd) {
			LOGGER.error(asd.getMessage());
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LOGGER.info("Callback received from facebook");

		try {
			JsonReader jsonReader = Json.createReader(request.getInputStream());
			JsonObject jsonObject = jsonReader.readObject();
			jsonReader.close();

			LOGGER.info("Call back Data  : " + jsonObject.toString());

			JsonArray jsonArray = jsonObject.getJsonArray("entry");

			for (int i = 0; i < jsonArray.size(); i++) {
				JsonObject changeobject = jsonArray.getJsonObject(i);
				JsonArray jsonArrayChange = changeobject
						.getJsonArray("changes");
				for (int j = 0; j < jsonArrayChange.size(); j++) {
					JsonObject innerJsonObject = jsonArrayChange
							.getJsonObject(j);

					JsonObject valObject = innerJsonObject
							.getJsonObject("value");
					if (valObject.getJsonString("item").getString()
							.equals("like")) {

						String parent_id = valObject.getJsonString("parent_id")
								.getString().split("_")[1];

						String urlString = "https://graph.facebook.com/v2.0/"
								+ parent_id + "/likes?access_token="
								+ PAGE_ACCESS_TOKEN;

						jsonReader = Json
								.createReader(callFBGraphAPI(urlString));
						JsonObject jsonappscopedidObject = jsonReader
								.readObject();
						LOGGER.debug("User ID Data from Facebook : "
								+ jsonappscopedidObject.toString());
						jsonReader.close();

						JsonArray jsonArrayappscopedid = jsonappscopedidObject
								.getJsonArray("data");

						for (int k = 0; k < jsonArrayappscopedid.size(); k++) {
							JsonObject JsonObjectData = jsonArrayappscopedid
									.getJsonObject(k);

							String user_app_scoped_id = JsonObjectData
									.getJsonString("id").getString();
							if (!arrl.contains(parent_id + "_"
									+ user_app_scoped_id)) {
								urlString = "https://graph.facebook.com/v2.0/"
										+ user_app_scoped_id + "?access_token="
										+ APP_ACCESS_TOKEN;

								jsonReader = Json
										.createReader(callFBGraphAPI(urlString));
								JsonObject jsonuserdetailObject = jsonReader
										.readObject();
								LOGGER.debug("User details Data from Facebook : "
												+ jsonuserdetailObject
														.toString());
								jsonReader.close();

								String usrmail = jsonuserdetailObject
										.getJsonString("email").getString();
								String usrfname = jsonuserdetailObject
										.getJsonString("first_name")
										.getString();
								String usrlname = jsonuserdetailObject
										.getJsonString("last_name").getString();
								String usrgender = jsonuserdetailObject
										.getJsonString("gender").getString();

								LOGGER.error("Lead ID : "
										+ CreateMarketingLead(usrfname,
												usrlname, usrmail, usrgender,
												parent_id + "_"
														+ user_app_scoped_id));
								doAdd(usrfname, usrlname, usrmail, usrgender,parent_id+"_"+user_app_scoped_id);
							}
						}

					}
				}

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error(e.getMessage());
		}
	}

	public InputStream callFBGraphAPI(String urlString) throws Exception {
		LOGGER.debug("Inside callFBGraphAPI");
		URL url = new URL(urlString);
		URLConnection conn = url.openConnection();
		return conn.getInputStream();

	}

	private String CreateMarketingLead(String usrfname, String usrlname,
			String usrmail, String usrgender, String user_app_scoped_id) {
		LOGGER.debug("Inside CreateMarketingLead");

		com.sap.xi.a1s.global.Service mService = new com.sap.xi.a1s.global.Service();
		ManageMarketingLeadIn manageMarketingLeadIn = mService.getBinding();

		BindingProvider bindingProvider = (BindingProvider) manageMarketingLeadIn;

		Map<String, Object> rc = (Map<String, Object>) bindingProvider
				.getRequestContext();
		rc.put(BindingProvider.USERNAME_PROPERTY, USERNAME);
		rc.put(BindingProvider.PASSWORD_PROPERTY, PASSWORD);

		MarketingLeadMaintainRequestBundleMessageSync marketingLeadMaintainRequestSync = new MarketingLeadMaintainRequestBundleMessageSync();
		List<MarketingLeadMaintainRequestBundle> marketingLeadMaintainRequest = marketingLeadMaintainRequestSync
				.getMarketingLead();
		MarketingLeadMaintainRequestBundle marketingLeadMaintainRequestBundle = new MarketingLeadMaintainRequestBundle();

		marketingLeadMaintainRequestBundle.setActionCode("01");
		marketingLeadMaintainRequestBundle
				.setItemListCompleteTransmissionIndicator(true);
		CustomerTransactionDocumentOriginTypeCode originTypeCode = new CustomerTransactionDocumentOriginTypeCode();
		originTypeCode.setValue("003");
		marketingLeadMaintainRequestBundle.setOriginTypeCode(originTypeCode);
		marketingLeadMaintainRequestBundle.setName(user_app_scoped_id);
		marketingLeadMaintainRequestBundle.setCompanyName("Facebook");
		marketingLeadMaintainRequestBundle.setPersonFirstName(usrfname);
		marketingLeadMaintainRequestBundle.setPersonLastName(usrlname);
		if (usrgender.equals("male"))
			marketingLeadMaintainRequestBundle.setPersonGenderCode("1");
		else if (usrgender.equals("female"))
			marketingLeadMaintainRequestBundle.setPersonGenderCode("2");
		else
			marketingLeadMaintainRequestBundle.setPersonGenderCode("0");
		MarketingLeadMaintainRequestBundleAddress address = new MarketingLeadMaintainRequestBundleAddress();
		EmailURI email = new EmailURI();
		email.setValue(usrmail);
		address.setEmailURI(email);
		marketingLeadMaintainRequestBundle.setAddress(address);
		marketingLeadMaintainRequest.add(marketingLeadMaintainRequestBundle);

		try {
			MarketingLeadMaintainConfirmationBundleMessageSync resp = manageMarketingLeadIn
					.maintainBundle(marketingLeadMaintainRequestSync);
			
			arrl.add(user_app_scoped_id);

			return (resp.getMarketingLead().get(0).getID().getValue());

		} catch (StandardFaultMessage e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
	
	private void doAdd(String usrfname, String usrlname, String usrmail,
			String usrgender, String string) {
		// TODO Auto-generated method stub
		LOGGER.debug("Inside doAdd");
		if (usrfname != null && usrlname != null
				&& !usrfname.trim().isEmpty()
				&& !usrlname.trim().isEmpty()) {
			FBPerson person = new FBPerson();
			person.setFirstName(usrfname);
			person.setLastName(usrlname);
		/*	person.setMail(usrmail);
			person.setGender(usrgender);
			person.setUniqueId(string);
			*/personBean.addPerson(person);
			
			LOGGER.debug("Added the data to the database: "+usrfname);
		}
		
	}

}
