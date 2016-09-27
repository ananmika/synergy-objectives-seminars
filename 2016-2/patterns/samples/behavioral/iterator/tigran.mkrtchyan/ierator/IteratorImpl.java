package ierator;

import list.LinkedList;

import java.util.ConcurrentModificationException;

/**
 * Created by Tigran.Mkrtchyan on 9/26/2016.
 */
public class IteratorImpl<T> implements Iterator {
    private LinkedList<T>.Node next;
    private LinkedList<T>.Node current;
    private LinkedList<T>.Node previous;
    private LinkedList<T> list;
    int size;

    public IteratorImpl(LinkedList<T> list, int size) {
        this.list = list;
        next = list.getLastNode();
        this.size = size;
    }

    @Override
    public boolean hasPrev() {
        return next != null;
    }

    @Override
    public T prev() {
        if (size == list.getSize()) {
            previous = current;
            current = next;
            next = next.getPrev();
            return current.getValue();
        } else throw new ConcurrentModificationException();
    }

    @Override
    public void remove() {
        if (current.getPrev() == null) {
            previous.setPrev(null);
        } else if (previous == null) {
            current.setPrev(null);
        } else {
            previous.setPrev(next);
        }
    }
}
