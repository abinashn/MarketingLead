
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.crm.global.LeanLeadRemoteSemanticKey;


/**
 * <p>Java class for LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/>
 *         &lt;element name="ContactPersonUUID" type="{http://sap.com/xi/Common/DataTypes}UUID" minOccurs="0"/>
 *         &lt;element name="ContactPersonInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="MainIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/>
 *         &lt;element name="ContactExternalKey" type="{http://sap.com/xi/AP/CRM/Global}LeanLeadRemoteSemanticKey" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType", propOrder = {
    "objectNodeSenderTechnicalID",
    "contactPersonUUID",
    "contactPersonInternalID",
    "mainIndicator",
    "contactExternalKey"
})
public class LeanLeadProspectPartyContactPartyMaintainBundleRequestMessageDataType {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ContactPersonUUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactPersonUUID;
    @XmlElement(name = "ContactPersonInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactPersonInternalID;
    @XmlElement(name = "MainIndicator")
    protected Boolean mainIndicator;
    @XmlElement(name = "ContactExternalKey")
    protected LeanLeadRemoteSemanticKey contactExternalKey;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the objectNodeSenderTechnicalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNodeSenderTechnicalID() {
        return objectNodeSenderTechnicalID;
    }

    /**
     * Sets the value of the objectNodeSenderTechnicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNodeSenderTechnicalID(String value) {
        this.objectNodeSenderTechnicalID = value;
    }

    /**
     * Gets the value of the contactPersonUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonUUID() {
        return contactPersonUUID;
    }

    /**
     * Sets the value of the contactPersonUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonUUID(String value) {
        this.contactPersonUUID = value;
    }

    /**
     * Gets the value of the contactPersonInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonInternalID() {
        return contactPersonInternalID;
    }

    /**
     * Sets the value of the contactPersonInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonInternalID(String value) {
        this.contactPersonInternalID = value;
    }

    /**
     * Gets the value of the mainIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainIndicator() {
        return mainIndicator;
    }

    /**
     * Sets the value of the mainIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainIndicator(Boolean value) {
        this.mainIndicator = value;
    }

    /**
     * Gets the value of the contactExternalKey property.
     * 
     * @return
     *     possible object is
     *     {@link LeanLeadRemoteSemanticKey }
     *     
     */
    public LeanLeadRemoteSemanticKey getContactExternalKey() {
        return contactExternalKey;
    }

    /**
     * Sets the value of the contactExternalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeanLeadRemoteSemanticKey }
     *     
     */
    public void setContactExternalKey(LeanLeadRemoteSemanticKey value) {
        this.contactExternalKey = value;
    }

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

}
