
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.crm.global.LeanLeadRemoteSemanticKey;


/**
 * <p>Java class for LeanLeadMaintainRequestBundleProspectParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeanLeadMaintainRequestBundleProspectParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" minOccurs="0"/>
 *         &lt;element name="AccountUUID" type="{http://sap.com/xi/Common/DataTypes}UUID" minOccurs="0"/>
 *         &lt;element name="AccountInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="AccountExternalKey" type="{http://sap.com/xi/AP/CRM/Global}LeanLeadRemoteSemanticKey" minOccurs="0"/>
 *         &lt;element name="ContactParty" type="{http://sap.com/xi/A1S/Global}LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyContactPartyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/>
 *         &lt;element name="DefaultContactExternalKey" type="{http://sap.com/xi/AP/CRM/Global}LeanLeadRemoteSemanticKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeanLeadMaintainRequestBundleProspectParty", propOrder = {
    "actionCode",
    "accountUUID",
    "accountInternalID",
    "accountExternalKey",
    "contactParty",
    "partyContactPartyListCompleteTransmissionIndicator",
    "defaultContactExternalKey"
})
public class LeanLeadMaintainRequestBundleProspectParty {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlElement(name = "AccountUUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accountUUID;
    @XmlElement(name = "AccountInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accountInternalID;
    @XmlElement(name = "AccountExternalKey")
    protected LeanLeadRemoteSemanticKey accountExternalKey;
    @XmlElement(name = "ContactParty")
    protected List<LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType> contactParty;
    @XmlElement(name = "PartyContactPartyListCompleteTransmissionIndicator")
    protected Boolean partyContactPartyListCompleteTransmissionIndicator;
    @XmlElement(name = "DefaultContactExternalKey")
    protected LeanLeadRemoteSemanticKey defaultContactExternalKey;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the accountUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUUID() {
        return accountUUID;
    }

    /**
     * Sets the value of the accountUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUUID(String value) {
        this.accountUUID = value;
    }

    /**
     * Gets the value of the accountInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInternalID() {
        return accountInternalID;
    }

    /**
     * Sets the value of the accountInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInternalID(String value) {
        this.accountInternalID = value;
    }

    /**
     * Gets the value of the accountExternalKey property.
     * 
     * @return
     *     possible object is
     *     {@link LeanLeadRemoteSemanticKey }
     *     
     */
    public LeanLeadRemoteSemanticKey getAccountExternalKey() {
        return accountExternalKey;
    }

    /**
     * Sets the value of the accountExternalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeanLeadRemoteSemanticKey }
     *     
     */
    public void setAccountExternalKey(LeanLeadRemoteSemanticKey value) {
        this.accountExternalKey = value;
    }

    /**
     * Gets the value of the contactParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType }
     * 
     * 
     */
    public List<LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType> getContactParty() {
        if (contactParty == null) {
            contactParty = new ArrayList<LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType>();
        }
        return this.contactParty;
    }

    /**
     * Gets the value of the partyContactPartyListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartyContactPartyListCompleteTransmissionIndicator() {
        return partyContactPartyListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the partyContactPartyListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartyContactPartyListCompleteTransmissionIndicator(Boolean value) {
        this.partyContactPartyListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the defaultContactExternalKey property.
     * 
     * @return
     *     possible object is
     *     {@link LeanLeadRemoteSemanticKey }
     *     
     */
    public LeanLeadRemoteSemanticKey getDefaultContactExternalKey() {
        return defaultContactExternalKey;
    }

    /**
     * Sets the value of the defaultContactExternalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeanLeadRemoteSemanticKey }
     *     
     */
    public void setDefaultContactExternalKey(LeanLeadRemoteSemanticKey value) {
        this.defaultContactExternalKey = value;
    }

}
