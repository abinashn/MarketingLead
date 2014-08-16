
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.Log;


/**
 * <p>Java class for MarketingLeadMaintainConfirmationBundleMessage_sync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingLeadMaintainConfirmationBundleMessage_sync">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketingLead" type="{http://sap.com/xi/A1S/Global}LeanLeadMaintainConfirmationBundleLead" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingLeadMaintainConfirmationBundleMessage_sync", propOrder = {
    "marketingLead",
    "log"
})
public class MarketingLeadMaintainConfirmationBundleMessageSync {

    @XmlElement(name = "MarketingLead")
    protected List<LeanLeadMaintainConfirmationBundleLead> marketingLead;
    @XmlElement(name = "Log", required = true)
    protected Log log;

    /**
     * Gets the value of the marketingLead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingLead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingLead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeanLeadMaintainConfirmationBundleLead }
     * 
     * 
     */
    public List<LeanLeadMaintainConfirmationBundleLead> getMarketingLead() {
        if (marketingLead == null) {
            marketingLead = new ArrayList<LeanLeadMaintainConfirmationBundleLead>();
        }
        return this.marketingLead;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
