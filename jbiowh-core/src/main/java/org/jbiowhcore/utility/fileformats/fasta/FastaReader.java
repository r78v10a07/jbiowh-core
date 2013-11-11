package org.jbiowhcore.utility.fileformats.fasta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jbiowhcore.logger.VerbLogger;

/**
 * This class is to read fasta files
 *
 * $Author: r78v10a07@gmail.com $ $LastChangedDate: 2013-06-13 16:20:38 +0200 (Thu, 13 Jun 2013) $ $LastChangedRevision: 633 $
 *
 * @since May 3, 2013
 */
public class FastaReader {

    private List<FastaEntry> data;

    /**
     * Create the fasta reader object
     */
    public FastaReader() {
        data = new ArrayList();
    }

    /**
     * Create a list with all fasta entries from the fastaFile. Use the
     * idDelimiter to create the id map
     *
     * @param fastaFile the file to read the fasta entries
     * @param idDelimiter the delimiter to create the Id map
     * @throws IOException
     */
    public void readAllFasta(File fastaFile, String idDelimiter) throws IOException {
        int count = 0;
        FastaEntry fasta;
        BufferedReader reader = new BufferedReader(new FileReader(fastaFile));
        while ((fasta = readFasta(reader, idDelimiter)) != null) {
            VerbLogger.getInstance().log(this.getClass(), "Adding fasta " + (count++) + " to the fasta list");
            data.add(fasta);
        }
    }

    /**
     * Read one fasta entries. Use the
     * idDelimiter to create the id map
     *
     * @param reader the BufferedReader with the file to read the fasta entries
     * @param idDelimiter the delimiter to create the Id map
     * @return a fasta entry
     * @throws IOException
     */
    public FastaEntry readFasta(BufferedReader reader, String idDelimiter) throws IOException {
        String line;
        StringBuilder builder = new StringBuilder();
        FastaEntry fasta = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith(">")) {
                if (fasta != null) {
                    if (!builder.toString().isEmpty()) {
                        fasta.setSeq(builder.toString());
                    }
                    reader.reset();
                    return fasta;
                }
                fasta = new FastaEntry(line.substring(1).trim());
                fasta.createIds(idDelimiter);
                builder = new StringBuilder();
            } else if (fasta != null) {
                builder.append(line);
            }
            reader.mark(9000000);
        }
        if (fasta != null && !builder.toString().isEmpty()) {
            fasta.setSeq(builder.toString());
        }
        return fasta;
    }

    /**
     * Get the fasta list
     * @return
     */
    public List<FastaEntry> getData() {
        return data;
    }

    /**
     * Set the fasta list
     * @param data
     */
    public void setData(List<FastaEntry> data) {
        this.data = data;
    }
}
