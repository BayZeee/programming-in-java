package agh.ii.prinjava.proj1.impl;


/**
 *
 * the structure of a linked list is composed by a node object
 * which will be the head. That means that this node will be the first element
 * of our list
 * @param <E>
 */
public class DLinkList<E> {
    private Node<E> head;


    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    /**
     *
     * add an element at the beginning of the linked list by creating a new node
     * (so this node is the new head, same is the list is empty)
     * then, link this new node with the previous head
     */
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }


    /**
     *
     * nothing happens if the list is empty
     * if there is one element in the list, the head Nod's new value is null
     * if the list contains more than one element,
     * we set the head as the next element
     */
    public void removeFirst() {
        // the old way
        if (head == null) { throw new IllegalStateException("THE LIST IS EMPTY :/"); }
        else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    /**
     *
     *
     * nothing happens if list is empty
     * if one elem in the list,  head Node's new value is null
     * if more than one elem in the list, we browse the lilst
     * with a temp element until we find the last elem
     * then we delete the link between these two elems and return the value of the new last ele
     * returning the data is for have a test easier to understand
     * @return
     */
    public void removeLast() {
        if (head == null) {throw new IllegalStateException("THE LIST IS EMPTY :/");}

        else if (head.next == null) {
            head = null;
        } else {
            Node<E> tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            tmp.next = null;
        }

    }
}


