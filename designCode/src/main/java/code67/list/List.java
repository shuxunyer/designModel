package code67.list;

import code67.iterator.Iterator;

public interface List<E> {

    void add(E e);

    void remove(E e);

    E get(int i);

    void update(int i,E ele);

    int size();

    Iterator iterator();

    Iterator snapShotArrayIterator();

}
