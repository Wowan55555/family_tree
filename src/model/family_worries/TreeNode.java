package model.family_worries;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface TreeNode<T> extends Serializable {
    void setId(int id);

    int getId();

    T getFather();

    T getMother();

    void addChild(T human);

    void addParent(T human);

    String getName();

    LocalDate getDeathDate();

    LocalDate getBirthDate();

    List<T> getParents();

    List<T> getChildren();

    T getSpouse();

    void setSpouse(T human);
}