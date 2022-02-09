import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z.
 *
 * Let x be any string in the first array and y be any string in the second array.
 *
 * Find max(abs(length(x) − length(y)))
 *
 * If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
 * **/

public class MaxDifference {

    public static int maxDifference(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        List<Integer> temp = new ArrayList<>();
        for (String a: a1) {
            for (String b: a2) {
                temp.add(Math.abs(a.length() - b.length()));
            }
        }
        return Collections.max(temp);
    }
}
