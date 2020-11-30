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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ChannelTopicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelTopicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelURI" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ChannelDescription" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Topic" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="TopicDescription" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageSpec" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelTopicType", propOrder = {
    "channelURI",
    "channelDescription",
    "topic",
    "topicDescription",
    "messageSpec"
})
public class ChannelTopicType {

    @XmlElement(name = "ChannelURI", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String channelURI;
    @XmlElement(name = "ChannelDescription")
    protected List<TextType> channelDescription;
    @XmlElement(name = "Topic", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String topic;
    @XmlElement(name = "TopicDescription")
    protected List<TextType> topicDescription;
    @XmlElement(name = "MessageSpec")
    protected List<TextType> messageSpec;

    /**
     * Gets the value of the channelURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelURI() {
        return channelURI;
    }

    /**
     * Sets the value of the channelURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelURI(String value) {
        this.channelURI = value;
    }

    /**
     * Gets the value of the channelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getChannelDescription() {
        if (channelDescription == null) {
            channelDescription = new ArrayList<TextType>();
        }
        return this.channelDescription;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the topicDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getTopicDescription() {
        if (topicDescription == null) {
            topicDescription = new ArrayList<TextType>();
        }
        return this.topicDescription;
    }

    /**
     * Gets the value of the messageSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getMessageSpec() {
        if (messageSpec == null) {
            messageSpec = new ArrayList<TextType>();
        }
        return this.messageSpec;
    }

}
