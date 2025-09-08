// 459. Repeated Substring Pattern
// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

 

// Example 1:

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.
// Example 2:

// Input: s = "aba"
// Output: false
// Example 3:

// Input: s = "abcabcabcabc"
// Output: true
// Explanation: It is the substring "abc" four times or the substring "abcabc" twice.


// class Solution {
//     public boolean repeatedSubstringPattern(String s) {
//         int c = 0;
//         HashSet<Character> set = new HashSet<>();
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             if(!set.contains(s.charAt(i))){
//                 set.add(s.charAt(i));
//                 sb.append(s.charAt(i));
//                 c++;
//             }
//         }
//         return (s + s).substring(1, 2 * s.length() - 1).contains(s);
//     }
// }

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}