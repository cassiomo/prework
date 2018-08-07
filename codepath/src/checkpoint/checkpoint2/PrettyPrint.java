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


package checkpoint.checkpoint2;

import java.util.ArrayList;

public class PrettyPrint {

    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(A<=0) return result;

        int n = 2*A-1;
        int[][] matrix = new int[n][n];
        int layers = A;

        for(int i = 0; i<layers; i++){
            if(i == layers-1){
                matrix[i][i] = A;
            }else{
                for(int j = i; j<n-1-i; j++){
                    matrix[i][j] = A;
                    matrix[j][n-1-i] = A;
                    matrix[n-1-i][n-1-j] = A;
                    matrix[n-1-j][i] = A;
                }
            }
            A--;
        }
        for(int i = 0; i<n; i++){
            ArrayList<Integer> l = new ArrayList<Integer>();
            for(int j = 0; j<n; j++){
                l.add(matrix[i][j]);
            }
            result.add(l);
        }
        return result;
    }
}


