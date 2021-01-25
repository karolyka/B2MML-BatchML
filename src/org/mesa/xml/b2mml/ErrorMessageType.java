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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThrownFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeStamp" type="{http://www.mesa.org/xml/B2MML}DateTimeType"/>
 *         &lt;element name="ErrorType" type="{http://www.mesa.org/xml/B2MML}ErrorTypeType"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CausedBy" type="{http://www.mesa.org/xml/B2MML}ErrorMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorMessageType", propOrder = {
    "errorDescription",
    "thrownFrom",
    "timeStamp",
    "errorType",
    "errorCode",
    "causedBy"
})
public class ErrorMessageType {

    @XmlElement(name = "ErrorDescription")
    protected List<String> errorDescription;
    @XmlElement(name = "ThrownFrom", required = true)
    protected String thrownFrom;
    @XmlElement(name = "TimeStamp", required = true)
    protected DateTimeType timeStamp;
    @XmlElement(name = "ErrorType", required = true)
    protected ErrorTypeType errorType;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "CausedBy")
    protected ErrorMessageType causedBy;

    /**
     * Gets the value of the errorDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorDescription() {
        if (errorDescription == null) {
            errorDescription = new ArrayList<String>();
        }
        return this.errorDescription;
    }

    /**
     * Gets the value of the thrownFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThrownFrom() {
        return thrownFrom;
    }

    /**
     * Sets the value of the thrownFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThrownFrom(String value) {
        this.thrownFrom = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setTimeStamp(DateTimeType value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorTypeType }
     *     
     */
    public ErrorTypeType getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorTypeType }
     *     
     */
    public void setErrorType(ErrorTypeType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the causedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getCausedBy() {
        return causedBy;
    }

    /**
     * Sets the value of the causedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     */
    public void setCausedBy(ErrorMessageType value) {
        this.causedBy = value;
    }

}