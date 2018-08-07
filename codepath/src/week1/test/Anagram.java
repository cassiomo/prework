package week1.test;

/**
 * Created by k.mo on 8/6/18.
 *
 *
 * input:
 *
 *
 */

//input:
//        5
//        aaabbb
//        ab
//        abc
//        mnop
//        xyyx

import java.io.*;
import java.util.*;

public class Anagram {
    public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i<t; i++){
            String str = scan.nextLine();
            int[] lettersArray = new int[26];
            int changes = 0;
            if (str.length() % 2 == 0){
                for (int j = 0; j<str.length()/2; j++){
                    lettersArray[str.charAt(j)-'a']++;
                }
                for (int j = str.length()/2; j<str.length(); j++){
                    if(lettersArray[str.charAt(j)-'a'] > 0)
                        lettersArray[str.charAt(j)-'a']--;
                }
                for (int j = 0; j<26; j++){
                    changes += lettersArray[j];
                }
                System.out.println(changes);
            } else{
                System.out.println(-1);
            }
        }
    }
}
