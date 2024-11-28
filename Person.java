package Family_Tree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int berthYear;
    private Person mather;
    private Person father;
    private List<Person> children;

    public Person(String name, int berthYear) {
        this.name = name;
        this.berthYear = berthYear;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBerthYear() {
        return berthYear;
    }

    public void setMather(Person mather) {
        this.mather = mather;
    }

    public void setFather(Person father) {
        this.father = father;
    }
    public void addChild(Person child){
        this.children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }

    public Person getMather() {
        return mather;
    }

    public Person getFather() {
        return father;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
