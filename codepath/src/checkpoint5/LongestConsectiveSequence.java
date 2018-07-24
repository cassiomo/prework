/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Example:
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.

NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
*/

package checkpoint5;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsectiveSequence {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        if(A == null || A.length == 0)
            return 0;
        int n = A.length;
        Arrays.sort(A);

        int count = 1;
        int total = 1;
        for(int i = 1; i < n; i++) {
            if(A[i]!=A[i-1]) {
                if(A[i] == A[i-1] + 1) {
                    count++;
                } else {
                    total = Math.max(total, count);
                    count = 1;
                }

            }
        }
        return Math.max(total, count);
    }
}
