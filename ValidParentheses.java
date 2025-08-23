import java.util.*;

public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    st.push(c);
                } else if (c == ')') {
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else if (c == ']') {
                    if (!st.isEmpty() && st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else if (c == '}') {
                    if (!st.isEmpty() && st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
            return st.isEmpty();
        }
    }

    // Using Stack method => for "Last in First Out"
    // 1. push => used to add the data to the Stack
    // 2. Peek => this is give the last element in Stack
    // 3. pop => used to remove the last element in stack
}
