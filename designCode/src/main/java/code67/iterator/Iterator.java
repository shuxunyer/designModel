package code67.iterator;

public interface Iterator<E> {
    boolean hasNext();

    void next();

    E currentItem();
}
