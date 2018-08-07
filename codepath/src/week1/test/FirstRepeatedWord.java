package week1.test;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by k.mo on 8/6/18.
 */
//input
//He had had quite enough of this nonsense.
//output
// had
public class FirstRepeatedWord {
    // Complete the firstRepeatedWord function below.
    static String firstRepeatedWord(String s) {
        if (s == null || s.length() == 0)
            return null;

        String result = null;

        Set<String> set = new HashSet<String>();
        String regex = "\\s+";
        s.replaceAll(","," ");
        s.replaceAll(":"," ");
        s.replaceAll(";"," ");
        s.replaceAll("-"," ");
        s.replaceAll("."," ");

        Pattern p = Pattern.compile(regex);
        String [] words = p.split(s);
        for (String word: words) {
            if (!set.add(word)) {
                return word;
            }
        }
        return null;
    }

}
