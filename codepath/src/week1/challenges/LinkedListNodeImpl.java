//Print concentric rectangular pattern in A 2d matrix.
//        Let us show you some examples to clarify what we mean.
//
//        Example 1:
//
//        Input: A = 4.
//        Output:
//
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
//        Example 2:
//
//        Input: A = 3.
//        Output:
//
//        3 3 3 3 3
//        3 2 2 2 3
//        3 2 1 2 3
//        3 2 2 2 3
//        3 3 3 3 3
//        The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.
//
//        You will be given A as an argument to the function you need to implement, and you need to return A 2D array.
//
//        NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have A doubt? Checkout Sample Codes for more details.
//


package week1.challenges;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

interface LinkedListNode<E> {

    /* getter/setter for this node's value */
    E getValue();
    void setValue(E value);

    /* getter/setter for the subsequent node, or null if this is the last node */
    LinkedListNode<E> getNext();
    void setNext(LinkedListNode<E> next);

    /**
     * Initialize this node and all of its subsequent nodes from
     * an array of values, starting with the head value at index 0
     *
     * @param listValues - the ordered values for the whole list
     */
    void setValuesFromArray(E[] listValues);

}

public class LinkedListNodeImpl<E> implements LinkedListNode<E>{

    @Override
    public E getValue() {
        return null;
    }

    @Override
    public void setValue(E value) {

    }

    @Override
    public LinkedListNode<E> getNext() {
        return null;
    }

    @Override
    public void setNext(LinkedListNode<E> next) {

    }

    @Override
    public void setValuesFromArray(E[] listValues) {

    }
}

//@Test
//public void test() {
//    LinkedListNode<Integer> head = null;
//    Integer[] listValues = new Integer[] {1, 2, 3};
//
//    head = new LinkedListNodeImpl<>(); // replace with your implementation
//    head.setValuesFromArray(listValues);
//
//    assertEquals(listValues[0], head.getValue());
//    assertNotNull(head.getNext());
//    assertEquals(listValues[1], head.getNext().getValue());
//    assertNotNull(head.getNext().getNext());
//    assertEquals(listValues[2], head.getNext().getNext().getValue());
//    assertNull(head.getNext().getNext().getNext());
//}



