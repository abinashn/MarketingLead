
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.EmailURI;
import com.sap.xi.ap.common.gdt.Measure;
import com.sap.xi.ap.common.gdt.RegionCode;


/**
 * <p>Java class for MarketingLeadMaintainRequestBundleAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingLeadMaintainRequestBundleAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/>
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/>
 *         &lt;element name="StreetPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="AccountCounty" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="AccountStreetPrefix" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://sap.com/xi/AP/Common/GDT}StreetName" minOccurs="0"/>
 *         &lt;element name="AccountStreetSufix" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="HouseID" type="{http://sap.com/xi/AP/Common/GDT}HouseID" minOccurs="0"/>
 *         &lt;element name="AccountPOBoxID" type="{http://sap.com/xi/AP/Common/GDT}POBoxID" minOccurs="0"/>
 *         &lt;element name="AccountPhone" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/>
 *         &lt;element name="AccountFax" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/>
 *         &lt;element name="AccountWebsite" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/>
 *         &lt;element name="AccountLatitudeMeasure" type="{http://sap.com/xi/AP/Common/GDT}Measure" minOccurs="0"/>
 *         &lt;element name="AccountLongitudeMeasure" type="{http://sap.com/xi/AP/Common/GDT}Measure" minOccurs="0"/>
 *         &lt;element name="AccountCorrespondenceLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/>
 *         &lt;element name="TelephoneFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/>
 *         &lt;element name="MobileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/>
 *         &lt;element name="EmailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/>
 *         &lt;element name="ContactFunctionalTitleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="ContactDepartmentName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="ContactEMailUsageDeniedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingLeadMaintainRequestBundleAddress", propOrder = {
    "countryCode",
    "regionCode",
    "streetPostalCode",
    "cityName",
    "accountCounty",
    "accountStreetPrefix",
    "streetName",
    "accountStreetSufix",
    "houseID",
    "accountPOBoxID",
    "accountPhone",
    "accountFax",
    "accountWebsite",
    "accountLatitudeMeasure",
    "accountLongitudeMeasure",
    "accountCorrespondenceLanguageCode",
    "telephoneFormattedNumberDescription",
    "mobileFormattedNumberDescription",
    "emailURI",
    "contactFunctionalTitleName",
    "contactDepartmentName",
    "contactEMailUsageDeniedIndicator"
})
public class MarketingLeadMaintainRequestBundleAddress {

    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "StreetPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String streetPostalCode;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "AccountCounty")
    protected String accountCounty;
    @XmlElement(name = "AccountStreetPrefix")
    protected String accountStreetPrefix;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "AccountStreetSufix")
    protected String accountStreetSufix;
    @XmlElement(name = "HouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String houseID;
    @XmlElement(name = "AccountPOBoxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accountPOBoxID;
    @XmlElement(name = "AccountPhone")
    protected String accountPhone;
    @XmlElement(name = "AccountFax")
    protected String accountFax;
    @XmlElement(name = "AccountWebsite")
    protected String accountWebsite;
    @XmlElement(name = "AccountLatitudeMeasure")
    protected Measure accountLatitudeMeasure;
    @XmlElement(name = "AccountLongitudeMeasure")
    protected Measure accountLongitudeMeasure;
    @XmlElement(name = "AccountCorrespondenceLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accountCorrespondenceLanguageCode;
    @XmlElement(name = "TelephoneFormattedNumberDescription")
    protected String telephoneFormattedNumberDescription;
    @XmlElement(name = "MobileFormattedNumberDescription")
    protected String mobileFormattedNumberDescription;
    @XmlElement(name = "EmailURI")
    protected EmailURI emailURI;
    @XmlElement(name = "ContactFunctionalTitleName")
    protected String contactFunctionalTitleName;
    @XmlElement(name = "ContactDepartmentName")
    protected String contactDepartmentName;
    @XmlElement(name = "ContactEMailUsageDeniedIndicator")
    protected Boolean contactEMailUsageDeniedIndicator;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the streetPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPostalCode() {
        return streetPostalCode;
    }

    /**
     * Sets the value of the streetPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPostalCode(String value) {
        this.streetPostalCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the accountCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCounty() {
        return accountCounty;
    }

    /**
     * Sets the value of the accountCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCounty(String value) {
        this.accountCounty = value;
    }

    /**
     * Gets the value of the accountStreetPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStreetPrefix() {
        return accountStreetPrefix;
    }

    /**
     * Sets the value of the accountStreetPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStreetPrefix(String value) {
        this.accountStreetPrefix = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the accountStreetSufix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStreetSufix() {
        return accountStreetSufix;
    }

    /**
     * Sets the value of the accountStreetSufix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStreetSufix(String value) {
        this.accountStreetSufix = value;
    }

    /**
     * Gets the value of the houseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseID() {
        return houseID;
    }

    /**
     * Sets the value of the houseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseID(String value) {
        this.houseID = value;
    }

    /**
     * Gets the value of the accountPOBoxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPOBoxID() {
        return accountPOBoxID;
    }

    /**
     * Sets the value of the accountPOBoxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPOBoxID(String value) {
        this.accountPOBoxID = value;
    }

    /**
     * Gets the value of the accountPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPhone() {
        return accountPhone;
    }

    /**
     * Sets the value of the accountPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPhone(String value) {
        this.accountPhone = value;
    }

    /**
     * Gets the value of the accountFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFax() {
        return accountFax;
    }

    /**
     * Sets the value of the accountFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFax(String value) {
        this.accountFax = value;
    }

    /**
     * Gets the value of the accountWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountWebsite() {
        return accountWebsite;
    }

    /**
     * Sets the value of the accountWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountWebsite(String value) {
        this.accountWebsite = value;
    }

    /**
     * Gets the value of the accountLatitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getAccountLatitudeMeasure() {
        return accountLatitudeMeasure;
    }

    /**
     * Sets the value of the accountLatitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setAccountLatitudeMeasure(Measure value) {
        this.accountLatitudeMeasure = value;
    }

    /**
     * Gets the value of the accountLongitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getAccountLongitudeMeasure() {
        return accountLongitudeMeasure;
    }

    /**
     * Sets the value of the accountLongitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setAccountLongitudeMeasure(Measure value) {
        this.accountLongitudeMeasure = value;
    }

    /**
     * Gets the value of the accountCorrespondenceLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCorrespondenceLanguageCode() {
        return accountCorrespondenceLanguageCode;
    }

    /**
     * Sets the value of the accountCorrespondenceLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCorrespondenceLanguageCode(String value) {
        this.accountCorrespondenceLanguageCode = value;
    }

    /**
     * Gets the value of the telephoneFormattedNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneFormattedNumberDescription() {
        return telephoneFormattedNumberDescription;
    }

    /**
     * Sets the value of the telephoneFormattedNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneFormattedNumberDescription(String value) {
        this.telephoneFormattedNumberDescription = value;
    }

    /**
     * Gets the value of the mobileFormattedNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileFormattedNumberDescription() {
        return mobileFormattedNumberDescription;
    }

    /**
     * Sets the value of the mobileFormattedNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileFormattedNumberDescription(String value) {
        this.mobileFormattedNumberDescription = value;
    }

    /**
     * Gets the value of the emailURI property.
     * 
     * @return
     *     possible object is
     *     {@link EmailURI }
     *     
     */
    public EmailURI getEmailURI() {
        return emailURI;
    }

    /**
     * Sets the value of the emailURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailURI }
     *     
     */
    public void setEmailURI(EmailURI value) {
        this.emailURI = value;
    }

    /**
     * Gets the value of the contactFunctionalTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFunctionalTitleName() {
        return contactFunctionalTitleName;
    }

    /**
     * Sets the value of the contactFunctionalTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFunctionalTitleName(String value) {
        this.contactFunctionalTitleName = value;
    }

    /**
     * Gets the value of the contactDepartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDepartmentName() {
        return contactDepartmentName;
    }

    /**
     * Sets the value of the contactDepartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDepartmentName(String value) {
        this.contactDepartmentName = value;
    }

    /**
     * Gets the value of the contactEMailUsageDeniedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactEMailUsageDeniedIndicator() {
        return contactEMailUsageDeniedIndicator;
    }

    /**
     * Sets the value of the contactEMailUsageDeniedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactEMailUsageDeniedIndicator(Boolean value) {
        this.contactEMailUsageDeniedIndicator = value;
    }

}
