/*
Given a collection of numbers that might contain duplicates, return all possible unique permutations.

Example :
[1,1,2] have the following unique permutations:

[1,1,2]
[1,2,1]
[2,1,1]
NOTE : No 2 entries in the permutation sequence should be the same.
Warning : DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.
NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
*/

package checkpoint5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class AllUnquiePermutations {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Collections.sort(A);
        backtrack(list, new ArrayList<>(), A, new boolean[A.size()]);
        return list;
    }

    private void backtrack(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> tempList,
                           ArrayList<Integer> nums, boolean [] used){
        if(tempList.size() == nums.size()){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.size(); i++){
                if(used[i] || i > 0
                        && nums.get(i) == nums.get(i-1)
                        && !used[i - 1])
                    continue;
                used[i] = true;
                tempList.add(nums.get(i));
                backtrack(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
