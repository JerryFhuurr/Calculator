package ListSide;

public class LinkedStack<T> implements Stack{
    private LinkedList list;

    public LinkedStack(){
        this.list = new LinkedList();
    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(Object element) {

    }

    @Override
    public Object pop() {
        return null;
    }
}
