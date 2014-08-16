
package com.sap.xi.sapglobal20.global;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.sap.xi.a1s.global.MarketingLeadMaintainConfirmationBundleMessageSync;
import com.sap.xi.a1s.global.MarketingLeadMaintainRequestBundleMessageSync;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.xi.sapglobal20.global package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MarketingLeadBundleMaintainRequestSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "MarketingLeadBundleMaintainRequest_sync");
    private final static QName _MarketingLeadBundleMaintainConfirmationSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "MarketingLeadBundleMaintainConfirmation_sync");
    private final static QName _MarketingLeadRequestBundleCheckMaintainResponseSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "MarketingLeadRequestBundleCheckMaintainResponse_sync");
    private final static QName _MarketeingLeadRequestBundleCheckMaintainQuerySync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "MarketeingLeadRequestBundleCheckMaintainQuery_sync");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.xi.sapglobal20.global
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingLeadMaintainRequestBundleMessageSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "MarketingLeadBundleMaintainRequest_sync")
    public JAXBElement<MarketingLeadMaintainRequestBundleMessageSync> createMarketingLeadBundleMaintainRequestSync(MarketingLeadMaintainRequestBundleMessageSync value) {
        return new JAXBElement<MarketingLeadMaintainRequestBundleMessageSync>(_MarketingLeadBundleMaintainRequestSync_QNAME, MarketingLeadMaintainRequestBundleMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingLeadMaintainConfirmationBundleMessageSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "MarketingLeadBundleMaintainConfirmation_sync")
    public JAXBElement<MarketingLeadMaintainConfirmationBundleMessageSync> createMarketingLeadBundleMaintainConfirmationSync(MarketingLeadMaintainConfirmationBundleMessageSync value) {
        return new JAXBElement<MarketingLeadMaintainConfirmationBundleMessageSync>(_MarketingLeadBundleMaintainConfirmationSync_QNAME, MarketingLeadMaintainConfirmationBundleMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingLeadMaintainConfirmationBundleMessageSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "MarketingLeadRequestBundleCheckMaintainResponse_sync")
    public JAXBElement<MarketingLeadMaintainConfirmationBundleMessageSync> createMarketingLeadRequestBundleCheckMaintainResponseSync(MarketingLeadMaintainConfirmationBundleMessageSync value) {
        return new JAXBElement<MarketingLeadMaintainConfirmationBundleMessageSync>(_MarketingLeadRequestBundleCheckMaintainResponseSync_QNAME, MarketingLeadMaintainConfirmationBundleMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingLeadMaintainRequestBundleMessageSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "MarketeingLeadRequestBundleCheckMaintainQuery_sync")
    public JAXBElement<MarketingLeadMaintainRequestBundleMessageSync> createMarketeingLeadRequestBundleCheckMaintainQuerySync(MarketingLeadMaintainRequestBundleMessageSync value) {
        return new JAXBElement<MarketingLeadMaintainRequestBundleMessageSync>(_MarketeingLeadRequestBundleCheckMaintainQuerySync_QNAME, MarketingLeadMaintainRequestBundleMessageSync.class, null, value);
    }

}
