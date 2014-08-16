
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MarketingLeadMaintainRequestBundleEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingLeadMaintainRequestBundleEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/>
 *         &lt;element name="EventSourceCode" type="{http://sap.com/xi/AP/Common/GDT}LeadEventSourceCode" minOccurs="0"/>
 *         &lt;element name="EventTypeCode" type="{http://sap.com/xi/AP/Common/GDT}LeadEventTypeCode" minOccurs="0"/>
 *         &lt;element name="EventAggregateName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Text" minOccurs="0"/>
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
@XmlType(name = "MarketingLeadMaintainRequestBundleEvent", propOrder = {
    "objectNodeSenderTechnicalID",
    "eventSourceCode",
    "eventTypeCode",
    "eventAggregateName"
})
public class MarketingLeadMaintainRequestBundleEvent {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "EventSourceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String eventSourceCode;
    @XmlElement(name = "EventTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String eventTypeCode;
    @XmlElement(name = "EventAggregateName")
    protected String eventAggregateName;
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
     * Gets the value of the eventSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSourceCode() {
        return eventSourceCode;
    }

    /**
     * Sets the value of the eventSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSourceCode(String value) {
        this.eventSourceCode = value;
    }

    /**
     * Gets the value of the eventTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeCode() {
        return eventTypeCode;
    }

    /**
     * Sets the value of the eventTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeCode(String value) {
        this.eventTypeCode = value;
    }

    /**
     * Gets the value of the eventAggregateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventAggregateName() {
        return eventAggregateName;
    }

    /**
     * Sets the value of the eventAggregateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventAggregateName(String value) {
        this.eventAggregateName = value;
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
