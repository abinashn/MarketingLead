
package com.sap.xi.ap.common.gdt;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:3.0" xmlns="http://sap.com/xi/AP/Common/GDT" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:n1="http://sap.com/xi/AP/CustomerExtension/BYD/A0014" xmlns:n2="http://sap.com/xi/SAPGlobal20/Global" xmlns:n3="http://sap.com/xi/AP/Common/Global" xmlns:n4="http://sap.com/xi/AP/Common/GDT" xmlns:n5="http://sap.com/xi/BASIS/Global" xmlns:n6="http://sap.com/xi/DocumentServices/Global" xmlns:n7="http://sap.com/xi/AP/Extensibility/GeneratedObjects" xmlns:n8="http://sap.com/xi/Common/DataTypes" xmlns:n9="http://sap.com/xi/AP/CRM/Global" xmlns:rfc="urn:sap-com:sap:rfc:functions" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://sap.com/xi/A1S/Global" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsoap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:xi0="http://sap.com/xi/AP/CustomerExtension/BYD/A0014" xmlns:xi1="http://sap.com/xi/SAPGlobal20/Global" xmlns:xi10="http://sap.com/xi/AP/CRM/Global" xmlns:xi2="http://sap.com/xi/AP/Common/Global" xmlns:xi3="http://sap.com/xi/A1S/Global" xmlns:xi4="http://sap.com/xi/AP/Common/GDT" xmlns:xi6="http://sap.com/xi/BASIS/Global" xmlns:xi7="http://sap.com/xi/DocumentServices/Global" xmlns:xi8="http://sap.com/xi/AP/Extensibility/GeneratedObjects" xmlns:xi9="http://sap.com/xi/Common/DataTypes" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:RepresentationTerm&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Quantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quantity">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://sap.com/xi/AP/Common/GDT>Quantity.Content">
 *       &lt;attribute name="unitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity", propOrder = {
    "value"
})
public class Quantity {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unitCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

}
