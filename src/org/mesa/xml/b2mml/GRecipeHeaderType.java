//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.10 at 09:10:55 AM CET 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GRecipeHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRecipeHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DerivedFromID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}ProductInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="HeaderProperty" type="{http://www.mesa.org/xml/B2MML}HeaderPropertyType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}GRecipeHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRecipeHeaderType", propOrder = {
    "description",
    "derivedFromID",
    "productInformation",
    "effectiveDate",
    "expirationDate",
    "headerProperty"
})
public class GRecipeHeaderType {

    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "DerivedFromID")
    protected IdentifierType derivedFromID;
    @XmlElements({
        @XmlElement(name = "ProductID", type = IdentifierType.class),
        @XmlElement(name = "Description", type = DescriptionType.class),
        @XmlElement(name = "ProductName", type = NameType.class),
        @XmlElement(name = "BatchSize", type = ValueType.class)
    })
    protected List<Object> productInformation;
    @XmlElement(name = "EffectiveDate")
    protected DateTimeType effectiveDate;
    @XmlElement(name = "ExpirationDate")
    protected DateTimeType expirationDate;
    @XmlElement(name = "HeaderProperty")
    protected HeaderPropertyType headerProperty;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the derivedFromID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDerivedFromID() {
        return derivedFromID;
    }

    /**
     * Sets the value of the derivedFromID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDerivedFromID(IdentifierType value) {
        this.derivedFromID = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * {@link DescriptionType }
     * {@link NameType }
     * {@link ValueType }
     * 
     * 
     */
    public List<Object> getProductInformation() {
        if (productInformation == null) {
            productInformation = new ArrayList<Object>();
        }
        return this.productInformation;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveDate(DateTimeType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setExpirationDate(DateTimeType value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the headerProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderPropertyType }
     *     
     */
    public HeaderPropertyType getHeaderProperty() {
        return headerProperty;
    }

    /**
     * Sets the value of the headerProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderPropertyType }
     *     
     */
    public void setHeaderProperty(HeaderPropertyType value) {
        this.headerProperty = value;
    }

}
