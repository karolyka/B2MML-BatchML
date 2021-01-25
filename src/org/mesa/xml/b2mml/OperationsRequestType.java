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
 * <p>Java class for OperationsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.mesa.org/xml/B2MML}PriorityType" minOccurs="0"/>
 *         &lt;element name="RequestState" type="{http://www.mesa.org/xml/B2MML}RequestStateType" minOccurs="0"/>
 *         &lt;element name="OperationsDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="OperationsSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="SegmentRequirement" type="{http://www.mesa.org/xml/B2MML}OpSegmentRequirementType" maxOccurs="unbounded"/>
 *         &lt;element name="RequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML}OpSegmentResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsRequestType", propOrder = {
    "id",
    "description",
    "version",
    "startTime",
    "endTime",
    "hierarchyScope",
    "operationsType",
    "priority",
    "requestState",
    "operationsDefinitionID",
    "operationsSegmentID",
    "segmentRequirement",
    "requestedSegmentResponse",
    "requiredByRequestedSegmentResponse"
})
public class OperationsRequestType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Version")
    protected IdentifierType version;
    @XmlElement(name = "StartTime")
    protected DateTimeType startTime;
    @XmlElement(name = "EndTime")
    protected DateTimeType endTime;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "OperationsType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "Priority")
    protected PriorityType priority;
    @XmlElement(name = "RequestState")
    protected RequestStateType requestState;
    @XmlElement(name = "OperationsDefinitionID")
    protected IdentifierType operationsDefinitionID;
    @XmlElement(name = "OperationsSegmentID")
    protected IdentifierType operationsSegmentID;
    @XmlElement(name = "SegmentRequirement", required = true)
    protected List<OpSegmentRequirementType> segmentRequirement;
    @XmlElement(name = "RequestedSegmentResponse")
    protected List<OpSegmentResponseType> requestedSegmentResponse;
    @XmlElement(name = "RequiredByRequestedSegmentResponse")
    protected RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;

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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setStartTime(DateTimeType value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEndTime(DateTimeType value) {
        this.endTime = value;
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
     * Gets the value of the operationsType property.
     * 
     * @return
     *     possible object is
     *     {@link OperationsTypeType }
     *     
     */
    public OperationsTypeType getOperationsType() {
        return operationsType;
    }

    /**
     * Sets the value of the operationsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsTypeType }
     *     
     */
    public void setOperationsType(OperationsTypeType value) {
        this.operationsType = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setPriority(PriorityType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the requestState property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStateType }
     *     
     */
    public RequestStateType getRequestState() {
        return requestState;
    }

    /**
     * Sets the value of the requestState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStateType }
     *     
     */
    public void setRequestState(RequestStateType value) {
        this.requestState = value;
    }

    /**
     * Gets the value of the operationsDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOperationsDefinitionID() {
        return operationsDefinitionID;
    }

    /**
     * Sets the value of the operationsDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOperationsDefinitionID(IdentifierType value) {
        this.operationsDefinitionID = value;
    }

    /**
     * Gets the value of the operationsSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOperationsSegmentID() {
        return operationsSegmentID;
    }

    /**
     * Sets the value of the operationsSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOperationsSegmentID(IdentifierType value) {
        this.operationsSegmentID = value;
    }

    /**
     * Gets the value of the segmentRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpSegmentRequirementType }
     * 
     * 
     */
    public List<OpSegmentRequirementType> getSegmentRequirement() {
        if (segmentRequirement == null) {
            segmentRequirement = new ArrayList<OpSegmentRequirementType>();
        }
        return this.segmentRequirement;
    }

    /**
     * Gets the value of the requestedSegmentResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedSegmentResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedSegmentResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpSegmentResponseType }
     * 
     * 
     */
    public List<OpSegmentResponseType> getRequestedSegmentResponse() {
        if (requestedSegmentResponse == null) {
            requestedSegmentResponse = new ArrayList<OpSegmentResponseType>();
        }
        return this.requestedSegmentResponse;
    }

    /**
     * Gets the value of the requiredByRequestedSegmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredByRequestedSegmentResponseType }
     *     
     */
    public RequiredByRequestedSegmentResponseType getRequiredByRequestedSegmentResponse() {
        return requiredByRequestedSegmentResponse;
    }

    /**
     * Sets the value of the requiredByRequestedSegmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredByRequestedSegmentResponseType }
     *     
     */
    public void setRequiredByRequestedSegmentResponse(RequiredByRequestedSegmentResponseType value) {
        this.requiredByRequestedSegmentResponse = value;
    }

}