package org.jbiowhcore.utility.utils;

/**
 * This Class is a message transporter
 *
 * $Author$ $LastChangedDate$ $LastChangedRevision$
 *
 * @since Jan 3, 2014
 */
public class JBioWHMessage {

    private String message;
    private Integer value;
    private static JBioWHMessage singleton;

    private JBioWHMessage() {
    }

    /**
     * Return a JBioWHMessage instance
     *
     * @return a JBioWHMessage instance
     */
    public static synchronized JBioWHMessage getInstance() {
        if (singleton == null) {
            singleton = new JBioWHMessage();
        }
        return singleton;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void increaseValue() {
        value++;
    }
}
