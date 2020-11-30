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
 * 
 * The spatial definition provides a means of communicating zero-dimensional point, one-dimensional line,
 * or two-dimensional shape or three-dimensional solid geospatial location data for planning/scheduling,
 * actuals, resources, and analytics.
 * Spatial definition identifies a value and the predefined coordinate reference system.
 * 			
 * 
 * <p>Java class for SpatialDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpatialDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.mesa.org/xml/B2MML}TextType"/>
 *         &lt;element name="Format" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionFormatType"/>
 *         &lt;element name="SRID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="SRIDAuthority" type="{http://www.mesa.org/xml/B2MML}TextType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}SpatialDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialDefinitionType", propOrder = {
    "value",
    "format",
    "srid",
    "sridAuthority"
})
public class SpatialDefinitionType {

    @XmlElement(name = "Value", required = true)
    protected TextType value;
    @XmlElement(name = "Format", required = true)
    protected SpatialDefinitionFormatType format;
    @XmlElement(name = "SRID")
    protected IdentifierType srid;
    @XmlElement(name = "SRIDAuthority")
    protected TextType sridAuthority;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setValue(TextType value) {
        this.value = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialDefinitionFormatType }
     *     
     */
    public SpatialDefinitionFormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialDefinitionFormatType }
     *     
     */
    public void setFormat(SpatialDefinitionFormatType value) {
        this.format = value;
    }

    /**
     * Gets the value of the srid property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSRID() {
        return srid;
    }

    /**
     * Sets the value of the srid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSRID(IdentifierType value) {
        this.srid = value;
    }

    /**
     * Gets the value of the sridAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSRIDAuthority() {
        return sridAuthority;
    }

    /**
     * Sets the value of the sridAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSRIDAuthority(TextType value) {
        this.sridAuthority = value;
    }

}
