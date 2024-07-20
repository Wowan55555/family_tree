package model.human;

import model.family_worries.TreeNode;

import java.util.Comparator;

public class HumansComparatorByBirthDate<T extends TreeNode<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}