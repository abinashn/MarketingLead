package com.cfc.fb.main;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cfc.sample.persistence.FBPerson;
import com.cfc.sample.persistence.FBPersonBean;
import com.sap.security.core.server.csi.IXSSEncoder;
import com.sap.security.core.server.csi.XSSEncoder;



/**
 * Servlet implementation class MainApp
 */
public class MainApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static final Logger LOGGER = LoggerFactory
			.getLogger(MainApp.class);
	@EJB
	FBPersonBean personBean;

	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		response.getWriter().println("<p>Persistence with JPA!</p>");
		try {
			appendPersonTable(response);
			appendAddForm(response);
		} catch (Exception e) {
			response.getWriter().println(
					"Persistence operation failed with reason: "
							+ e.getMessage());
			LOGGER.error("Persistence operation failed", e);
		}

		
	}

	private void appendAddForm(HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		// Append table that lists all persons
				List<FBPerson> resultList = personBean.getAllPersons();
				response.getWriter().println(
						"<p><table border=\"1\"><tr><th colspan=\"3\">"
								+ (resultList.isEmpty() ? "" : resultList.size()
										+ " ")
										+ "Entries in the Database</th></tr>");
				if (resultList.isEmpty()) {
					response.getWriter().println(
							"<tr><td colspan=\"3\">Database is empty</td></tr>");
				} else {
					response.getWriter()
					.println(
							"<tr><th>First name</th><th>Last name</th><th>Id</th></tr>");
				}
				IXSSEncoder xssEncoder = XSSEncoder.getInstance();
				for (FBPerson p : resultList) {
					response.getWriter().println(
							"<tr><td>" + xssEncoder.encodeHTML(p.getFirstName())
							+ "</td><td>"
							+ xssEncoder.encodeHTML(p.getLastName())
							+ "</td><td>" + p.getId() + "</td></tr>");
				}
				response.getWriter().println("</table></p>");

		
		
	}

	private void appendPersonTable(HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		// Append form through which new persons can be added
				response.getWriter()
						.println(
								"<p><form action=\"\" method=\"post\">"
										+ "First name:<input type=\"text\" name=\"FirstName\">"
										+ "&nbsp;Last name:<input type=\"text\" name=\"LastName\">"
										+ "&nbsp;<input type=\"submit\" value=\"Add Person\">"
										+ "</form></p>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
		try {
			doGet(request, response);
		} catch (Exception e) {
			response.getWriter().println(
					"Persistence operation failed with reason: "
							+ e.getMessage());
			LOGGER.error("Persistence operation failed", e);
		}

	}

}
