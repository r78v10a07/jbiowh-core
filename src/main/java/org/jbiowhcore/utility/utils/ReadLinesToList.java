/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbiowhcore.utility.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to read lines from a file and put it on a list
 *
 * $Author: r78v10a07@gmail.com $ 
 * $LastChangedDate: 2012-10-16 14:56:20 +0200 (Tue, 16 Oct 2012) $ 
 * $LastChangedRevision: 300 $
 * @since Sep 28, 2012
 */
public class ReadLinesToList {

    private static ReadLinesToList singleton;

    /**
     * Return a ReadLinesToList instance
     *
     * @return a ReadLinesToList instance
     */
    public static synchronized ReadLinesToList getInstance() {
        if (singleton == null) {
            singleton = new ReadLinesToList();
        }
        return singleton;
    }
    
    private ReadLinesToList(){
    }

    /**
     * Create a string matrix with the fields on the file
     * @param fileNameToRead the file name to read
     * @param regex the regular expression to extract the fields
     * @return a string matrix with the fields on the file
     * @throws IOException
     */
    public List<List<String>> readLinesToList(String fileNameToRead, String regex) throws IOException {
        List<List<String>> linesInField = new ArrayList();
        List<String> lines = readLinesToList(new BufferedReader(new FileReader(new File(fileNameToRead))));
        for(String line : lines){
            List<String> fields = new ArrayList();
            for(String field : line.split(regex)){
                fields.add(field.trim());
            }
            if (!fields.isEmpty()){
                linesInField.add(fields); 
            }
        }
        return linesInField;
    }

    /**
     * Read lines from a file and put it on a list
     *
     * @param fileNameToRead the file name to read
     * @return a list with all lines
     * @throws IOException
     */
    public List<String> readLinesToList(String fileNameToRead) throws IOException {
        return readLinesToList(new BufferedReader(new FileReader(new File(fileNameToRead))));
    }

    /**
     * Read lines from a file and put it on a list
     *
     * @param fileToRead the file to read
     * @return a list with all lines
     * @throws IOException
     */
    public List<String> readLinesToList(File fileToRead) throws IOException {
        return readLinesToList(new BufferedReader(new FileReader(fileToRead)));
    }

    /**
     * Read lines from a file and put it on a list
     *
     * @param idReader the buffer reader
     * @return a list with all lines
     * @throws IOException
     */
    public List<String> readLinesToList(BufferedReader idReader) throws IOException {
        String line;
        List<String> ids = new ArrayList();
        while ((line = idReader.readLine()) != null) {
            ids.add(line.trim());
        }
        return ids;
    }
}
