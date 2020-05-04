package code67.iterator;

import code67.list.List;

import java.util.NoSuchElementException;

public class ArrayIterator<E> implements Iterator<E> {
    private int cursor = 0;
    private List<E> arrayList;

    public ArrayIterator(List<E> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor < arrayList.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}
