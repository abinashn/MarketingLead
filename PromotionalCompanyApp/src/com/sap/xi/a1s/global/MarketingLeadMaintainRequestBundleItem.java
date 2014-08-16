
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.ProductInternalID;
import com.sap.xi.ap.common.gdt.Quantity;
import com.sap.xi.ap.common.gdt.SHORTDescription;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Java class for MarketingLeadMaintainRequestBundleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingLeadMaintainRequestBundleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/>
 *         &lt;element name="QuantityValue" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/>
 *         &lt;element name="ProductUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/>
 *         &lt;element name="MaterialInternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID" minOccurs="0"/>
 *         &lt;element name="ServiceProductInternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID" minOccurs="0"/>
 *         &lt;element name="ProductCategoryInternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductCategoryInternalID" minOccurs="0"/>
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
@XmlType(name = "MarketingLeadMaintainRequestBundleItem", propOrder = {
    "objectNodeSenderTechnicalID",
    "uuid",
    "id",
    "description",
    "quantityValue",
    "productUUID",
    "materialInternalID",
    "serviceProductInternalID",
    "productCategoryInternalID"
})
public class MarketingLeadMaintainRequestBundleItem {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlElement(name = "Description")
    protected SHORTDescription description;
    @XmlElement(name = "QuantityValue")
    protected Quantity quantityValue;
    @XmlElement(name = "ProductUUID")
    protected UUID productUUID;
    @XmlElement(name = "MaterialInternalID")
    protected ProductInternalID materialInternalID;
    @XmlElement(name = "ServiceProductInternalID")
    protected ProductInternalID serviceProductInternalID;
    @XmlElement(name = "ProductCategoryInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productCategoryInternalID;
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
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link SHORTDescription }
     *     
     */
    public SHORTDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORTDescription }
     *     
     */
    public void setDescription(SHORTDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the quantityValue property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantityValue() {
        return quantityValue;
    }

    /**
     * Sets the value of the quantityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantityValue(Quantity value) {
        this.quantityValue = value;
    }

    /**
     * Gets the value of the productUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getProductUUID() {
        return productUUID;
    }

    /**
     * Sets the value of the productUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setProductUUID(UUID value) {
        this.productUUID = value;
    }

    /**
     * Gets the value of the materialInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInternalID }
     *     
     */
    public ProductInternalID getMaterialInternalID() {
        return materialInternalID;
    }

    /**
     * Sets the value of the materialInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInternalID }
     *     
     */
    public void setMaterialInternalID(ProductInternalID value) {
        this.materialInternalID = value;
    }

    /**
     * Gets the value of the serviceProductInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInternalID }
     *     
     */
    public ProductInternalID getServiceProductInternalID() {
        return serviceProductInternalID;
    }

    /**
     * Sets the value of the serviceProductInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInternalID }
     *     
     */
    public void setServiceProductInternalID(ProductInternalID value) {
        this.serviceProductInternalID = value;
    }

    /**
     * Gets the value of the productCategoryInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategoryInternalID() {
        return productCategoryInternalID;
    }

    /**
     * Sets the value of the productCategoryInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategoryInternalID(String value) {
        this.productCategoryInternalID = value;
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
