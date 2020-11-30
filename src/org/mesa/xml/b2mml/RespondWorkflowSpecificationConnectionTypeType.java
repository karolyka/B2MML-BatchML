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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RespondWorkflowSpecificationConnectionTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondWorkflowSpecificationConnectionTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Respond" type="{http://www.mesa.org/xml/B2MML}TransRespondType"/>
 *                   &lt;element name="WorkflowSpecificationConnectionType" type="{http://www.mesa.org/xml/B2MML}WorkflowSpecificationConnectionTypeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="releaseID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="versionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondWorkflowSpecificationConnectionTypeType", propOrder = {
    "applicationArea",
    "dataArea"
})
public class RespondWorkflowSpecificationConnectionTypeType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected RespondWorkflowSpecificationConnectionTypeType.DataArea dataArea;
    @XmlAttribute(name = "releaseID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String releaseID;
    @XmlAttribute(name = "versionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String versionID;

    /**
     * Gets the value of the applicationArea property.
     * 
     * @return
     *     possible object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public TransApplicationAreaType getApplicationArea() {
        return applicationArea;
    }

    /**
     * Sets the value of the applicationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public void setApplicationArea(TransApplicationAreaType value) {
        this.applicationArea = value;
    }

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link RespondWorkflowSpecificationConnectionTypeType.DataArea }
     *     
     */
    public RespondWorkflowSpecificationConnectionTypeType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondWorkflowSpecificationConnectionTypeType.DataArea }
     *     
     */
    public void setDataArea(RespondWorkflowSpecificationConnectionTypeType.DataArea value) {
        this.dataArea = value;
    }

    /**
     * Gets the value of the releaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseID() {
        return releaseID;
    }

    /**
     * Sets the value of the releaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the versionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Respond" type="{http://www.mesa.org/xml/B2MML}TransRespondType"/>
     *         &lt;element name="WorkflowSpecificationConnectionType" type="{http://www.mesa.org/xml/B2MML}WorkflowSpecificationConnectionTypeType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "respond",
        "workflowSpecificationConnectionType"
    })
    public static class DataArea {

        @XmlElement(name = "Respond", required = true)
        protected TransRespondType respond;
        @XmlElement(name = "WorkflowSpecificationConnectionType", required = true)
        protected List<WorkflowSpecificationConnectionTypeType> workflowSpecificationConnectionType;

        /**
         * Gets the value of the respond property.
         * 
         * @return
         *     possible object is
         *     {@link TransRespondType }
         *     
         */
        public TransRespondType getRespond() {
            return respond;
        }

        /**
         * Sets the value of the respond property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransRespondType }
         *     
         */
        public void setRespond(TransRespondType value) {
            this.respond = value;
        }

        /**
         * Gets the value of the workflowSpecificationConnectionType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workflowSpecificationConnectionType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkflowSpecificationConnectionType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WorkflowSpecificationConnectionTypeType }
         * 
         * 
         */
        public List<WorkflowSpecificationConnectionTypeType> getWorkflowSpecificationConnectionType() {
            if (workflowSpecificationConnectionType == null) {
                workflowSpecificationConnectionType = new ArrayList<WorkflowSpecificationConnectionTypeType>();
            }
            return this.workflowSpecificationConnectionType;
        }

    }

}
