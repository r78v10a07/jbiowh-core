package org.jbiowhcore.utility.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.jbiowhcore.logger.VerbLogger;

/**
 * This Class is handled the TSV files to parse data sources
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate: 2013-03-19 09:38:47 +0100
 * (Tue, 19 Mar 2013) $ $LastChangedRevision: 591 $
 *
 * @since Jun 15, 2011
 */
public class ParseFiles {

    private String tempdirectory;
    private Map filesmap;
    private Collection fileStream;
    private static ParseFiles singleton;

    private ParseFiles() {
    }

    /**
     * Return a ParseFiles
     *
     * @return a ParseFiles
     */
    public static synchronized ParseFiles getInstance() {
        if (singleton == null) {
            singleton = new ParseFiles();
        }
        return singleton;
    }

    /**
     * Start the Parser files factory setting the temporal directory and the
     * list of files names
     *
     * @param filesNames a List of files names to use into the parser
     * @param tempdirectory a temporal directory to put the parsed files
     */
    public void start(Collection filesNames, String tempdirectory) {
        VerbLogger.getInstance().log(this.getClass(), "Creating the Parser files factory");
        setTempdirectory(tempdirectory);
        createfilesMap(filesNames);
    }

    /**
     * Close and delete all created files
     */
    public void end() {
        VerbLogger.getInstance().log(this.getClass(), "Finishing the Parser files factory");
        closeAllPrintWriter();
        deleteAllFile();
    }

    /**
     * Close all created files
     */
    public void closeAllPrintWriter() {
        VerbLogger.getInstance().log(this.getClass(), "Closing temporal files");
        for (String name : (Set<String>) filesmap.keySet()) {
            ((PrintWriter) filesmap.get(name)).close();
        }
    }

    /**
     * Get the file name with full path from a File name.
     *
     * @param name the file name of type String
     * @return the value file name with full path of type String
     */
    public String getFileAbsolutName(String name) {
        return tempdirectory + name + ".tsv";
    }

    /**
     * Get the PrintWriter object fro the named file.
     *
     * @param name the file name of type String
     * @return the PrintWriter object for the named file
     */
    public PrintWriter getPrintWriterFromName(String name) {
        return (PrintWriter) filesmap.get(name);
    }

    /**
     * Print on TSV file
     *
     * @param keyval table name
     * @param data String to print, if null print \N
     * @param end String separator or end line
     */
    public void printOnTSVFile(String keyval, String data, String end) {
        if (data != null) {
            if (!data.trim().isEmpty()) {
                ((PrintWriter) filesmap.get(keyval)).print(data.trim().replace('\t', ' ').replace('\n', ' ').replace("\\", "\\\\") + end);
            } else {
                ((PrintWriter) filesmap.get(keyval)).print("\\N" + end);
            }
        } else {
            ((PrintWriter) filesmap.get(keyval)).print("\\N" + end);
        }
    }

    /**
     * Print on TSV file
     *
     * @param keyval table name
     * @param data int to print
     * @param end String separator or end line
     */
    public void printOnTSVFile(String keyval, Integer data, String end) {
        if (data != null) {
            ((PrintWriter) filesmap.get(keyval)).print(data + end);
        } else {
            ((PrintWriter) filesmap.get(keyval)).print("\\N" + end);
        }
    }

    /**
     * Print on TSV file
     *
     * @param keyval table name
     * @param data bigInteger to print
     * @param end String separator or end line
     */
    public void printOnTSVFile(String keyval, BigInteger data, String end) {
        if (data != null) {
            ((PrintWriter) filesmap.get(keyval)).print(data + end);
        } else {
            ((PrintWriter) filesmap.get(keyval)).print("\\N" + end);
        }
    }

    /**
     * Print on TSV file
     *
     * @param keyval table name
     * @param data bigInteger to print
     * @param end String separator or end line
     */
    public void printOnTSVFile(String keyval, BigDecimal data, String end) {
        if (data != null) {
            ((PrintWriter) filesmap.get(keyval)).print(data + end);
        } else {
            ((PrintWriter) filesmap.get(keyval)).print("\\N" + end);
        }
    }

    /**
     * Print on TSV file
     *
     * @param keyval table name
     * @param data boolean to print
     * @param end String separator or end line
     */
    public void printOnTSVFile(String keyval, boolean data, String end) {
        if (data) {
            ((PrintWriter) filesmap.get(keyval)).print("1" + end);
        } else {
            ((PrintWriter) filesmap.get(keyval)).print("0" + end);
        }
    }

    /**
     * Print on TSV file
     *
     * @param keyval table name
     * @param data boolean to print
     * @param end String separator or end line
     */
    public void printOnTSVFile(String keyval, Long data, String end) {
        if (data != null) {
            ((PrintWriter) filesmap.get(keyval)).print(data + end);
        } else {
            ((PrintWriter) filesmap.get(keyval)).print("\\N" + end);
        }
    }

    private void deleteAllFile() {
        for (File f : (Collection<File>) fileStream) {
            VerbLogger.getInstance().log(this.getClass(), "Deleting file: " + f.getName());
            f.delete();
        }
    }

    /**
     * Set the temporal directory to create the files
     *
     * @param tempdirectory a temporal directory
     */
    public void setTempdirectory(String tempdirectory) {
        this.tempdirectory = tempdirectory;
    }

    /**
     * Uncompress the src Gzip file to the output stream
     *
     * @param src the Gzip stream
     * @param dest the output stream
     */
    public void copy(GZIPInputStream src, FileOutputStream dest) {

        try {
            byte[] buffer = new byte[1024];
            int noOfBytes = 0;

            while ((noOfBytes = src.read(buffer)) != -1) {
                dest.write(buffer, 0, noOfBytes);
            }
        } catch (IOException ex) {
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
            System.exit(-1);
        }
    }

    /**
     * Uncompress the src Gzip file to the output stream
     *
     * @param src the Gzip stream
     * @param dest the output stream
     */
    public void copy(InputStream src, FileOutputStream dest) {

        try {
            byte[] buffer = new byte[1024];
            int noOfBytes = 0;

            while ((noOfBytes = src.read(buffer)) != -1) {
                dest.write(buffer, 0, noOfBytes);
            }
        } catch (IOException ex) {
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
            System.exit(-1);
        }
    }

    /**
     * Copy the stream file to a new created file. Both files are closed
     *
     * @param src the input stream file
     * @param dest the output file name
     */
    public void copyAndCloseGzip(InputStream src, String dest) {
        GZIPInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new GZIPInputStream(src);
            fos = new FileOutputStream(dest);

            copy(fis, fos);
        } catch (FileNotFoundException ex) {
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
            System.exit(-1);
        } catch (IOException ex) {
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
            System.exit(-1);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
                System.exit(-1);
            }
        }
    }
    
    /**
     * Copy the stream file to a new created file. Both files are closed
     *
     * @param src the input stream file
     * @param dest the output file name
     */
    public void copyAndClose(InputStream src, String dest) {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(dest);

            copy(src, fos);
        } catch (FileNotFoundException ex) {
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
            System.exit(-1);
        } catch (IOException ex) {
            VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
            System.exit(-1);
        } finally {
            try {
                if (src != null) {
                    src.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                VerbLogger.getInstance().log(this.getClass(), ex.getMessage());
                System.exit(-1);
            }
        }
    }

    /**
     * Create the HashMap using the filesNames array of tables names
     *
     * @param filesNames Array list with the tables name
     */
    private void createfilesMap(Collection filesNames) {
        filesmap = new HashMap();
        fileStream = new ArrayList();

        try {
            for (String name : (Collection<String>) filesNames) {
                File infile = new File(tempdirectory + name + ".tsv");
                VerbLogger.getInstance().log(this.getClass(), "Creating file: " + infile.getName());
                fileStream.add(infile);
                filesmap.put(name, new PrintWriter(infile));
            }
        } catch (FileNotFoundException e) {
            VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
            VerbLogger.getInstance().log(this.getClass(), e.toString());
            VerbLogger.getInstance().setLevel(VerbLogger.getInstance().getInitialLevel());
        }
    }
}
