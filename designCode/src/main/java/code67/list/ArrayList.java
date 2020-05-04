package code67.list;

import code67.iterator.ArrayIterator;
import code67.iterator.Iterator;
import code67.iterator.SnapShotArrayIterator;

public class ArrayList<E> implements List<E> {
    private E[] array;

    int size = 0;

    private final int DEFAULT_CAPACITY = 10;

    private Object[] elementData;

    public ArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }


    @Override
    public void add(E e) {
        elementData[size] = e;
        size++;
    }

    @Override
    public void remove(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elementData[i] == e) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int j = index + 1; j < size; j++) {
                elementData[j - 1] = elementData[j];
            }
            size--;
        }
    }

    @Override
    public E get(int i) {
        return (E) elementData[i];
    }

    @Override
    public void update(int i,E ele) {
       elementData[i] =ele;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }

    @Override
    public Iterator snapShotArrayIterator() {
        return new SnapShotArrayIterator(this);
    }


    public static void main(String[] args) {
        int i = 0;
        System.out.println(++i);
        System.out.println(i);
    }
}
