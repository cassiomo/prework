/*
Given a singly linked list, modify the value of first half nodes such that :

1st node’s new value = the last node’s value - first node’s current value
2nd node’s new value = the second last node’s value - 2nd node’s current value,
and so on …

NOTE :
If the length L of linked list is odd, then the first half implies at first floor(L/2) nodes. So, if L = 5, the first half refers to first 2 nodes.
If the length L of linked list is even, then the first half implies at first L/2 nodes. So, if L = 4, the first half refers to first 2 nodes.
Example :

Given linked list 1 -> 2 -> 3 -> 4 -> 5,

You should return 4 -> 2 -> 3 -> 4 -> 5
as

for first node, 5 - 1 = 4
for second node, 4 - 2 = 2
Try to solve the problem using constant extra space.

NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
*/



package checkpoint.checkpoint4;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Subtract {
    public ListNode subtract(ListNode A) {

        ListNode slow =A;
        ListNode fast=A;


        ListNode head = A;

        ListNode middle = null;

        while(fast!=null && fast.next!=null)
        {

            if(fast.next.next!=null) // in case numOfNodes are even , we need to stay at middle
                slow=slow.next;
            fast = fast.next.next;

        }
        if(slow==fast)
            return A;

        middle = slow;
        ListNode secondHalf = middle.next;
        middle.next = null;

        ListNode reversed = reverse(secondHalf);

        ListNode  temp1  = reversed;

        while(temp1!=null ){
            head.val = temp1.val - head.val;
            temp1 = temp1.next;
            head = head.next;
        }

        middle.next = reverse(reversed);


        return A;

    }


    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode previous = null;

        while(current!=null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;

        }

        return previous;
    }

}




