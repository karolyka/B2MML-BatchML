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
 * <p>Java class for MasterRecipeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterRecipeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="VersionDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://www.mesa.org/xml/B2MML}HeaderType" minOccurs="0"/>
 *         &lt;element name="EquipmentRequirement" type="{http://www.mesa.org/xml/B2MML}BatchEquipmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Formula" type="{http://www.mesa.org/xml/B2MML}FormulaType" minOccurs="0"/>
 *         &lt;element name="ProcedureLogic" type="{http://www.mesa.org/xml/B2MML}ProcedureLogicType" minOccurs="0"/>
 *         &lt;element name="RecipeElement" type="{http://www.mesa.org/xml/B2MML}RecipeElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherInformation" type="{http://www.mesa.org/xml/B2MML}OtherInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}MasterRecipe" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterRecipeType", propOrder = {
    "id",
    "version",
    "versionDate",
    "description",
    "header",
    "equipmentRequirement",
    "formula",
    "procedureLogic",
    "recipeElement",
    "otherInformation"
})
public class MasterRecipeType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Version")
    protected IdentifierType version;
    @XmlElement(name = "VersionDate")
    protected DateTimeType versionDate;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Header")
    protected HeaderType header;
    @XmlElement(name = "EquipmentRequirement")
    protected List<BatchEquipmentRequirementType> equipmentRequirement;
    @XmlElement(name = "Formula")
    protected FormulaType formula;
    @XmlElement(name = "ProcedureLogic")
    protected ProcedureLogicType procedureLogic;
    @XmlElement(name = "RecipeElement")
    protected List<RecipeElementType> recipeElement;
    @XmlElement(name = "OtherInformation")
    protected List<OtherInformationType> otherInformation;

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
     * Gets the value of the versionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getVersionDate() {
        return versionDate;
    }

    /**
     * Sets the value of the versionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setVersionDate(DateTimeType value) {
        this.versionDate = value;
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
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the equipmentRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchEquipmentRequirementType }
     * 
     * 
     */
    public List<BatchEquipmentRequirementType> getEquipmentRequirement() {
        if (equipmentRequirement == null) {
            equipmentRequirement = new ArrayList<BatchEquipmentRequirementType>();
        }
        return this.equipmentRequirement;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link FormulaType }
     *     
     */
    public FormulaType getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaType }
     *     
     */
    public void setFormula(FormulaType value) {
        this.formula = value;
    }

    /**
     * Gets the value of the procedureLogic property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureLogicType }
     *     
     */
    public ProcedureLogicType getProcedureLogic() {
        return procedureLogic;
    }

    /**
     * Sets the value of the procedureLogic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureLogicType }
     *     
     */
    public void setProcedureLogic(ProcedureLogicType value) {
        this.procedureLogic = value;
    }

    /**
     * Gets the value of the recipeElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipeElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipeElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeElementType }
     * 
     * 
     */
    public List<RecipeElementType> getRecipeElement() {
        if (recipeElement == null) {
            recipeElement = new ArrayList<RecipeElementType>();
        }
        return this.recipeElement;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherInformationType }
     * 
     * 
     */
    public List<OtherInformationType> getOtherInformation() {
        if (otherInformation == null) {
            otherInformation = new ArrayList<OtherInformationType>();
        }
        return this.otherInformation;
    }

}
