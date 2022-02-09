import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * **/

public class ValidParenthesis {

    public static boolean isValid(String s) {
        Map<Character, Character> bracketMap = new HashMap<>();
            bracketMap.put(')','(');
            bracketMap.put(']','[');
            bracketMap.put('}','{');

            if (bracketMap.containsKey(s.charAt(0))) return false;

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                if (bracketMap.containsValue(s.charAt(i))) {
                    stack.push(s.charAt(i));
                };

                if (!stack.isEmpty() && bracketMap.get(s.charAt(i)) == stack.peek()) {
                    stack.pop();
                }
            }
        return stack.isEmpty();
    }
}
