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
 * <p>Java class for TransRespondType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransRespondType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalApplicationArea" type="{http://www.mesa.org/xml/B2MML}TransApplicationAreaType" minOccurs="0"/>
 *         &lt;element name="ResponseCriteria" type="{http://www.mesa.org/xml/B2MML}TransResponseCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransRespondType", propOrder = {
    "originalApplicationArea",
    "responseCriteria"
})
public class TransRespondType {

    @XmlElement(name = "OriginalApplicationArea")
    protected TransApplicationAreaType originalApplicationArea;
    @XmlElement(name = "ResponseCriteria")
    protected List<TransResponseCriteriaType> responseCriteria;

    /**
     * Gets the value of the originalApplicationArea property.
     * 
     * @return
     *     possible object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public TransApplicationAreaType getOriginalApplicationArea() {
        return originalApplicationArea;
    }

    /**
     * Sets the value of the originalApplicationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public void setOriginalApplicationArea(TransApplicationAreaType value) {
        this.originalApplicationArea = value;
    }

    /**
     * Gets the value of the responseCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransResponseCriteriaType }
     * 
     * 
     */
    public List<TransResponseCriteriaType> getResponseCriteria() {
        if (responseCriteria == null) {
            responseCriteria = new ArrayList<TransResponseCriteriaType>();
        }
        return this.responseCriteria;
    }

}
