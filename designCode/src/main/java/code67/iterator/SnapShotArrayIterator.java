package code67.iterator;

import code67.list.ArrayList;

import java.util.NoSuchElementException;

/**
 * @author shuxun
 */
public class SnapShotArrayIterator<E> implements Iterator<E> {
    private int cursor = 0;
    private ArrayList<E> snapShot;

    public void addAll(ArrayList<E> arrayList){
        if(arrayList.size()==0){
            return ;
        }
        for(int i=0;i<arrayList.size();i++){
            snapShot.add(arrayList.get(i));
        }
    }

    public SnapShotArrayIterator(ArrayList<E> arrayList) {
        this.snapShot = new ArrayList<>();
        addAll(arrayList);
    }

    @Override
    public boolean hasNext() {
        return cursor < snapShot.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (cursor >= snapShot.size()) {
            throw new NoSuchElementException();
        }
        return snapShot.get(cursor);
    }
}
