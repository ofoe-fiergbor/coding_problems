/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * */


public class ReverseInteger {
    public static int reverse(int integer) {

        long reversed = 0;

        while (integer != 0) {
            reversed = reversed * 10 + integer % 10;
            integer /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
}
