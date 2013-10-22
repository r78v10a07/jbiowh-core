package org.jbiowhcore.basic;

import java.util.Objects;

/**
 * This class storage the User basic data
 *
 * $Author$ $LastChangedDate$ $LastChangedRevision$
 *
 * @since Oct 7, 2013
 */
public class JBioWHUserData {

    private String driver;
    private String url;
    private String user;
    private String passwd;
    private boolean jbiowhSchema;
    private boolean connected;

    /**
     * Creates the User basic data
     *
     * @param driver the connection driver (com.mysql.jdbc.Driver)
     * @param url the connection URL (jdbc:mysql://<host>:3306/<database>)
     * @param user the database user
     * @param passwd the database password
     * @param jbiowhSchema
     */
    public JBioWHUserData(String driver, String url, String user, String passwd, boolean jbiowhSchema) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.passwd = passwd;
        this.jbiowhSchema = jbiowhSchema;
    }

    /**
     * Return true if the JBioWH is connected
     * @return
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Set true if the JBioWH is connected
     * @param connected
     */
    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    /**
     * Is a JBioWH main schema
     *
     * @return true if it is a JBioWH main schema
     */
    public boolean isJbiowhSchema() {
        return jbiowhSchema;
    }

    /**
     * Set as a JBioWH main schema
     *
     * @param jbiowhSchema true if it is a JBioWH main schema
     */
    public void setJbiowhSchema(boolean jbiowhSchema) {
        this.jbiowhSchema = jbiowhSchema;
    }

    /**
     * Get the driver
     *
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Set the driver
     *
     * @param driver the driver
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * Get the URL
     *
     * @return the URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the URL
     *
     * @param url the URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get the user
     *
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * Set the user
     *
     * @param user the user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Get the password
     *
     * @return the password
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Set the password
     *
     * @param passwd the password
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    /**
     * Return the URL without the jdbc:// prefix
     *
     * @return the URL without the jdbc:// prefix
     */
    public String getMainURLParsed() {
        return getUrl().substring(getUrl().indexOf("//") + 2);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JBioWHUserData other = (JBioWHUserData) obj;
        if (!Objects.equals(this.driver, other.driver)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.passwd, other.passwd)) {
            return false;
        }
        return this.jbiowhSchema == other.jbiowhSchema;
    }

}
