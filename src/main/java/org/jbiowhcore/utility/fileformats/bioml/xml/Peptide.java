//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.04 at 12:26:35 PM CEST 
//
package org.jbiowhcore.utility.fileformats.bioml.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {   
    "domain",
    "aa"
})
@XmlRootElement(name = "peptide")
public class Peptide {

    @XmlAttribute(name = "state")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String state;
    @XmlAttribute(name = "label")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String label;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "start")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String start;
    @XmlAttribute(name = "end")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String end;
    protected List<Ddomain> domain;
    protected List<Aa> aa;

    /**
     * Gets the value of the state property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the start property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEnd(String value) {
        this.end = value;
    }

    public List<Ddomain> getDomain() {
        if (domain == null){
            domain = new ArrayList();
        }
        return domain;
    }

    public void setDomain(List<Ddomain> domain) {
        this.domain = domain;
    }

    public List<Aa> getAa() {
        if (aa == null) {
            aa = new ArrayList();
        }
        return aa;
    }

    public void setAa(List<Aa> aa) {
        this.aa = aa;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        for (Aa n : getAa()) {
            b.append("\t\t\t\t").append(n).append("\n");
        }
        for (Ddomain n : getDomain()) {
            b.append("\t\t\t\t").append(n).append("\n");
        }
        return "Peptide{" + "state=" + state + ", label=" + label + ", id=" + id + ", start=" 
                + start + ", end=" + end + "}\n" + b.toString();
    }
}
