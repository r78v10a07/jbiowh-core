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
 * This id the Domain XML parser class
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aa"
})
@XmlRootElement(name = "domain")
public class Ddomain {

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
    @XmlAttribute(name = "expect")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String expect;
    @XmlAttribute(name = "mh")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mh;
    @XmlAttribute(name = "delta")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String delta;
    @XmlAttribute(name = "hyperscore")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hyperscore;
    @XmlAttribute(name = "nextscore")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nextscore;
    @XmlAttribute(name = "y_score")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y_score;
    @XmlAttribute(name = "y_ions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y_ions;
    @XmlAttribute(name = "b_score")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String b_score;
    @XmlAttribute(name = "b_ions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String b_ions;
    @XmlAttribute(name = "pre")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pre;
    @XmlAttribute(name = "post")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String post;
    @XmlAttribute(name = "seq")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String seq;
    @XmlAttribute(name = "missed_cleavages")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String missed_cleavages;
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

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    public String getMh() {
        return mh;
    }

    public void setMh(String mh) {
        this.mh = mh;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public String getHyperscore() {
        return hyperscore;
    }

    public void setHyperscore(String hyperscore) {
        this.hyperscore = hyperscore;
    }

    public String getNextscore() {
        return nextscore;
    }

    public void setNextscore(String nextscore) {
        this.nextscore = nextscore;
    }

    public String getY_score() {
        return y_score;
    }

    public void setY_score(String y_score) {
        this.y_score = y_score;
    }

    public String getY_ions() {
        return y_ions;
    }

    public void setY_ions(String y_ions) {
        this.y_ions = y_ions;
    }

    public String getB_score() {
        return b_score;
    }

    public void setB_score(String b_score) {
        this.b_score = b_score;
    }

    public String getB_ions() {
        return b_ions;
    }

    public void setB_ions(String b_ions) {
        this.b_ions = b_ions;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getMissed_cleavages() {
        return missed_cleavages;
    }

    public void setMissed_cleavages(String missed_cleavages) {
        this.missed_cleavages = missed_cleavages;
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
            b.append("\t\t\t\t\t").append(n).append("\n");
        }
        return "Ddomain{" + "state=" + state + ", label=" + label + ", id=" + id + ", start=" + start 
                + ", end=" + end + ", expect=" + expect + ", mh=" + mh + ", delta=" + delta 
                + ", hyperscore=" + hyperscore + ", nextscore=" + nextscore + ", y_score=" 
                + y_score + ", y_ions=" + y_ions + ", b_score=" + b_score + ", b_ions=" 
                + b_ions + ", pre=" + pre + ", post=" + post + ", seq=" + seq 
                + ", missed_cleavages=" + missed_cleavages + "}\n" + b.toString();
    }

    
}
