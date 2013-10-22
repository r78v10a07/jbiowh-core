//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.05 at 10:27:42 AM CEST 
//


package org.jbiowhcore.utility.fileformats.pride.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the components of the mass spectrometer used
 * 
 * <p>Java class for instrumentDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instrumentDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instrumentName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="source" type="{}paramType"/>
 *         &lt;element name="analyzerList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="analyzer" type="{}paramType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="detector" type="{}paramType"/>
 *         &lt;element name="additional" type="{}paramType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instrumentDescriptionType", propOrder = {
    "instrumentName",
    "source",
    "analyzerList",
    "detector",
    "additional"
})
public class InstrumentDescriptionType {

    @XmlElement(required = true)
    protected String instrumentName;
    @XmlElement(required = true)
    protected ParamType source;
    @XmlElement(required = true)
    protected InstrumentDescriptionType.AnalyzerList analyzerList;
    @XmlElement(required = true)
    protected ParamType detector;
    protected ParamType additional;

    /**
     * Gets the value of the instrumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentName() {
        return instrumentName;
    }

    /**
     * Sets the value of the instrumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentName(String value) {
        this.instrumentName = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ParamType }
     *     
     */
    public ParamType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamType }
     *     
     */
    public void setSource(ParamType value) {
        this.source = value;
    }

    /**
     * Gets the value of the analyzerList property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentDescriptionType.AnalyzerList }
     *     
     */
    public InstrumentDescriptionType.AnalyzerList getAnalyzerList() {
        return analyzerList;
    }

    /**
     * Sets the value of the analyzerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentDescriptionType.AnalyzerList }
     *     
     */
    public void setAnalyzerList(InstrumentDescriptionType.AnalyzerList value) {
        this.analyzerList = value;
    }

    /**
     * Gets the value of the detector property.
     * 
     * @return
     *     possible object is
     *     {@link ParamType }
     *     
     */
    public ParamType getDetector() {
        return detector;
    }

    /**
     * Sets the value of the detector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamType }
     *     
     */
    public void setDetector(ParamType value) {
        this.detector = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link ParamType }
     *     
     */
    public ParamType getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamType }
     *     
     */
    public void setAdditional(ParamType value) {
        this.additional = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="analyzer" type="{}paramType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "analyzer"
    })
    public static class AnalyzerList {

        @XmlElement(required = true)
        protected List<ParamType> analyzer;
        @XmlAttribute(name = "count", required = true)
        protected int count;

        /**
         * Gets the value of the analyzer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the analyzer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnalyzer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParamType }
         * 
         * 
         */
        public List<ParamType> getAnalyzer() {
            if (analyzer == null) {
                analyzer = new ArrayList<ParamType>();
            }
            return this.analyzer;
        }

        /**
         * Gets the value of the count property.
         * 
         */
        public int getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         */
        public void setCount(int value) {
            this.count = value;
        }

    }

}
