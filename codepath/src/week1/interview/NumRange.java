/*
Given an array of non negative integers A, and a range (B, C),
find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]
where 0 <= i <= j < size(A)

Example :

A : [10, 5, 1, 0, 2]
(B, C) : (6, 8)
ans = 3
as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]

NOTE : The answer is guranteed to fit in a 32 bit signed integer.
NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.

*/


package week1.interview;

import java.util.ArrayList;

public class NumRange {
    public int numRange(ArrayList<Integer> A, int B, int C) {
        int count = 0;
        int sz = A.size();
        for (int i = 0; i < sz; i++) {
            int j = i;
            int sum = 0;
            while (j < sz) {
                sum = sum + A.get(j);
                if (sum >= B && sum <= C) {
                    count++;
                }
                if (sum > C) {
                    break;
                }
                j++;
            }
        }
        return count;
    }
}