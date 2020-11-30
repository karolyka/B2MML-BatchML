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
 * <p>Java class for TransReceiverType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransReceiverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ComponentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransReceiverType", propOrder = {
    "logicalID",
    "componentID",
    "id"
})
public class TransReceiverType {

    @XmlElement(name = "LogicalID")
    protected IdentifierType logicalID;
    @XmlElement(name = "ComponentID")
    protected IdentifierType componentID;
    @XmlElement(name = "ID")
    protected List<IdentifierType> id;

    /**
     * Gets the value of the logicalID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getLogicalID() {
        return logicalID;
    }

    /**
     * Sets the value of the logicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setLogicalID(IdentifierType value) {
        this.logicalID = value;
    }

    /**
     * Gets the value of the componentID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getComponentID() {
        return componentID;
    }

    /**
     * Sets the value of the componentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setComponentID(IdentifierType value) {
        this.componentID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getID() {
        if (id == null) {
            id = new ArrayList<IdentifierType>();
        }
        return this.id;
    }

}
