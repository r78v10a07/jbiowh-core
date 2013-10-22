package org.jbiowhcore.utility.constrains;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This Class is the JPL constrains to perform dynamic searches
 *
 * $Author: r78v10a07@gmail.com $
 * $LastChangedDate: 2013-03-19 09:38:47 +0100 (Tue, 19 Mar 2013) $
 * $LastChangedRevision: 396 $
 * @since Aug 3, 2011
 */
public class JPLConstrains {

    private List constrains;
    private List<String> operation;
    private List<String> extOperation;

    /**
     * Create constrains using its parameters
     *
     * @param constrains array of object constrains
     * @param operation array of strings with the operation
     * @param extOperation array of strings with the logical operation between
     * constrains
     */
    public JPLConstrains(List constrains, List<String> operation, List<String> extOperation) {
        this.constrains = constrains;
        this.operation = operation;
        this.extOperation = extOperation;
    }

    /**
     * Create an empty constrain
     *
     */
    public JPLConstrains() {
        constrains = new ArrayList();
        operation = new ArrayList();
        extOperation = new ArrayList();
    }    

    public Object getConstrainObject(int index) {
        if (constrains.get(index) instanceof Collection) {
            if (((Collection) constrains.get(index)).isEmpty()) {
                return constrains.get(index);
            } else {
                return ((Collection) constrains.get(index)).iterator().next();
            }
        }
        return constrains.get(index);
    }

    /**
     * Get the constrains
     *
     * @return an List object with the constrains
     */
    public List getConstrains() {
        return constrains;
    }

    /**
     * Set the constrains
     *
     * @param constrains a List object with the constrains
     */
    public void setConstrains(List constrains) {
        this.constrains = constrains;
    }

    /**
     * Get the Operation over constrain
     *
     * @return a List object
     */
    public List<String> getOperation() {
        return operation;
    }

    /**
     * Get the operation between constrains
     *
     * @return a List object
     */
    public List<String> getExtOperation() {
        return extOperation;
    }

    /**
     * Return the JPLConstrain object in a String format
     *
     * @return a String object
     */
    @Override
    public String toString() {
        return "JPLConstrains{" + "constrains=" + constrains + "\noperation=" + operation + "\nlogOperConstrains=" + extOperation + '}';
    }
}
