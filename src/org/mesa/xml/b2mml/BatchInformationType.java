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
 * <p>Java class for BatchInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListHeader" type="{http://www.mesa.org/xml/B2MML}ListHeaderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MasterRecipe" type="{http://www.mesa.org/xml/B2MML}MasterRecipeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ControlRecipe" type="{http://www.mesa.org/xml/B2MML}ControlRecipeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecipeBuildingBlock" type="{http://www.mesa.org/xml/B2MML}RecipeBuildingBlockType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentElement" type="{http://www.mesa.org/xml/B2MML}EquipmentElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BatchList" type="{http://www.mesa.org/xml/B2MML}BatchListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EnumerationSet" type="{http://www.mesa.org/xml/B2MML}EnumerationSetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}BatchInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchInformationType", propOrder = {
    "listHeader",
    "description",
    "masterRecipe",
    "controlRecipe",
    "recipeBuildingBlock",
    "equipmentElement",
    "batchList",
    "enumerationSet"
})
public class BatchInformationType {

    @XmlElement(name = "ListHeader")
    protected List<ListHeaderType> listHeader;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "MasterRecipe")
    protected List<MasterRecipeType> masterRecipe;
    @XmlElement(name = "ControlRecipe")
    protected List<ControlRecipeType> controlRecipe;
    @XmlElement(name = "RecipeBuildingBlock")
    protected List<RecipeBuildingBlockType> recipeBuildingBlock;
    @XmlElement(name = "EquipmentElement")
    protected List<EquipmentElementType> equipmentElement;
    @XmlElement(name = "BatchList")
    protected List<BatchListType> batchList;
    @XmlElement(name = "EnumerationSet")
    protected List<EnumerationSetType> enumerationSet;

    /**
     * Gets the value of the listHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListHeaderType }
     * 
     * 
     */
    public List<ListHeaderType> getListHeader() {
        if (listHeader == null) {
            listHeader = new ArrayList<ListHeaderType>();
        }
        return this.listHeader;
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
     * Gets the value of the masterRecipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterRecipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterRecipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterRecipeType }
     * 
     * 
     */
    public List<MasterRecipeType> getMasterRecipe() {
        if (masterRecipe == null) {
            masterRecipe = new ArrayList<MasterRecipeType>();
        }
        return this.masterRecipe;
    }

    /**
     * Gets the value of the controlRecipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlRecipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlRecipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlRecipeType }
     * 
     * 
     */
    public List<ControlRecipeType> getControlRecipe() {
        if (controlRecipe == null) {
            controlRecipe = new ArrayList<ControlRecipeType>();
        }
        return this.controlRecipe;
    }

    /**
     * Gets the value of the recipeBuildingBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipeBuildingBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipeBuildingBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeBuildingBlockType }
     * 
     * 
     */
    public List<RecipeBuildingBlockType> getRecipeBuildingBlock() {
        if (recipeBuildingBlock == null) {
            recipeBuildingBlock = new ArrayList<RecipeBuildingBlockType>();
        }
        return this.recipeBuildingBlock;
    }

    /**
     * Gets the value of the equipmentElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentElementType }
     * 
     * 
     */
    public List<EquipmentElementType> getEquipmentElement() {
        if (equipmentElement == null) {
            equipmentElement = new ArrayList<EquipmentElementType>();
        }
        return this.equipmentElement;
    }

    /**
     * Gets the value of the batchList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchListType }
     * 
     * 
     */
    public List<BatchListType> getBatchList() {
        if (batchList == null) {
            batchList = new ArrayList<BatchListType>();
        }
        return this.batchList;
    }

    /**
     * Gets the value of the enumerationSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationSetType }
     * 
     * 
     */
    public List<EnumerationSetType> getEnumerationSet() {
        if (enumerationSet == null) {
            enumerationSet = new ArrayList<EnumerationSetType>();
        }
        return this.enumerationSet;
    }

}
