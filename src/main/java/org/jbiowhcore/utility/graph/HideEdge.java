package org.jbiowhcore.utility.graph;

import org.jgrapht.graph.DefaultEdge;

/**
 * This class is used to hide the edge label on the JGraph
 *
 * $Author: r78v10a07@gmail.com $
 * $LastChangedDate: 2013-03-30 18:40:01 +0100 (Sat, 30 Mar 2013) $
 * $LastChangedRevision: 548 $
 * @since Sep 19, 2012
 */
public class HideEdge extends DefaultEdge{

    @Override
    public String toString() {
        return "";
    }

}
