package org.jbiowhcore.utility.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This Class is to print time
 *
 * $Author: r78v10a07@gmail.com $
 * $LastChangedDate: 2012-10-03 22:11:05 +0200 (Wed, 03 Oct 2012) $
 * $LastChangedRevision: 270 $
 * @since Aug 7, 2012
 */
public class BioWHTime {

    private static BioWHTime singleton;

    /**
     * Return a BioWHTime
     *
     * @return a BioWHTime
     */
    public static synchronized BioWHTime getInstance() {
        if (singleton == null) {
            singleton = new BioWHTime();
        }
        return singleton;
    }

    private BioWHTime() {
    }

    public String currentTime() {
        return (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date());
    }

    public String currentTime(String format) {
        return (new SimpleDateFormat(format)).format(new Date());
    }
}
