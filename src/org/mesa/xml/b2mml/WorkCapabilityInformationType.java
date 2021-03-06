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
 * <p>Java class for WorkCapabilityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkCapabilityInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="WorkCapability" type="{http://www.mesa.org/xml/B2MML}WorkCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkMasterCapability" type="{http://www.mesa.org/xml/B2MML}WorkMasterCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkCapabilityInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkCapabilityInformationType", propOrder = {
    "id",
    "description",
    "hierarchyScope",
    "publishedDate",
    "workCapability",
    "workMasterCapability"
})
public class WorkCapabilityInformationType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description", nillable = true)
    protected List<DescriptionType> description;
    @XmlElementRef(name = "HierarchyScope", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<HierarchyScopeType> hierarchyScope;
    @XmlElementRef(name = "PublishedDate", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> publishedDate;
    @XmlElement(name = "WorkCapability", nillable = true)
    protected List<WorkCapabilityType> workCapability;
    @XmlElement(name = "WorkMasterCapability", nillable = true)
    protected List<WorkMasterCapabilityType> workMasterCapability;

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
     * Gets the value of the hierarchyScope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HierarchyScopeType }{@code >}
     *     
     */
    public JAXBElement<HierarchyScopeType> getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * Sets the value of the hierarchyScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HierarchyScopeType }{@code >}
     *     
     */
    public void setHierarchyScope(JAXBElement<HierarchyScopeType> value) {
        this.hierarchyScope = value;
    }

    /**
     * Gets the value of the publishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getPublishedDate() {
        return publishedDate;
    }

    /**
     * Sets the value of the publishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setPublishedDate(JAXBElement<DateTimeType> value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the workCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCapabilityType }
     * 
     * 
     */
    public List<WorkCapabilityType> getWorkCapability() {
        if (workCapability == null) {
            workCapability = new ArrayList<WorkCapabilityType>();
        }
        return this.workCapability;
    }

    /**
     * Gets the value of the workMasterCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workMasterCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkMasterCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkMasterCapabilityType }
     * 
     * 
     */
    public List<WorkMasterCapabilityType> getWorkMasterCapability() {
        if (workMasterCapability == null) {
            workMasterCapability = new ArrayList<WorkMasterCapabilityType>();
        }
        return this.workMasterCapability;
    }

}
