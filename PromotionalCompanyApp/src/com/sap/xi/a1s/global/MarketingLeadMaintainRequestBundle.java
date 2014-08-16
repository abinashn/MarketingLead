
package com.sap.xi.a1s.global;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.AcademicTitleCode;
import com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID;
import com.sap.xi.ap.common.gdt.CustomerTransactionDocumentOriginTypeCode;
import com.sap.xi.ap.common.gdt.LeadGroupCode;
import com.sap.xi.ap.common.gdt.LeadQualificationLevelCode;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.documentservices.global.MaintenanceAttachmentFolder;


/**
 * <p>Java class for MarketingLeadMaintainRequestBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingLeadMaintainRequestBundle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/>
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Description" minOccurs="0"/>
 *         &lt;element name="QualificationLevelCode" type="{http://sap.com/xi/AP/Common/GDT}LeadQualificationLevelCode" minOccurs="0"/>
 *         &lt;element name="OriginTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentOriginTypeCode" minOccurs="0"/>
 *         &lt;element name="GroupCode" type="{http://sap.com/xi/AP/Common/GDT}LeadGroupCode" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://sap.com/xi/Common/DataTypes}LeadUserStatusCode" minOccurs="0"/>
 *         &lt;element name="CampaignPredecessorReferenceID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/>
 *         &lt;element name="EmployeeInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="MarketingUnitInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="SalesUnitInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Text" minOccurs="0"/>
 *         &lt;element name="UseExistingAccountContactIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/>
 *         &lt;element name="PersonFirstName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="PersonLastName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="PersonMiddleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="PersonGenderCode" type="{http://sap.com/xi/AP/Common/GDT}GenderCode" minOccurs="0"/>
 *         &lt;element name="PersonAcademicTitleCode" type="{http://sap.com/xi/AP/Common/GDT}AcademicTitleCode" minOccurs="0"/>
 *         &lt;element name="PersonAdditionalAcademicTitleCode" type="{http://sap.com/xi/AP/Common/GDT}AcademicTitleCode" minOccurs="0"/>
 *         &lt;element name="PersonContactAllowedCode" type="{http://sap.com/xi/AP/Common/GDT}ContactAllowedCode" minOccurs="0"/>
 *         &lt;element name="ContactCorrespondenceLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/>
 *         &lt;element name="ContactNotes" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Text" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="CompanySecondLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="CompanyThirdLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="CompanyFourthLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="CompanyContactAllowedCode" type="{http://sap.com/xi/AP/Common/GDT}ContactAllowedCode" minOccurs="0"/>
 *         &lt;element name="AccountNotes" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Text" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://sap.com/xi/A1S/Global}MarketingLeadMaintainRequestBundleAddress" minOccurs="0"/>
 *         &lt;element name="ProspectParty" type="{http://sap.com/xi/A1S/Global}LeanLeadMaintainRequestBundleProspectParty" minOccurs="0"/>
 *         &lt;element name="Item" type="{http://sap.com/xi/A1S/Global}MarketingLeadMaintainRequestBundleItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Event" type="{http://sap.com/xi/A1S/Global}MarketingLeadMaintainRequestBundleEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E05AE661EE390BEDBF42B6EFA15"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E0664D31EE3A1F5AFA6F7B51C62"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E0664D31EE3A1F5AFF3EF6DDC62"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581ED3BFAEA2471009779A"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581EE3B888BD4D385E8AD7"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581EE3B888BDBE650D6AD7"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581EE3B888BE0A53D24AD7"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581EE3B888BE6B4007EB04"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581EE3B888BEB55354EB05"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581EE3B888BEDB7DE3EB05"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581EE3B888BF2957EACB05"/>
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E06EC581EE3B888BF768F008B05"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" />
 *       &lt;attribute name="itemListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" />
 *       &lt;attribute name="EventListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingLeadMaintainRequestBundle", propOrder = {
    "objectNodeSenderTechnicalID",
    "changeStateID",
    "uuid",
    "id",
    "name",
    "qualificationLevelCode",
    "originTypeCode",
    "groupCode",
    "statusCode",
    "campaignPredecessorReferenceID",
    "employeeInternalID",
    "marketingUnitInternalID",
    "salesUnitInternalID",
    "note",
    "useExistingAccountContactIndicator",
    "personFirstName",
    "personLastName",
    "personMiddleName",
    "personGenderCode",
    "personAcademicTitleCode",
    "personAdditionalAcademicTitleCode",
    "personContactAllowedCode",
    "contactCorrespondenceLanguageCode",
    "contactNotes",
    "companyName",
    "companySecondLineName",
    "companyThirdLineName",
    "companyFourthLineName",
    "companyContactAllowedCode",
    "accountNotes",
    "address",
    "prospectParty",
    "item",
    "event",
    "attachmentFolder",
    "extScore00163E04B6021EE2B4B0F30EF922D4F7",
    "brand",
    "yzExt",
    "mktWatermark",
    "committed",
    "onTime",
    "rrs",
    "requestbyTaskStatus",
    "sla",
    "totalTradelaneVolume",
    "tradelane",
    "volume"
})
public class MarketingLeadMaintainRequestBundle {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String changeStateID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ID")
    protected BusinessTransactionDocumentID id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "QualificationLevelCode")
    protected LeadQualificationLevelCode qualificationLevelCode;
    @XmlElement(name = "OriginTypeCode")
    protected CustomerTransactionDocumentOriginTypeCode originTypeCode;
    @XmlElement(name = "GroupCode")
    protected LeadGroupCode groupCode;
    @XmlElement(name = "StatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String statusCode;
    @XmlElement(name = "CampaignPredecessorReferenceID")
    protected BusinessTransactionDocumentID campaignPredecessorReferenceID;
    @XmlElement(name = "EmployeeInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String employeeInternalID;
    @XmlElement(name = "MarketingUnitInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String marketingUnitInternalID;
    @XmlElement(name = "SalesUnitInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesUnitInternalID;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "UseExistingAccountContactIndicator")
    protected Boolean useExistingAccountContactIndicator;
    @XmlElement(name = "PersonFirstName")
    protected String personFirstName;
    @XmlElement(name = "PersonLastName")
    protected String personLastName;
    @XmlElement(name = "PersonMiddleName")
    protected String personMiddleName;
    @XmlElement(name = "PersonGenderCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String personGenderCode;
    @XmlElement(name = "PersonAcademicTitleCode")
    protected AcademicTitleCode personAcademicTitleCode;
    @XmlElement(name = "PersonAdditionalAcademicTitleCode")
    protected AcademicTitleCode personAdditionalAcademicTitleCode;
    @XmlElement(name = "PersonContactAllowedCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String personContactAllowedCode;
    @XmlElement(name = "ContactCorrespondenceLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactCorrespondenceLanguageCode;
    @XmlElement(name = "ContactNotes")
    protected String contactNotes;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "CompanySecondLineName")
    protected String companySecondLineName;
    @XmlElement(name = "CompanyThirdLineName")
    protected String companyThirdLineName;
    @XmlElement(name = "CompanyFourthLineName")
    protected String companyFourthLineName;
    @XmlElement(name = "CompanyContactAllowedCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String companyContactAllowedCode;
    @XmlElement(name = "AccountNotes")
    protected String accountNotes;
    @XmlElement(name = "Address")
    protected MarketingLeadMaintainRequestBundleAddress address;
    @XmlElement(name = "ProspectParty")
    protected LeanLeadMaintainRequestBundleProspectParty prospectParty;
    @XmlElement(name = "Item")
    protected List<MarketingLeadMaintainRequestBundleItem> item;
    @XmlElement(name = "Event")
    protected List<MarketingLeadMaintainRequestBundleEvent> event;
    @XmlElement(name = "AttachmentFolder")
    protected MaintenanceAttachmentFolder attachmentFolder;
    @XmlElement(name = "EXTScore00163E04B6021EE2B4B0F30EF922D4F7", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected String extScore00163E04B6021EE2B4B0F30EF922D4F7;
    @XmlElement(name = "Brand", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String brand;
    @XmlElement(name = "YZExt", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected String yzExt;
    @XmlElement(name = "mkt_watermark", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected String mktWatermark;
    @XmlElement(name = "Committed", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected BigDecimal committed;
    @XmlElement(name = "OnTime", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected BigDecimal onTime;
    @XmlElement(name = "RRS", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rrs;
    @XmlElement(name = "RequestbyTaskStatus", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected BigDecimal requestbyTaskStatus;
    @XmlElement(name = "SLA", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected BigDecimal sla;
    @XmlElement(name = "TotalTradelaneVolume", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected BigDecimal totalTradelaneVolume;
    @XmlElement(name = "Tradelane", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tradelane;
    @XmlElement(name = "Volume", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected BigDecimal volume;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlAttribute(name = "itemListCompleteTransmissionIndicator")
    protected Boolean itemListCompleteTransmissionIndicator;
    @XmlAttribute(name = "EventListCompleteTransmissionIndicator")
    protected Boolean eventListCompleteTransmissionIndicator;

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
     * Gets the value of the changeStateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * Sets the value of the changeStateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
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
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setID(BusinessTransactionDocumentID value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the qualificationLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link LeadQualificationLevelCode }
     *     
     */
    public LeadQualificationLevelCode getQualificationLevelCode() {
        return qualificationLevelCode;
    }

    /**
     * Sets the value of the qualificationLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadQualificationLevelCode }
     *     
     */
    public void setQualificationLevelCode(LeadQualificationLevelCode value) {
        this.qualificationLevelCode = value;
    }

    /**
     * Gets the value of the originTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTransactionDocumentOriginTypeCode }
     *     
     */
    public CustomerTransactionDocumentOriginTypeCode getOriginTypeCode() {
        return originTypeCode;
    }

    /**
     * Sets the value of the originTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTransactionDocumentOriginTypeCode }
     *     
     */
    public void setOriginTypeCode(CustomerTransactionDocumentOriginTypeCode value) {
        this.originTypeCode = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link LeadGroupCode }
     *     
     */
    public LeadGroupCode getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadGroupCode }
     *     
     */
    public void setGroupCode(LeadGroupCode value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the campaignPredecessorReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getCampaignPredecessorReferenceID() {
        return campaignPredecessorReferenceID;
    }

    /**
     * Sets the value of the campaignPredecessorReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setCampaignPredecessorReferenceID(BusinessTransactionDocumentID value) {
        this.campaignPredecessorReferenceID = value;
    }

    /**
     * Gets the value of the employeeInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeInternalID() {
        return employeeInternalID;
    }

    /**
     * Sets the value of the employeeInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeInternalID(String value) {
        this.employeeInternalID = value;
    }

    /**
     * Gets the value of the marketingUnitInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingUnitInternalID() {
        return marketingUnitInternalID;
    }

    /**
     * Sets the value of the marketingUnitInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingUnitInternalID(String value) {
        this.marketingUnitInternalID = value;
    }

    /**
     * Gets the value of the salesUnitInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnitInternalID() {
        return salesUnitInternalID;
    }

    /**
     * Sets the value of the salesUnitInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnitInternalID(String value) {
        this.salesUnitInternalID = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the useExistingAccountContactIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseExistingAccountContactIndicator() {
        return useExistingAccountContactIndicator;
    }

    /**
     * Sets the value of the useExistingAccountContactIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseExistingAccountContactIndicator(Boolean value) {
        this.useExistingAccountContactIndicator = value;
    }

    /**
     * Gets the value of the personFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFirstName() {
        return personFirstName;
    }

    /**
     * Sets the value of the personFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFirstName(String value) {
        this.personFirstName = value;
    }

    /**
     * Gets the value of the personLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonLastName() {
        return personLastName;
    }

    /**
     * Sets the value of the personLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonLastName(String value) {
        this.personLastName = value;
    }

    /**
     * Gets the value of the personMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonMiddleName() {
        return personMiddleName;
    }

    /**
     * Sets the value of the personMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonMiddleName(String value) {
        this.personMiddleName = value;
    }

    /**
     * Gets the value of the personGenderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonGenderCode() {
        return personGenderCode;
    }

    /**
     * Sets the value of the personGenderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonGenderCode(String value) {
        this.personGenderCode = value;
    }

    /**
     * Gets the value of the personAcademicTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTitleCode }
     *     
     */
    public AcademicTitleCode getPersonAcademicTitleCode() {
        return personAcademicTitleCode;
    }

    /**
     * Sets the value of the personAcademicTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTitleCode }
     *     
     */
    public void setPersonAcademicTitleCode(AcademicTitleCode value) {
        this.personAcademicTitleCode = value;
    }

    /**
     * Gets the value of the personAdditionalAcademicTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTitleCode }
     *     
     */
    public AcademicTitleCode getPersonAdditionalAcademicTitleCode() {
        return personAdditionalAcademicTitleCode;
    }

    /**
     * Sets the value of the personAdditionalAcademicTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTitleCode }
     *     
     */
    public void setPersonAdditionalAcademicTitleCode(AcademicTitleCode value) {
        this.personAdditionalAcademicTitleCode = value;
    }

    /**
     * Gets the value of the personContactAllowedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonContactAllowedCode() {
        return personContactAllowedCode;
    }

    /**
     * Sets the value of the personContactAllowedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonContactAllowedCode(String value) {
        this.personContactAllowedCode = value;
    }

    /**
     * Gets the value of the contactCorrespondenceLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactCorrespondenceLanguageCode() {
        return contactCorrespondenceLanguageCode;
    }

    /**
     * Sets the value of the contactCorrespondenceLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactCorrespondenceLanguageCode(String value) {
        this.contactCorrespondenceLanguageCode = value;
    }

    /**
     * Gets the value of the contactNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNotes() {
        return contactNotes;
    }

    /**
     * Sets the value of the contactNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNotes(String value) {
        this.contactNotes = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companySecondLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanySecondLineName() {
        return companySecondLineName;
    }

    /**
     * Sets the value of the companySecondLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanySecondLineName(String value) {
        this.companySecondLineName = value;
    }

    /**
     * Gets the value of the companyThirdLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyThirdLineName() {
        return companyThirdLineName;
    }

    /**
     * Sets the value of the companyThirdLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyThirdLineName(String value) {
        this.companyThirdLineName = value;
    }

    /**
     * Gets the value of the companyFourthLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyFourthLineName() {
        return companyFourthLineName;
    }

    /**
     * Sets the value of the companyFourthLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyFourthLineName(String value) {
        this.companyFourthLineName = value;
    }

    /**
     * Gets the value of the companyContactAllowedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyContactAllowedCode() {
        return companyContactAllowedCode;
    }

    /**
     * Sets the value of the companyContactAllowedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyContactAllowedCode(String value) {
        this.companyContactAllowedCode = value;
    }

    /**
     * Gets the value of the accountNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNotes() {
        return accountNotes;
    }

    /**
     * Sets the value of the accountNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNotes(String value) {
        this.accountNotes = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingLeadMaintainRequestBundleAddress }
     *     
     */
    public MarketingLeadMaintainRequestBundleAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingLeadMaintainRequestBundleAddress }
     *     
     */
    public void setAddress(MarketingLeadMaintainRequestBundleAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the prospectParty property.
     * 
     * @return
     *     possible object is
     *     {@link LeanLeadMaintainRequestBundleProspectParty }
     *     
     */
    public LeanLeadMaintainRequestBundleProspectParty getProspectParty() {
        return prospectParty;
    }

    /**
     * Sets the value of the prospectParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeanLeadMaintainRequestBundleProspectParty }
     *     
     */
    public void setProspectParty(LeanLeadMaintainRequestBundleProspectParty value) {
        this.prospectParty = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingLeadMaintainRequestBundleItem }
     * 
     * 
     */
    public List<MarketingLeadMaintainRequestBundleItem> getItem() {
        if (item == null) {
            item = new ArrayList<MarketingLeadMaintainRequestBundleItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingLeadMaintainRequestBundleEvent }
     * 
     * 
     */
    public List<MarketingLeadMaintainRequestBundleEvent> getEvent() {
        if (event == null) {
            event = new ArrayList<MarketingLeadMaintainRequestBundleEvent>();
        }
        return this.event;
    }

    /**
     * Gets the value of the attachmentFolder property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public MaintenanceAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * Sets the value of the attachmentFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public void setAttachmentFolder(MaintenanceAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * Gets the value of the extScore00163E04B6021EE2B4B0F30EF922D4F7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTScore00163E04B6021EE2B4B0F30EF922D4F7() {
        return extScore00163E04B6021EE2B4B0F30EF922D4F7;
    }

    /**
     * Sets the value of the extScore00163E04B6021EE2B4B0F30EF922D4F7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTScore00163E04B6021EE2B4B0F30EF922D4F7(String value) {
        this.extScore00163E04B6021EE2B4B0F30EF922D4F7 = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the yzExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYZExt() {
        return yzExt;
    }

    /**
     * Sets the value of the yzExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYZExt(String value) {
        this.yzExt = value;
    }

    /**
     * Gets the value of the mktWatermark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktWatermark() {
        return mktWatermark;
    }

    /**
     * Sets the value of the mktWatermark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktWatermark(String value) {
        this.mktWatermark = value;
    }

    /**
     * Gets the value of the committed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommitted() {
        return committed;
    }

    /**
     * Sets the value of the committed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommitted(BigDecimal value) {
        this.committed = value;
    }

    /**
     * Gets the value of the onTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnTime() {
        return onTime;
    }

    /**
     * Sets the value of the onTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnTime(BigDecimal value) {
        this.onTime = value;
    }

    /**
     * Gets the value of the rrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRRS() {
        return rrs;
    }

    /**
     * Sets the value of the rrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRRS(String value) {
        this.rrs = value;
    }

    /**
     * Gets the value of the requestbyTaskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestbyTaskStatus() {
        return requestbyTaskStatus;
    }

    /**
     * Sets the value of the requestbyTaskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestbyTaskStatus(BigDecimal value) {
        this.requestbyTaskStatus = value;
    }

    /**
     * Gets the value of the sla property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSLA() {
        return sla;
    }

    /**
     * Sets the value of the sla property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSLA(BigDecimal value) {
        this.sla = value;
    }

    /**
     * Gets the value of the totalTradelaneVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTradelaneVolume() {
        return totalTradelaneVolume;
    }

    /**
     * Sets the value of the totalTradelaneVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTradelaneVolume(BigDecimal value) {
        this.totalTradelaneVolume = value;
    }

    /**
     * Gets the value of the tradelane property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradelane() {
        return tradelane;
    }

    /**
     * Sets the value of the tradelane property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradelane(String value) {
        this.tradelane = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
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

    /**
     * Gets the value of the itemListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemListCompleteTransmissionIndicator() {
        return itemListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the itemListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemListCompleteTransmissionIndicator(Boolean value) {
        this.itemListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the eventListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventListCompleteTransmissionIndicator() {
        return eventListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the eventListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventListCompleteTransmissionIndicator(Boolean value) {
        this.eventListCompleteTransmissionIndicator = value;
    }

}
