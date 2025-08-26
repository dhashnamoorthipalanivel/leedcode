// 14. Longest Common Prefix

// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

import java.util.*;
public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String f = strs[0];
            String l = strs[strs.length - 1];
            int i = 0;
            while (i < f.length() && i < l.length() && f.charAt(i) == l.charAt(i)) {
                i++;
            }
            if (i == 0)
                return "";
            return f.substring(0, i);
        }
    }
}
