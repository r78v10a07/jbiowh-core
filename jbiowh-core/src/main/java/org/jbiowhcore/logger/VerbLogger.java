package org.jbiowhcore.logger;

import java.io.PrintStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This Class is to handled the system message globally
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate: 2012-10-03 22:11:05 +0200
 * (Wed, 03 Oct 2012) $ $LastChangedRevision: 515 $
 * @since Jun 17, 2011
 */
public class VerbLogger {

    private static final transient Logger logger = LoggerFactory.getLogger(VerbLogger.class);
    private static VerbLogger singleton;

    /**
     * Return a VerbLogger
     *
     * @return a VerbLogger
     */
    public static synchronized VerbLogger getInstance() {
        if (singleton == null) {
            singleton = new VerbLogger();
        }
        return singleton;
    }

    /**
     * Return the logger
     * @return the logger
     */
    public static Logger getLogger() {
        return logger;
    }
    /**
     * This is the info message information level
     */
    public final int INFO = 1;
    /**
     * This is the debug message information level
     */
    public final int DEBUG = 2;
    /**
     * This is the error message information level
     */
    public final int ERROR = 3;
    /**
     * This is the error message information level
     */
    public final int NONE = 0;
    private int level = 0;
    private int initialLevel = 0;
    private PrintStream output = System.out;

    private VerbLogger() {
    }

    /**
     * Creates a formated logger message
     *
     * @param classToLog class where the log is called
     * @param msg message to be printed
     */
    public void log(Class classToLog, String msg) {
        switch (level) {
            case (INFO): {
                LoggerFactory.getLogger(classToLog).info(msg);
                break;
            }
            case (DEBUG): {
                LoggerFactory.getLogger(classToLog).debug(msg);
                break;
            }
            case (ERROR): {
                LoggerFactory.getLogger(classToLog).error(msg);
                break;
            }
        }
    }

    /**
     * Print the object reference
     *
     * @param o the object to be printed
     */
    public void printObjectReference(Object o) {
        output.println("Reference: " + mimicObjectToString(o));
    }

    /**
     * Return the reference for this object
     *
     * @param o the object to get the reference
     * @return the reference for this object
     */
    public String mimicObjectToString(Object o) {
        String result = null;
        if (o != null) {
            result = o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
        }
        return result;
    }

    /**
     * Return the PrintStream used to print the messages
     *
     * @return A PrintStream object
     */
    public PrintStream getOutput() {
        return output;
    }

    /**
     * Set the PrintStream who will be used to print the messages
     *
     * @param output a PrintStream object
     */
    public void setOutput(PrintStream output) {
        this.output = output;
    }

    /**
     * Return the information level to print the messages
     *
     * @return An integer 0 not message printing, 1 info level and 2 debug level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Set the information level to print the messages
     *
     * @param level a integer with values 0 (do nothing), 1 (info), 2 (debug)
     */
    public void setLevel(int level) {
        switch (level) {
            case (ERROR): {
                output = System.err;
                break;
            }
            default: {
                output = System.out;
                break;
            }
        }
        this.level = level;
        if (initialLevel == 0) {
            initialLevel = level;
        }
    }

    /**
     * Return the initial information level to print the messages
     *
     * @return An integer 0 not message printing, 1 info level and 2 debug level
     */
    public int getInitialLevel() {
        return initialLevel;
    }

}
