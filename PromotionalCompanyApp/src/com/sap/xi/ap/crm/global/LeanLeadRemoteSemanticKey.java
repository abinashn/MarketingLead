
package com.sap.xi.ap.crm.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.CommunicationSystemID;
import com.sap.xi.ap.common.gdt.NOCONVERSIONObjectID;


/**
 * <p>Java class for LeanLeadRemoteSemanticKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeanLeadRemoteSemanticKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommunicationSystemID" type="{http://sap.com/xi/AP/Common/GDT}CommunicationSystemID" minOccurs="0"/>
 *         &lt;element name="RemoteObjectID" type="{http://sap.com/xi/AP/Common/GDT}NOCONVERSION_ObjectID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeanLeadRemoteSemanticKey", propOrder = {
    "communicationSystemID",
    "remoteObjectID"
})
public class LeanLeadRemoteSemanticKey {

    @XmlElement(name = "CommunicationSystemID")
    protected CommunicationSystemID communicationSystemID;
    @XmlElement(name = "RemoteObjectID")
    protected NOCONVERSIONObjectID remoteObjectID;

    /**
     * Gets the value of the communicationSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationSystemID }
     *     
     */
    public CommunicationSystemID getCommunicationSystemID() {
        return communicationSystemID;
    }

    /**
     * Sets the value of the communicationSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationSystemID }
     *     
     */
    public void setCommunicationSystemID(CommunicationSystemID value) {
        this.communicationSystemID = value;
    }

    /**
     * Gets the value of the remoteObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link NOCONVERSIONObjectID }
     *     
     */
    public NOCONVERSIONObjectID getRemoteObjectID() {
        return remoteObjectID;
    }

    /**
     * Sets the value of the remoteObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOCONVERSIONObjectID }
     *     
     */
    public void setRemoteObjectID(NOCONVERSIONObjectID value) {
        this.remoteObjectID = value;
    }

}
