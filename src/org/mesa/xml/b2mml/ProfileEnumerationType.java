//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.10 at 09:10:55 AM CET 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileEnumerationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileEnumerationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InformationObjectName" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="ElementName" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DefinedValue" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}TextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileEnumerationType", propOrder = {
    "informationObjectName",
    "elementName",
    "definedValue",
    "description"
})
public class ProfileEnumerationType {

    @XmlElement(name = "InformationObjectName", required = true)
    protected IdentifierType informationObjectName;
    @XmlElement(name = "ElementName", required = true)
    protected IdentifierType elementName;
    @XmlElement(name = "DefinedValue", required = true)
    protected IdentifierType definedValue;
    @XmlElement(name = "Description", required = true)
    protected TextType description;

    /**
     * Gets the value of the informationObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getInformationObjectName() {
        return informationObjectName;
    }

    /**
     * Sets the value of the informationObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setInformationObjectName(IdentifierType value) {
        this.informationObjectName = value;
    }

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setElementName(IdentifierType value) {
        this.elementName = value;
    }

    /**
     * Gets the value of the definedValue property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDefinedValue() {
        return definedValue;
    }

    /**
     * Sets the value of the definedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDefinedValue(IdentifierType value) {
        this.definedValue = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDescription(TextType value) {
        this.description = value;
    }

}
