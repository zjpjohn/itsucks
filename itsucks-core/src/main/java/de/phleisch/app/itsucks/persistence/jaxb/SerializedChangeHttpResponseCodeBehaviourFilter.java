//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.05.22 at 10:37:28 PM GMT 
//


package de.phleisch.app.itsucks.persistence.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://itsucks.sourceforge.net/ItSucksJobSchema}serializedJobFilter">
 *       &lt;sequence>
 *         &lt;element ref="{http://itsucks.sourceforge.net/ItSucksJobSchema}serializedHttpResponseCodeBehaviourHostConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serializedHttpResponseCodeBehaviourHostConfig"
})
@XmlRootElement(name = "serializedChangeHttpResponseCodeBehaviourFilter")
public class SerializedChangeHttpResponseCodeBehaviourFilter
    extends SerializedJobFilter
{

    protected List<SerializedHttpResponseCodeBehaviourHostConfig> serializedHttpResponseCodeBehaviourHostConfig;

    /**
     * Gets the value of the serializedHttpResponseCodeBehaviourHostConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serializedHttpResponseCodeBehaviourHostConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerializedHttpResponseCodeBehaviourHostConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerializedHttpResponseCodeBehaviourHostConfig }
     * 
     * 
     */
    public List<SerializedHttpResponseCodeBehaviourHostConfig> getSerializedHttpResponseCodeBehaviourHostConfig() {
        if (serializedHttpResponseCodeBehaviourHostConfig == null) {
            serializedHttpResponseCodeBehaviourHostConfig = new ArrayList<SerializedHttpResponseCodeBehaviourHostConfig>();
        }
        return this.serializedHttpResponseCodeBehaviourHostConfig;
    }

}
