//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.07 at 02:11:31 PM CET 
//
package org.jbiowhcore.utility.fileformats.orthoxml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * The species element contains all sequences of one species.
 *
 *
 * <p>
 * Java class for species complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="species">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="database" type="{http://orthoXML.org/2011/}database" maxOccurs="unbounded"/>
 *         &lt;element name="notes" type="{http://orthoXML.org/2011/}notes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NCBITaxId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "species", propOrder = {
    "database",
    "notes"
})
public class Species {

    @XmlElement(required = true)
    protected List<Database> database;
    protected Notes notes;
    @XmlAttribute(name = "NCBITaxId", required = true)
    protected BigInteger ncbiTaxId;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Gets the value of the database property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the database property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabase().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Database }
     *
     *
     */
    public List<Database> getDatabase() {
        if (database == null) {
            database = new ArrayList<>();
        }
        return this.database;
    }

    /**
     * Gets the value of the notes property.
     *
     * @return possible object is {@link Notes }
     *
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     *
     * @param value allowed object is {@link Notes }
     *
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the ncbiTaxId property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getNCBITaxId() {
        return ncbiTaxId;
    }

    /**
     * Sets the value of the ncbiTaxId property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setNCBITaxId(BigInteger value) {
        this.ncbiTaxId = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        
        if (database != null){
            for(Database d : database){
                b.append("\t").append(d).append("\n");
            }
        }
        return "Species{" + "ncbiTaxId=" + ncbiTaxId + ", name=" + name + "}\n"
                + b.toString();
    }
}
