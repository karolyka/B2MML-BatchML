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
import javax.xml.datatype.Duration;


/**
 * <p>Java class for TestSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="PublishedEndDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="TestSampleSize" type="{http://www.mesa.org/xml/B2MML}ValueType" minOccurs="0"/>
 *         &lt;element name="RecurrenceQuantity" type="{http://www.mesa.org/xml/B2MML}ValueType" minOccurs="0"/>
 *         &lt;element name="RecurrenceTimeInterval" type="{http://www.mesa.org/xml/B2MML}DurationType" minOccurs="0"/>
 *         &lt;element name="PhysicalSampleRequired" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="TestSpecificationChild" type="{http://www.mesa.org/xml/B2MML}TestSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecificationProperty" type="{http://www.mesa.org/xml/B2MML}TestSpecificationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecificationCriteria" type="{http://www.mesa.org/xml/B2MML}TestSpecificationCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EvaluatedProperty" type="{http://www.mesa.org/xml/B2MML}TestSpecificationEvaluatedPropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="OperationsTestRequirementID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TestableObjectID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}TestSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSpecificationType", propOrder = {
    "id",
    "description",
    "version",
    "publishedEndDate",
    "effectiveStartDate",
    "effectiveEndDate",
    "hierarchyScope",
    "testSampleSize",
    "recurrenceQuantity",
    "recurrenceTimeInterval",
    "physicalSampleRequired",
    "testSpecificationChild",
    "testSpecificationProperty",
    "testSpecificationCriteria",
    "evaluatedProperty",
    "operationsTestRequirementID",
    "testableObjectID"
})
public class TestSpecificationType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Version")
    protected IdentifierType version;
    @XmlElement(name = "PublishedEndDate")
    protected DateTimeType publishedEndDate;
    @XmlElement(name = "EffectiveStartDate")
    protected DateTimeType effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected DateTimeType effectiveEndDate;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "TestSampleSize")
    protected ValueType testSampleSize;
    @XmlElement(name = "RecurrenceQuantity")
    protected ValueType recurrenceQuantity;
    @XmlElement(name = "RecurrenceTimeInterval")
    protected Duration recurrenceTimeInterval;
    @XmlElement(name = "PhysicalSampleRequired")
    protected Boolean physicalSampleRequired;
    @XmlElement(name = "TestSpecificationChild")
    protected List<TestSpecificationType> testSpecificationChild;
    @XmlElement(name = "TestSpecificationProperty")
    protected List<TestSpecificationPropertyType> testSpecificationProperty;
    @XmlElement(name = "TestSpecificationCriteria")
    protected List<TestSpecificationCriteriaType> testSpecificationCriteria;
    @XmlElement(name = "EvaluatedProperty", required = true)
    protected List<TestSpecificationEvaluatedPropertyType> evaluatedProperty;
    @XmlElement(name = "OperationsTestRequirementID")
    protected IdentifierType operationsTestRequirementID;
    @XmlElement(name = "TestableObjectID")
    protected IdentifierType testableObjectID;

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
     * Gets the value of the publishedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPublishedEndDate() {
        return publishedEndDate;
    }

    /**
     * Sets the value of the publishedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPublishedEndDate(DateTimeType value) {
        this.publishedEndDate = value;
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
     * Gets the value of the testSampleSize property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getTestSampleSize() {
        return testSampleSize;
    }

    /**
     * Sets the value of the testSampleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setTestSampleSize(ValueType value) {
        this.testSampleSize = value;
    }

    /**
     * Gets the value of the recurrenceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getRecurrenceQuantity() {
        return recurrenceQuantity;
    }

    /**
     * Sets the value of the recurrenceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setRecurrenceQuantity(ValueType value) {
        this.recurrenceQuantity = value;
    }

    /**
     * Gets the value of the recurrenceTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRecurrenceTimeInterval() {
        return recurrenceTimeInterval;
    }

    /**
     * Sets the value of the recurrenceTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRecurrenceTimeInterval(Duration value) {
        this.recurrenceTimeInterval = value;
    }

    /**
     * Gets the value of the physicalSampleRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysicalSampleRequired() {
        return physicalSampleRequired;
    }

    /**
     * Sets the value of the physicalSampleRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysicalSampleRequired(Boolean value) {
        this.physicalSampleRequired = value;
    }

    /**
     * Gets the value of the testSpecificationChild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecificationChild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecificationChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationType }
     * 
     * 
     */
    public List<TestSpecificationType> getTestSpecificationChild() {
        if (testSpecificationChild == null) {
            testSpecificationChild = new ArrayList<TestSpecificationType>();
        }
        return this.testSpecificationChild;
    }

    /**
     * Gets the value of the testSpecificationProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecificationProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecificationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationPropertyType }
     * 
     * 
     */
    public List<TestSpecificationPropertyType> getTestSpecificationProperty() {
        if (testSpecificationProperty == null) {
            testSpecificationProperty = new ArrayList<TestSpecificationPropertyType>();
        }
        return this.testSpecificationProperty;
    }

    /**
     * Gets the value of the testSpecificationCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecificationCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecificationCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationCriteriaType }
     * 
     * 
     */
    public List<TestSpecificationCriteriaType> getTestSpecificationCriteria() {
        if (testSpecificationCriteria == null) {
            testSpecificationCriteria = new ArrayList<TestSpecificationCriteriaType>();
        }
        return this.testSpecificationCriteria;
    }

    /**
     * Gets the value of the evaluatedProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluatedProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluatedProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationEvaluatedPropertyType }
     * 
     * 
     */
    public List<TestSpecificationEvaluatedPropertyType> getEvaluatedProperty() {
        if (evaluatedProperty == null) {
            evaluatedProperty = new ArrayList<TestSpecificationEvaluatedPropertyType>();
        }
        return this.evaluatedProperty;
    }

    /**
     * Gets the value of the operationsTestRequirementID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOperationsTestRequirementID() {
        return operationsTestRequirementID;
    }

    /**
     * Sets the value of the operationsTestRequirementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOperationsTestRequirementID(IdentifierType value) {
        this.operationsTestRequirementID = value;
    }

    /**
     * Gets the value of the testableObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getTestableObjectID() {
        return testableObjectID;
    }

    /**
     * Sets the value of the testableObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setTestableObjectID(IdentifierType value) {
        this.testableObjectID = value;
    }

}
