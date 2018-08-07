package week1.test;

/**
 * Created by k.mo on 8/6/18.
 */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
//input
//    5
//            1
//            2
//            3
//            4
//            5
//            3
//output
//    1
//            2
//            3
class SinglyLinkedListNode{
              int data;
              SinglyLinkedListNode next;
}

public class DeleteNodeGreaterThanX {
    static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {
        //none
        if (listHead == null)
            return null;
        // only one
        if (listHead.data > x && listHead.next == null)
            return null;
        SinglyLinkedListNode curr = listHead;
        SinglyLinkedListNode prev = null;
        while (curr !=null && curr.data > x) {
            prev = curr;
            curr = curr.next;
        }

        if (prev !=null) {
            prev.next = null;
        }
        SinglyLinkedListNode newHead = curr;

        while (curr.next !=null) {
            if (curr.next.data > x) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return newHead;
    }
}
