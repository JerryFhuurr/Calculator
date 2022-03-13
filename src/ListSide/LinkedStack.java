package ListSide;

public class LinkedStack<T> implements Stack{
    private LinkedList list;

    public LinkedStack(){
        this.list = new LinkedList();
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(Object element) {
        list.addToFront(element);
    }

    @Override
    public Object pop() {
        return list.removeFirst();
    }
}
