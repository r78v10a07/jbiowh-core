package org.jbiowhcore.utility.utils;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.jbiowhcore.logger.VerbLogger;

/**
 * This class is to explore a complete directory
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate: 2013-03-19 09:38:47 +0100
 * (Tue, 19 Mar 2013) $ $LastChangedRevision: 638 $
 * @since Nov 24, 2011
 */
public class ExploreDirectory {

    private static ExploreDirectory singleton;
    
    /**
     * The recursivity depth limit
     */
    private int depth;

    private ExploreDirectory() {
        depth = -1;
    }

    /**
     * Return a ExploreDirectory
     *
     * @return a ExploreDirectory
     */
    public static synchronized ExploreDirectory getInstance() {
        if (singleton == null) {
            singleton = new ExploreDirectory();
        }
        return singleton;
    }

    /**
     * This return a linked list of file into the directory
     *
     * @param dir The directory to be explored
     * @return a List of File objects with the files into the directory
     */
    public List<File> extractFilesPathFromDir(File dir) {
        LinkedList<File> files = new LinkedList<>();

        if (dir.isDirectory()) {
            for (String name : dir.list()) {
                List<File> intoDir = null;
                try {
                    intoDir = extractFilesPathFromDir(new File(dir.getCanonicalPath() + File.separator + name));
                } catch (IOException ex) {
                    VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
                    VerbLogger.getInstance().log(this.getClass(), "Can't open the file: " + name);
                    VerbLogger.getInstance().log(this.getClass(), "Exception code for this object: " + ex.getMessage());
                    VerbLogger.getInstance().setLevel(VerbLogger.getInstance().getInitialLevel());
                }
                files.addAll(intoDir);
            }
        } else if (dir.isFile()) {
            files.add(dir);
        }
        return files;
    }

    /**
     * This return a linked list of file into the directory
     *
     * @param dir The directory to be explored
     * @param extensions a String's array with the file's extension to be
     * included
     * @return a List of File objects with the files into the directory
     */
    public List<File> extractFilesPathFromDir(File dir, String[] extensions) {
        LinkedList<File> files = new LinkedList<>();

        if (dir.isDirectory()) {
            for (String name : dir.list()) {
                List<File> intoDir = null;
                try {
                    intoDir = extractFilesPathFromDir(new File(dir.getCanonicalPath() + File.separator + name), extensions);
                } catch (IOException ex) {
                    VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
                    VerbLogger.getInstance().log(this.getClass(), "Can't open the file: " + name);
                    VerbLogger.getInstance().log(this.getClass(), "Exception code for this object: " + ex.getMessage());
                    VerbLogger.getInstance().setLevel(VerbLogger.getInstance().getInitialLevel());
                }
                files.addAll(intoDir);
            }
        } else if (dir.isFile()) {
            for (String ext : extensions) {
                if (dir.getName().endsWith(ext)) {
                    files.add(dir);
                    break;
                }
            }
        }
        return files;
    }

    /**
     * This return a linked list of file into the directory with a depth limit
     *
     * @param dir The directory to be explored
     * @param extensions a String's array with the file's extension to be
     * included
     * @param varDepth the depth for the recursivity
     * @return a List of File objects with the files into the directory
     */
    public List<File> extractFilesPathFromDir(File dir, String[] extensions, int varDepth) {
        LinkedList<File> files = new LinkedList<>();
        if (depth == -1) {
            depth = varDepth;
            varDepth = 0;
        }
        if (varDepth < depth) {
            varDepth++;
            if (dir.isDirectory()) {
                for (String name : dir.list()) {
                    List<File> intoDir = null;
                    try {
                        intoDir = extractFilesPathFromDir(new File(dir.getCanonicalPath() + File.separator + name), extensions, varDepth);
                    } catch (IOException ex) {
                        VerbLogger.getInstance().setLevel(VerbLogger.getInstance().ERROR);
                        VerbLogger.getInstance().log(this.getClass(), "Can't open the file: " + name);
                        VerbLogger.getInstance().log(this.getClass(), "Exception code for this object: " + ex.getMessage());
                        VerbLogger.getInstance().setLevel(VerbLogger.getInstance().getInitialLevel());
                    }
                    files.addAll(intoDir);
                }
            } else if (dir.isFile()) {
                for (String ext : extensions) {
                    if (dir.getName().endsWith(ext)) {
                        files.add(dir);
                        break;
                    }
                }
            }
        }
        return files;
    }
}
