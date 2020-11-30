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
 * <p>Java class for OperationsEventClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationsEventClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.mesa.org/xml/B2MML}OperationsEventExtensionType" minOccurs="0"/>
 *         &lt;element name="OperationsEventClassChild" type="{http://www.mesa.org/xml/B2MML}OperationsEventClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventClassBaseID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventClassProperty" type="{http://www.mesa.org/xml/B2MML}OperationsEventClassPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventDefinitionSourceID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpsEventClassRecordSpecification" type="{http://www.mesa.org/xml/B2MML}OperationsRecordSpecTemplateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsEventClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsEventClassType", propOrder = {
    "id",
    "description",
    "version",
    "publishedDate",
    "effectiveStartDate",
    "effectiveEndDate",
    "hierarchyScope",
    "extension",
    "operationsEventClassChild",
    "operationsEventClassBaseID",
    "operationsEventClassProperty",
    "operationsEventDefinitionSourceID",
    "opsEventClassRecordSpecification"
})
public class OperationsEventClassType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Version")
    protected IdentifierType version;
    @XmlElement(name = "PublishedDate")
    protected DateTimeType publishedDate;
    @XmlElement(name = "EffectiveStartDate")
    protected DateTimeType effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected DateTimeType effectiveEndDate;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "Extension")
    protected OperationsEventExtensionType extension;
    @XmlElement(name = "OperationsEventClassChild")
    protected List<OperationsEventClassType> operationsEventClassChild;
    @XmlElement(name = "OperationsEventClassBaseID")
    protected List<IdentifierType> operationsEventClassBaseID;
    @XmlElement(name = "OperationsEventClassProperty")
    protected List<OperationsEventClassPropertyType> operationsEventClassProperty;
    @XmlElement(name = "OperationsEventDefinitionSourceID")
    protected List<IdentifierType> operationsEventDefinitionSourceID;
    @XmlElement(name = "OpsEventClassRecordSpecification")
    protected List<OperationsRecordSpecTemplateType> opsEventClassRecordSpecification;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setVersion(IdentifierType value) {
        this.version = value;
    }

    /**
     * Gets the value of the publishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPublishedDate() {
        return publishedDate;
    }

    /**
     * Sets the value of the publishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPublishedDate(DateTimeType value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveStartDate(DateTimeType value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveEndDate(DateTimeType value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the hierarchyScope property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyScopeType }
     *     
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * Sets the value of the hierarchyScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyScopeType }
     *     
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link OperationsEventExtensionType }
     *     
     */
    public OperationsEventExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsEventExtensionType }
     *     
     */
    public void setExtension(OperationsEventExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the operationsEventClassChild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventClassChild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventClassChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventClassType }
     * 
     * 
     */
    public List<OperationsEventClassType> getOperationsEventClassChild() {
        if (operationsEventClassChild == null) {
            operationsEventClassChild = new ArrayList<OperationsEventClassType>();
        }
        return this.operationsEventClassChild;
    }

    /**
     * Gets the value of the operationsEventClassBaseID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventClassBaseID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventClassBaseID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getOperationsEventClassBaseID() {
        if (operationsEventClassBaseID == null) {
            operationsEventClassBaseID = new ArrayList<IdentifierType>();
        }
        return this.operationsEventClassBaseID;
    }

    /**
     * Gets the value of the operationsEventClassProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventClassProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventClassProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventClassPropertyType }
     * 
     * 
     */
    public List<OperationsEventClassPropertyType> getOperationsEventClassProperty() {
        if (operationsEventClassProperty == null) {
            operationsEventClassProperty = new ArrayList<OperationsEventClassPropertyType>();
        }
        return this.operationsEventClassProperty;
    }

    /**
     * Gets the value of the operationsEventDefinitionSourceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventDefinitionSourceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventDefinitionSourceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getOperationsEventDefinitionSourceID() {
        if (operationsEventDefinitionSourceID == null) {
            operationsEventDefinitionSourceID = new ArrayList<IdentifierType>();
        }
        return this.operationsEventDefinitionSourceID;
    }

    /**
     * Gets the value of the opsEventClassRecordSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opsEventClassRecordSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpsEventClassRecordSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsRecordSpecTemplateType }
     * 
     * 
     */
    public List<OperationsRecordSpecTemplateType> getOpsEventClassRecordSpecification() {
        if (opsEventClassRecordSpecification == null) {
            opsEventClassRecordSpecification = new ArrayList<OperationsRecordSpecTemplateType>();
        }
        return this.opsEventClassRecordSpecification;
    }

}
