import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        boolean[] seen = new boolean[26];  

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m.put(c, m.get(c) - 1); 

            if (seen[c - 'a']) continue;

            while (!st.isEmpty() && c < st.peek() && m.get(st.peek()) > 0) {
                seen[st.pop() - 'a'] = false;
            }

            st.push(c);
            seen[c - 'a'] = true;
        }

        while (!st.isEmpty()) sb.insert(0, st.pop());

        return sb.toString();
    }
}
