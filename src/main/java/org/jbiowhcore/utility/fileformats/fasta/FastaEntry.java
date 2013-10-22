package org.jbiowhcore.utility.fileformats.fasta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is the fasta data
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate: 2013-05-29 11:24:54 +0200
 * (Wed, 29 May 2013) $ $LastChangedRevision: 638 $
 *
 * @since May 3, 2013
 */
public class FastaEntry {

    private int seqLength;
    private String header;
    private Map<String, List<String>> ids;
    private String seq;

    /**
     * Create the fasta entry
     */
    public FastaEntry() {
        seqLength = 80;
        ids = new HashMap<>();
    }

    /**
     * Create the fasta entry
     *
     * @param seqLength the length to format the fasta seq
     */
    public FastaEntry(int seqLength) {
        this.seqLength = seqLength;
        ids = new HashMap<>();
    }

    /**
     * Create the fasta entry
     *
     * @param header the header of the fasta entry
     */
    public FastaEntry(String header) {
        seqLength = 80;
        this.header = header;
        ids = new HashMap<>();
    }

    /**
     * Create the fasta entry
     *
     * @param header the header of the fasta entry
     * @param seqLength the length to format the fasta seq
     */
    public FastaEntry(String header, int seqLength) {
        this.seqLength = seqLength;
        this.header = header;
        ids = new HashMap<>();
    }

    /**
     * Create a map with the Id in the header
     *
     * @param delimiter the delimiter to extract the ids
     */
    public void createIds(String delimiter) {

        if (header.matches(".*\\u0001.*")) {
            String[] first = header.split("\\u0001");
            for (int j = 0; j < first.length; j++) {
                addIds(first[j], delimiter);
            }
        } else {
            addIds(header, delimiter);
        }
    }

    private void addIds(String line, String delimiter) {
        String[] aIds = line.split(delimiter);
        int size = aIds.length;

        if (size % 2 != 0) {
            size = size - 1;
        }
        for (int i = 0; i < size - 1; i += 2) {
            if (ids.containsKey(aIds[i])) {
                ids.get(aIds[i]).add(aIds[i + 1]);
            } else {
                List<String> d = new ArrayList();
                d.add(aIds[i + 1]);
                ids.put(aIds[i], d);
            }
        }
    }

    /**
     * Get the header
     *
     * @return the header
     */
    public String getHeader() {
        return header;
    }

    /**
     * Set the header
     *
     * @param header the fasta header
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * Get the Ids map
     *
     * @return the Ids map
     */
    public Map<String, List<String>> getIds() {
        return ids;
    }

    /**
     * Set the Ids map
     *
     * @param ids the Ids map
     */
    public void setIds(Map<String, List<String>> ids) {
        this.ids = ids;
    }

    /**
     * Get the sequence
     *
     * @return the sequence
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Set the sequence
     *
     * @param seq the sequence
     */
    public void setSeq(String seq) {
        this.seq = seq;
    }

    /**
     * Set the length to format the fasta seq
     *
     * @param seqLength
     */
    public void setSeqLength(int seqLength) {
        this.seqLength = seqLength;
    }

    /**
     * Print the ids list
     */
    public void printIds() {
        if (!ids.isEmpty()) {
            System.out.println("Fasta ids:");
            for (String a : ids.keySet()) {
                System.out.println(a + ": " + ids.get(a));
            }
        }
    }

    /**
     * Print the data in a fasta format
     */
    @Override
    public String toString() {
        if (seq != null && !seq.isEmpty()) {
            StringBuilder seqShort = new StringBuilder();
            for (int i = 0; i < seq.length(); i += seqLength) {
                if (seq.length() < i + seqLength) {
                    seqShort.append(seq.substring(i, seq.length())).append("\n");
                } else {
                    seqShort.append(seq.substring(i, i + seqLength)).append("\n");
                }
            }
            return ">"
                    + header
                    + "\n"
                    + seqShort.toString();
        }
        return ">" + header;
    }
}
