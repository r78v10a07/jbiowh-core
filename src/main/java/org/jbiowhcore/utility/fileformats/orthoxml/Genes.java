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
 * 				A gene element represents a list of genes.
 * 			
 * 
 * <p>Java class for genes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gene" type="{http://orthoXML.org/2011/}gene" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genes", propOrder = {
    "gene"
})
public class Genes {

    @XmlElement(required = true)
    protected List<Gene> gene;

    /**
     * Gets the value of the gene property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gene property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGene().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gene }
     * 
     * 
     */
    public List<Gene> getGene() {
        if (gene == null) {
            gene = new ArrayList<Gene>();
        }
        return this.gene;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        
        if (gene != null){
            for(Gene d : gene){
                b.append("\t\t").append(d).append("\n");
            }
        }
        return b.toString();
    }
}
