// 796. Rotate String

// Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

// A shift on s consists of moving the leftmost character of s to the rightmost position.

// For example, if s = "abcde", then it will be "bcdea" after one shift.


public class RotateString {
    class Solution {
        public boolean rotateString(String s, String goal) {
            if (s.length() != goal.length())
                return false;
            // if (s.equals(goal)) return true;

            // String rotated = s;
            // int i = 0;

            // while (i < s.length()) {
            // rotated = rotated.substring(1) + rotated.charAt(0);

            // if (rotated.equals(goal)) {
            // return true;
            // }
            // i++;
            // }
            // return false;

            String doubleString = s + s;
            return doubleString.contains(goal);
        }
    }

}
