package datastructures;

import node.Node;

public class MylinkedList<T extends Comparable<T>> {
    private Node<T> iter;
    private Node<T> head;

    public Node<T> getIter() {
        return iter;
    }

    public void setIter(Node<T> iter) {
        this.iter = iter;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
