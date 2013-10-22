package org.jbiowhcore.utility.fileformats.sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.jbiowhcore.logger.VerbLogger;

/**
 * This Class is the
 *
 * $Author$ $LastChangedDate$ $LastChangedRevision$
 *
 * @since Oct 9, 2013
 */
public class JBioWHSQLParser {

    private static JBioWHSQLParser singleton;

    private JBioWHSQLParser() {
    }

    /**
     * Return a JBioWHSQLParser instance
     *
     * @return a JBioWHSQLParser instance
     */
    public static synchronized JBioWHSQLParser getInstance() {
        if (singleton == null) {
            singleton = new JBioWHSQLParser();
        }
        return singleton;
    }

    /**
     * Get all SQL sentences
     *
     * @param f The SQL file to be parsed
     * @return a list of SQL sentences
     */
    public List<String> getAllSQL(File f) {
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            return getAllSQL(reader);
        } catch (FileNotFoundException ex) {
            VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
        } catch (IOException ex) {
            VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
        }
        return new ArrayList<>();
    }
    
    /**
     * Get all SQL sentences
     *
     * @param in The SQL InputStream to be parsed
     * @return a list of SQL sentences
     */
    public List<String> getAllSQL(InputStream in) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            return getAllSQL(reader);
        } catch (FileNotFoundException ex) {
            VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
        } catch (IOException ex) {
            VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
        }
        return new ArrayList<>();
    }

    /**
     * Get all SQL sentences
     *
     * @param reader The SQL reader to be parsed
     * @return a list of SQL sentences
     */
    public List<String> getAllSQL(BufferedReader reader) {
        String line;
        List<String> sentences = new ArrayList<>();
        try {
            StringBuilder text = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith("--")) {
                    text.append(line);
                }
            }
            for (String sentence : text.toString().split(";")) {
                String sql = sentence.trim();
                if (!sql.isEmpty()) {
                    sentences.add(sql);
                }
            }
        } catch (IOException ex) {
            VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
        }
        return sentences;
    }
}
