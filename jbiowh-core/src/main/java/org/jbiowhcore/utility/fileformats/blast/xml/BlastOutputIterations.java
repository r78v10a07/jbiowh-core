//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.17 at 10:10:12 AM CET 
//
package org.jbiowhcore.utility.fileformats.blast.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iteration"
})
@XmlRootElement(name = "BlastOutput_iterations")
public class BlastOutputIterations {

    @XmlElement(name = "Iteration")
    protected List<Iteration> iteration;

    /**
     * Gets the value of the iteration property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the iteration property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIteration().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Iteration }
     *
     *
     * @return
     */
    public List<Iteration> getIteration() {
        if (iteration == null) {
            iteration = new ArrayList<>();
        }
        return this.iteration;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        
        if (iteration != null){
            for(Iteration i : iteration){
                b.append("\t").append(i).append("\n");
            }
        }
        
        return "BlastOutputIterations{" + b.toString();
    }

}
