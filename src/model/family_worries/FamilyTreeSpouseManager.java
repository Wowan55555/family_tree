package model.family_worries;


import java.io.Serializable;

public class FamilyTreeSpouseManager<E> implements Serializable {
    public boolean setWedding(E node1, E node2) {
        return false;
    }

    public boolean setDivorce(E node1, E node2) {
        node1.getClass();
        node2.getClass();
        return true;
    }
}