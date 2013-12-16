package org.jbiowhcore.utility.utils;

/**
 * This class is for BioWH pattern match
 *
 * $Author: r78v10a07@gmail.com $
 * $LastChangedDate: 2012-10-03 22:11:05 +0200 (Wed, 03 Oct 2012) $
 * $LastChangedRevision: 270 $
 * @since Nov 27, 2011
 */
public class BioWHPattern {

    private static BioWHPattern singleton;

    private BioWHPattern() {
    }

    /**
     * Return a BioWHPattern
     *
     * @return a BioWHPattern
     */
    public static synchronized BioWHPattern getInstance() {
        if (singleton == null) {
            singleton = new BioWHPattern();
        }
        return singleton;
    }

    /**
     * Returns true if this string is CAS type
     *
     * @param s The string to be analyzed
     * @return true if the string is CAS type
     */
    public boolean isCAS(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("(\\d*%*\\d*)\\-*(\\d*%*\\d*)\\-*(\\d*%*\\d*)");
    }

    /**
     * Returns true if this string is DrugBank Id type
     *
     * @param s The string to be analyzed
     * @return true if the string is DrugBank Id type
     */
    public boolean isDrugBankId(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("DB\\d*%*\\d*");
    }

    /**
     * Returns true if this string is KEGG Pathway Entry type
     *
     * @param s The string to be analyzed
     * @return true if the string is KEGG Pathway Entry type
     */
    public boolean isKEGGPathwayEntry(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("(\\w+\\d+)|(\\w+\\d+%)|(\\w+%)");
    }

    /**
     * Returns true if this string is KEGG Pathway Number type
     *
     * @param s The string to be analyzed
     * @return true if the string is KEGG Pathway Number type
     */
    public boolean isKEGGPathwayNumber(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("\\d{5}");
    }

    /**
     * Returns true if this string is KEGG Compound Entry type
     *
     * @param s The string to be analyzed
     * @return true if the string is KEGG Compound Entry type
     */
    public boolean isKEGGCompoundEntry(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("(C\\d{5})|(C\\d+%)");
    }

    /**
     * Returns true if this string is KEGG Glycan Entry type
     *
     * @param s The string to be analyzed
     * @return true if the string is KEGG Glycan Entry type
     */
    public boolean isKEGGGlycanEntry(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("(G\\d{5})|(G\\d+%)");
    }

    /**
     * Returns true if this string is GO Id type
     *
     * @param s The string to be analyzed
     * @return true if the string is GO Id type
     */
    public boolean isGOId(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("(GO|go):.*");
    }

    /**
     * Returns true if this string is Protein Name type
     *
     * @param s The string to be analyzed
     * @return true if the string is Protein Name type
     */
    public boolean isProteinName(String s) {
        if (s == null) {
            return false;
        }
        return s.matches(".*_.*");
    }
    
    /**
     * Returns true if this string is PIRSF Name type
     *
     * @param s The string to be analyzed
     * @return true if the string is Protein Name type
     */
    public boolean isPirsfID(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("PIRSF\\d+%*\\d*");
    }

    /**
     * Returns true if this string is EC type
     *
     * @param s The string to be analyzed
     * @return true if the string is EC type
     */
    public boolean isEC(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("\\d*\\.(\\-*\\d*%*\\d*)\\.(\\-*\\d*%*\\d*)\\.(\\-*\\d*%*\\d*)");
    }

    /**
     * Returns true if this string has only digits
     *
     * @param s The string to be analyzed
     * @return true if the string has only digits
     */
    public boolean isDigits(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("\\d+");
    }

    /**
     * Returns true if this string is Long type
     *
     * @param s The string to be analyzed
     * @return true if the string is Long type
     */
    public boolean isLong(String s) {
        if (s == null) {
            return false;
        }
        try {
            Long.parseLong(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
