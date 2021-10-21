package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.DLinkList;
import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * A queue operates on a first-in-first-out principles.
 * */
public interface MyQueue<E> {


    /**
     * Queuing an item in a queue means adding it in the last place. It is in relation to the First in - first out basis.
     * @param x add the element at the end
     *  * */
    void enqueue(E x);


    /**
     * Dequeuing an element means removing the first element of the queue, then returns its value.
     *
     * @return first element of the queue
     * */
    void dequeue();




    /**
     * numOfElems count the nb of elem in the queue
     * @return number of elements in the queue
     * */
    int numOfElems();

    /**
     * check if the queue is empty
     * @return true if list is empty, else if it's not empty, return false
     * */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * take the first element's value in the queue but doesn't delete it
     *
     * @return The value of the first element of the Queue
     * */
    E peek();


    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {return new MyQueueDLLBImpl<>();}
}
