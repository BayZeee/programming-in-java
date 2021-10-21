package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.DLinkList;
import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;


/**
 * A Stack works in the First In - Last Out principle.
 * */
public interface MyStack<E> {


    /**
     * pop & push are main functions of MyStack.java
     * @param x
     */



    /**
     * remove the last element from the stack and returns its value.
     *
     * @return last element of the stack
     * @see MyStackDLLBImpl#pop()
     * */
    void pop();

    /**
     * adding an element at the end of the stack
     *
     * @param x element to add at the end of the stack
     * @see MyStackDLLBImpl#push(Object)
     * */
    void push(E x);






    /**
     * numOfEelems(), peek() and isempty() are used in the test class
     */


    /**
     * check if the queue is empty
     * @return true if list is empty, else if it's not empty, return false
     * */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * numOfElems counts the number of elements in the stack
     * @return number of elements in the stack
     * @see MyQueueDLLBImpl#numOfElems()
     * */
    int numOfElems();


    /**
     * take the first element's value in the queue but doesn't delete it
     *
     * @return The value of the first element of the Queue
     * @see MyQueueDLLBImpl#peek()
     * */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {return new MyStackDLLBImpl<T>();}
}
