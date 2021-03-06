//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.10 at 09:10:55 AM CET 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyMeasurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyMeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestableObjectPropertyID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeasurementDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.mesa.org/xml/B2MML}ValueType" minOccurs="0"/>
 *         &lt;element name="Expiration" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="WorkDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}PropertyMeasurement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyMeasurementType", propOrder = {
    "id",
    "description",
    "testableObjectPropertyID",
    "measurementDate",
    "value",
    "expiration",
    "workDefinitionID"
})
public class PropertyMeasurementType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description", nillable = true)
    protected List<DescriptionType> description;
    @XmlElement(name = "TestableObjectPropertyID")
    protected List<IdentifierType> testableObjectPropertyID;
    @XmlElementRef(name = "MeasurementDate", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> measurementDate;
    @XmlElementRef(name = "Value", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<ValueType> value;
    @XmlElementRef(name = "Expiration", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> expiration;
    @XmlElementRef(name = "WorkDefinitionID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifierType> workDefinitionID;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

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
     * Gets the value of the testableObjectPropertyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testableObjectPropertyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestableObjectPropertyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getTestableObjectPropertyID() {
        if (testableObjectPropertyID == null) {
            testableObjectPropertyID = new ArrayList<IdentifierType>();
        }
        return this.testableObjectPropertyID;
    }

    /**
     * Gets the value of the measurementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getMeasurementDate() {
        return measurementDate;
    }

    /**
     * Sets the value of the measurementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setMeasurementDate(JAXBElement<DateTimeType> value) {
        this.measurementDate = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValueType }{@code >}
     *     
     */
    public JAXBElement<ValueType> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValueType }{@code >}
     *     
     */
    public void setValue(JAXBElement<ValueType> value) {
        this.value = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setExpiration(JAXBElement<DateTimeType> value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the workDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     *     
     */
    public JAXBElement<IdentifierType> getWorkDefinitionID() {
        return workDefinitionID;
    }

    /**
     * Sets the value of the workDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     *     
     */
    public void setWorkDefinitionID(JAXBElement<IdentifierType> value) {
        this.workDefinitionID = value;
    }

}
