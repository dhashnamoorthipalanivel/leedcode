// String Rotated by 2 Places
// Given two strings s1 and s2. Return true if the string s2 can be obtained by rotating (in any direction) string s1 by exactly 2 places, otherwise, false.

// Note: Both rotations should be performed in same direction chosen initially.

// Examples:

// Input: s1 = "amazon", s2 = "azonam"
// Output: true
// Explanation: "amazon" can be rotated anti-clockwise by two places, which will make it as "azonam".
// Input: s1 = "geeksforgeeks", s2 = "geeksgeeksfor"
// Output: false
// Explanation: If we rotate "geeksforgeeks" by two place in any direction, we won't get "geeksgeeksfor".
// Input: s1 = "ab", s2 = "ab"
// Output: true
// Explanation: If we rotate "ab" by two place in any direction, we always get "ab".

public class StringRotatedBy2Places {
    class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        if(s1.length() <= 2) return s1.equals(s2);
        
        // left rotaion
        String left = s1.substring(2) + s1.substring(0,2);
        
        // Right rotation
        String right = s1.substring(s1.length()-2) + s1.substring(0,s1.length()-2);
        
        return s2.equals(left) || s2.equals(right);
    }
}
}
