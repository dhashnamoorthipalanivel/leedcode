// 1417. Reformat The String
// You are given an alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).

// You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. That is, no two adjacent characters have the same type.

// Return the reformatted string or return an empty string if it is impossible to reformat the string.

 

// Example 1:

// Input: s = "a0b1c2"
// Output: "0a1b2c"
// Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.
// Example 2:

// Input: s = "leetcode"
// Output: ""
// Explanation: "leetcode" has only characters so we cannot separate them by digits.
// Example 3:

// Input: s = "1229857369"
// Output: ""
// Explanation: "1229857369" has only digits so we cannot separate them by characters.

class Solution {
    public String reformat(String s) {

        StringBuilder num = new StringBuilder();
        StringBuilder chara = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num.append(ch);
            }
            else{
                chara.append(ch);
            }
        }

        if (Math.abs(num.length() - chara.length()) > 1) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        boolean digitTurn = num.length() >= chara.length();
        int i = 0, j = 0;

        while (i < num.length() || j < chara.length()) {
            if (digitTurn && i < num.length()) {
                res.append(num.charAt(i++));
            } else if (!digitTurn && j < chara.length()) {
                res.append(chara.charAt(j++));
            }
            digitTurn = !digitTurn;
        }

        return res.toString();

        
    }
}