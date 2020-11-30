//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.10 at 09:10:55 AM CET 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * The hierarchy scope identifies where the exchanged information fits within the role-based equipment hierarchy.
 * It defines the scope of the exchanged information, such as a site or area for which the information is relevant.
 * The hierarchy scope identifies the associated instance in the role-based equipment hierarchy.
 * 			
 * 
 * <p>Java class for HierarchyScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HierarchyScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;choice>
 *           &lt;element name="EquipmentElementLevel" type="{http://www.mesa.org/xml/B2MML}EquipmentLevelType"/>
 *           &lt;element name="EquipmentLevel" type="{http://www.mesa.org/xml/B2MML}EquipmentLevelType"/>
 *         &lt;/choice>
 *         &lt;element name="HierarchyScopeChild" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}HierarchyScope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyScopeType", propOrder = {
    "equipmentID",
    "equipmentElementLevel",
    "equipmentLevel",
    "hierarchyScopeChild"
})
public class HierarchyScopeType {

    @XmlElement(name = "EquipmentID", required = true)
    protected IdentifierType equipmentID;
    @XmlElement(name = "EquipmentElementLevel")
    protected EquipmentLevelType equipmentElementLevel;
    @XmlElement(name = "EquipmentLevel")
    protected EquipmentLevelType equipmentLevel;
    @XmlElement(name = "HierarchyScopeChild")
    protected HierarchyScopeType hierarchyScopeChild;

    /**
     * Gets the value of the equipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getEquipmentID() {
        return equipmentID;
    }

    /**
     * Sets the value of the equipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setEquipmentID(IdentifierType value) {
        this.equipmentID = value;
    }

    /**
     * Gets the value of the equipmentElementLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentLevelType }
     *     
     */
    public EquipmentLevelType getEquipmentElementLevel() {
        return equipmentElementLevel;
    }

    /**
     * Sets the value of the equipmentElementLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentLevelType }
     *     
     */
    public void setEquipmentElementLevel(EquipmentLevelType value) {
        this.equipmentElementLevel = value;
    }

    /**
     * Gets the value of the equipmentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentLevelType }
     *     
     */
    public EquipmentLevelType getEquipmentLevel() {
        return equipmentLevel;
    }

    /**
     * Sets the value of the equipmentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentLevelType }
     *     
     */
    public void setEquipmentLevel(EquipmentLevelType value) {
        this.equipmentLevel = value;
    }

    /**
     * Gets the value of the hierarchyScopeChild property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyScopeType }
     *     
     */
    public HierarchyScopeType getHierarchyScopeChild() {
        return hierarchyScopeChild;
    }

    /**
     * Sets the value of the hierarchyScopeChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyScopeType }
     *     
     */
    public void setHierarchyScopeChild(HierarchyScopeType value) {
        this.hierarchyScopeChild = value;
    }

}
