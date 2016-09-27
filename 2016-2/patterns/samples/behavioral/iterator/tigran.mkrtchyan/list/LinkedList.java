package list;

import ierator.*;

/**
 * Created by Tigran.Mkrtchyan on 9/26/2016.
 */
public class LinkedList<T> implements List<T> {
    private int size;
    private Node firstNode;
    private Node lastNode;

    public LinkedList() {
        this.size = 0;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public int getSize() {
        return size;
    }



    @Override
    public void add(T value) {
        if (firstNode == null) {
            new Node(null, value);
            firstNode = new Node(null, value);
            size++;
        } else if (lastNode == null) {
            lastNode = new Node(firstNode, value);
            size++;
        } else {
            Node temp = new Node(lastNode.prev, lastNode.value);
            lastNode = new Node(temp, value);
            size++;
        }
    }

    @Override
    public T get() {
        return null;
    }

    @Override
    public Iterator getIterator() {
        return new IteratorImpl<>(this, size);
    }

    public class Node{
        private Node prev;
        private T value;

        private Node(Node prev, T value) {
            this.prev = prev;
            this.value = value;


        }

        public Node getPrev() {
            return prev;
        }

        public T getValue() {
            return value;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}
