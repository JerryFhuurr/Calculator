package ListSide;

public class LinkedList<T> implements List<T> {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node node = new Node(data);
        Node lastNode;
        lastNode = head;
        head = node;
        head.setNext(lastNode);
        size++;
    }

    @Override
    public T removeFirst() {
        Node<T> newNode = head.getNext();
        head.setNext(newNode.getNext());
        size--;
        return newNode.getData();
    }
}
