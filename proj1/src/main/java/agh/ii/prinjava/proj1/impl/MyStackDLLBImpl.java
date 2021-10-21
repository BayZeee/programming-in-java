package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;


    /** add an element at the last place.
     *
     * @param x element to add at the end of the stack
     */
    @Override
    public void push(E x) { this.elems.addFirst(x); }

    /**
     * remove the last element of the stack
     * and return its value.
     *
     * @return the last element of the stack
     */
    @Override
    public void pop() { elems.removeFirst();}

    /**
     *
     * @return number of elem in the queue using getSize()
     */
    @Override
    public int numOfElems() {
        return this.elems.getSize();
    }

    /**
     *
     * @return value of the first element in the queue using search()
     */
    @Override
    public E peek() {
        return this.elems.search(0);
    }
}
