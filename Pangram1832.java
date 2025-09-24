// 1832. Check if the Sentence Is Pangram

// A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

// Example 1:

// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.
// Example 2:

// Input: sentence = "leetcode"
// Output: false

import java.util.HashSet;

public class Pangram1832 {
    class Solution {
        public boolean checkIfPangram(String sentence) {
            // String s = sentence.toLowerCase();
            HashSet<Character> c = new HashSet<>();

            for (int i = 0; i < sentence.length(); i++) {
                if (!c.contains(sentence.charAt(i))) {
                    c.add(sentence.charAt(i));
                }
            }

            if (c.size() == 26)
                return true;
            return false;
        }
    }
}
