package Family_Tree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Work_Tree workTree = new Work_Tree();

        Person oliver = new Person("Oliver", 1990);
        Person jack = new Person("Jack", 1975);
        Person mary = new Person("Mary", 1976);

        oliver.setMather(mary);
        oliver.setFather(jack);
        jack.addChild(oliver);
        mary.addChild(oliver);

        workTree.addPerson(oliver);
        workTree.addPerson(jack);
        workTree.addPerson(mary);

        List<Person> jacksChildren = workTree.getChildren(jack);
        for (Person child : jacksChildren){
            System.out.println("Jack`s child: " + child.getName());
        }

        Person harry = new Person("Harry", 2000);
        Person charlie = new Person("Charlie", 2021);
        Person ava = new Person("Ava", 2001);
        Person mia = new Person("Mia", 2022);
        Person ruby = new Person("Ruby", 2023);

        charlie.setMather(ava);
        charlie.setFather(harry);
        harry.addChild(charlie);
        ava.addChild(charlie);

        mia.setMather(ava);
        mia.setFather(harry);
        harry.addChild(mia);
        ava.addChild(mia);

        ruby.setMather(ava);
        ruby.setFather(harry);
        harry.addChild(ruby);
        ava.addChild(ruby);

        workTree.addPerson(harry);
        workTree.addPerson(charlie);
        workTree.addPerson(ava);
        workTree.addPerson(mia);
        workTree.addPerson(ruby);



        List<Person> avasChildren = workTree.getChildren(ava);
        for (Person child : avasChildren){
            System.out.println("Ava`s children: " + child);
        }
    }
}
