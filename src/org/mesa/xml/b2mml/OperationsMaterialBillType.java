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
 * <p>Java class for OperationsMaterialBillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationsMaterialBillType">
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
 *         &lt;element name="UseType" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="OperationsMaterialBillItem" type="{http://www.mesa.org/xml/B2MML}OperationsMaterialBillItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillOfMaterialsID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsMaterialBill" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsMaterialBillType", propOrder = {
    "id",
    "description",
    "version",
    "publishedDate",
    "effectiveStartDate",
    "effectiveEndDate",
    "hierarchyScope",
    "useType",
    "operationsMaterialBillItem",
    "billOfMaterialsID"
})
public class OperationsMaterialBillType {

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
    @XmlElement(name = "UseType")
    protected CodeType useType;
    @XmlElement(name = "OperationsMaterialBillItem")
    protected List<OperationsMaterialBillItemType> operationsMaterialBillItem;
    @XmlElement(name = "BillOfMaterialsID")
    protected List<IdentifierType> billOfMaterialsID;

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
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUseType(CodeType value) {
        this.useType = value;
    }

    /**
     * Gets the value of the operationsMaterialBillItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsMaterialBillItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsMaterialBillItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsMaterialBillItemType }
     * 
     * 
     */
    public List<OperationsMaterialBillItemType> getOperationsMaterialBillItem() {
        if (operationsMaterialBillItem == null) {
            operationsMaterialBillItem = new ArrayList<OperationsMaterialBillItemType>();
        }
        return this.operationsMaterialBillItem;
    }

    /**
     * Gets the value of the billOfMaterialsID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billOfMaterialsID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillOfMaterialsID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getBillOfMaterialsID() {
        if (billOfMaterialsID == null) {
            billOfMaterialsID = new ArrayList<IdentifierType>();
        }
        return this.billOfMaterialsID;
    }

}