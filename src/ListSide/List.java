package ListSide;

public interface List<T> {
    boolean isEmpty();
    int size();
    void addToFront(T data);
    T removeFirst();
}
