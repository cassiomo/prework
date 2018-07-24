/*
Given an array, find the next greater element G[i] for every element A[i] in the array. The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array.
More formally,

G[i] for an element A[i] = an element A[j] such that
j is minimum possible AND
j > i AND
A[j] > A[i]
Elements for which no greater element exist, consider next greater element as -1.

Example:

Input : A : [4, 5, 2, 10]
Output : [5, 10, 10, -1]

Example 2:

Input : A : [3, 2, 1]
Output : [-1, -1, -1]

NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.


*/


package checkpoint4;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public int[] nextGreater(int[] A) {
        int[] res = new int[A.length];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            int height = A[i];
            while (!stack.isEmpty() && height > A[stack.peek()]) {
                res[stack.pop()] = height;
            }
            stack.push(i);
        }
        return res;
    }
}
