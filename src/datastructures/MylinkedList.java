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


    //method to insert new node
    public void insert(Node<T> node) {
        if (getHead() == null) {
            setHead(node);
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }


    }

    public boolean isEmpty() {
        return getHead() == null;
    }

    //method to delete from begining
    public Node<T> delete() {
        if (isEmpty()) {
            System.out.println("underflow");
            return null;
        }
        Node<T> temp = getHead();
        setHead(getHead().getNext());
        return temp;
    }

    //method to delete from particular postion
    public Node<T> delete(int i) {
        Node<T> deletedNode;
        Node<T> temp = getHead();
        if (isEmpty()) {
            System.out.println("Underflow");
            return temp;
        }
        if (i == 1) {
            deletedNode = getHead();
            setHead(null);
        } else {
            for (int j = 1; j < i - 1; j++) {
                temp = temp.getNext();
            }
            deletedNode = temp.getNext();
            temp.setNext(temp.getNext().getNext());
        }
        return deletedNode;
    }

    //Method to fetch object one by one
    public Node<T> getObject() {

        Node<T> temp;

        if (getIter() == null && getHead() == null) {
            System.out.println("List is empty");
            return null;
        } else if (getIter() == null) {
            setIter(getHead());
            return null;
        }
        temp = getIter();
        setIter(getIter().getNext());
        return temp;
    }


}

