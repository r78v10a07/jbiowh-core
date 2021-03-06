//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.07 at 02:11:31 PM CET 
//


package org.jbiowhcore.utility.fileformats.orthoxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A list of score definitions.
 * 			
 * 
 * <p>Java class for scores complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scores">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scoreDef" type="{http://orthoXML.org/2011/}scoreDef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scores", propOrder = {
    "scoreDef"
})
public class Scores {

    @XmlElement(required = true)
    protected List<ScoreDef> scoreDef;

    /**
     * Gets the value of the scoreDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreDef }
     * 
     * 
     */
    public List<ScoreDef> getScoreDef() {
        if (scoreDef == null) {
            scoreDef = new ArrayList<>();
        }
        return this.scoreDef;
    }

}
