// 844. Backspace String Compare

// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".
// Example 2:

// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".
// Example 3:

// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".

public class BackspaceStringCompare844 {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (c == '#') {
                    if (sb1.length() > 0)
                        sb1.deleteCharAt(sb1.length() - 1);
                } else
                    sb1.append(c);
            }

            for (char c : t.toCharArray()) {
                if (c == '#') {
                    if (sb2.length() > 0)
                        sb2.deleteCharAt(sb2.length() - 1);
                } else
                    sb2.append(c);
            }

            return sb1.toString().equals(sb2.toString());
        }
    }
}
