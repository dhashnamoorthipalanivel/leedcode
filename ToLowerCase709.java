// 709. To Lower Case
// Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

// Example 1:

// Input: s = "Hello"
// Output: "hello"
// Example 2:

// Input: s = "here"
// Output: "here"
// Example 3:

// Input: s = "LOVELY"
// Output: "lovely"

class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            if (l >= 'A' && l <= 'Z') {
                l = (char)(l + 32); 
            }
            sb.append(l); 
        }
        return sb.toString();
    }
}
