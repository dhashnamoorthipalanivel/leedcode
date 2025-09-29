import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        String[] phone = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();
        result.add("");


        for (int i = 0; i < digits.length(); i++) {
            int d = digits.charAt(i) - '0';  
            String letters = phone[d];       


            List<String> temp = new ArrayList<>();
            for (String s : result) {
                for (char c : letters.toCharArray()) {
                    temp.add(s + c);
                }
            }

            result = temp; 
        }

        return result;
    }
}
