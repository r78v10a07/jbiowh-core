package org.jbiowhcore.utility.graph;

import java.util.ArrayList;
import java.util.List;
import org.jgrapht.graph.DefaultWeightedEdge;

/**
 * This class extends the default implementation for edges in a WeightedGraph.
 * All access to the weight of an edge must go through the graph interface,
 * which is why this class doesn't expose any public methods.
 *
 * This class just override the toString method and includes a list with the
 * objects that belongs to the relationship. This list is used to increment the
 * edge's weight.
 *
 * $Author$ $LastChangedDate$ $LastChangedRevision$
 *
 * @since Mar 30, 2013
 */
public class HideWeightedEdge extends DefaultWeightedEdge {

    private List<Object> weightObject;

    public List<Object> getWeightObject() {
        if (weightObject == null) {
            weightObject = new ArrayList();
        }
        return weightObject;
    }

    @Override
    public String toString() {
        return "";
    }
}
