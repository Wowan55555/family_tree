package model.family_worries;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTreeSiblingsManager<E extends TreeNode<E>> implements Serializable {
    public List<E> getSiblings(E node) {
        if (node == null) {
            return null;
        }
        List<E> siblings = new ArrayList<>();
        for (E parent : node.getParents()) {
            for (E child : parent.getChildren()) {
                if (!child.equals(node)) {
                    siblings.add(child);
                }
            }
        }
        return siblings;
    }
}