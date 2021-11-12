package iterator;

public interface Iterator<T> {
    void next();
    T current();
    boolean hasNext();
}
