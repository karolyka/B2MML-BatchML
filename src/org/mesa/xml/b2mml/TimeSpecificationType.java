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
 * <p>Java class for TimeSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relative" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="OffsetTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSpecificationType", propOrder = {
    "relative",
    "offsetTime"
})
public class TimeSpecificationType {

    @XmlElement(name = "Relative")
    protected Boolean relative;
    @XmlElement(name = "OffsetTime")
    protected DateTimeType offsetTime;

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelative(Boolean value) {
        this.relative = value;
    }

    /**
     * Gets the value of the offsetTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOffsetTime() {
        return offsetTime;
    }

    /**
     * Sets the value of the offsetTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setOffsetTime(DateTimeType value) {
        this.offsetTime = value;
    }

}
