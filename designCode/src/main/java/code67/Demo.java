package code67;


import code67.iterator.Iterator;
import code67.list.ArrayList;
import code67.list.List;

public class Demo {
    public static void main(String[] args) {
        List names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");

        names.remove("a");

        /*Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            names.update(1,"cc");
            System.out.println("name=" + iterator.currentItem());
            iterator.next();
        }*/

        Iterator iterator = names.snapShotArrayIterator();
        while (iterator.hasNext()) {
            names.update(1,"cc");
            System.out.println("name=" + iterator.currentItem());
            iterator.next();
        }

    }
}
