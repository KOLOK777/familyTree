package familyTree.src.family_tree.model.human.comparators;

import familyTree.src.family_tree.model.family_Tree.FamilyTreeItem;
import java.util.Comparator;
public class HumanComparatorByName<E extends FamilyTreeItem> implements Comparator<E>{
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}