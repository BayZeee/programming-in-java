package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;


    /**
     * add the element at the end of the queue
     * @param x add the element at the end
     *  * */
    @Override
    public void enqueue(E x) {this.elems.addFirst(x);}

    /**
     * remove the first element of the queue, then returns its value.
     *
     * @return first element of the queue
     * */
    @Override
    public void dequeue() { elems.removeLast();}


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
