
/**
 *Write a function that takes in a string of one or more words,
 *
 * and returns the same string, but with all five or more letter words reversed
 *
 * (Just like the name of this Kata). Strings passed in will consist of only letters and spaces.
 *
 * Spaces will be included only when more than one word is present.
 *
 * Examples: spinWords("Hey fellow warriors") => returns "Hey wollef sroirraw"
 *          spinWords("This is a test") => returns "This is a test"
 *          spinWords("This is another test") => returns "This is rehtona test"
 * */

public class WordSpin {

    public static String spinWords(String sentence){
        var arr = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        for (String a: arr) {
            if (a.length() < 5) {
                res.append(a).append(" ");
            } else {
                res2.append(a).reverse();
                res.append(res2.toString()).append(" ");
                res2.setLength(0);
            }
        }

        return res.toString().trim();
    }
}
