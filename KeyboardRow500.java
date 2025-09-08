// 500. Keyboard Row
// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

// Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

 

// Example 1:

// Input: words = ["Hello","Alaska","Dad","Peace"]

// Output: ["Alaska","Dad"]

// Explanation:

// Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

// Example 2:

// Input: words = ["omk"]

// Output: []

// Example 3:

// Input: words = ["adsdf","sfd"]

// Output: ["adsdf","sfd"]

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> sl = new ArrayList<>();
        
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        
        for (int i = 0; i < words.length; i++) {
            String st = words[i].toLowerCase();
            boolean inRow1 = true, inRow2 = true, inRow3 = true;
            
            for (int j = 0; j < st.length(); j++) {
                char c = st.charAt(j);
                if (!r1.contains(c + "")) inRow1 = false;
                if (!r2.contains(c + "")) inRow2 = false;
                if (!r3.contains(c + "")) inRow3 = false;
            }
            
            if (inRow1 || inRow2 || inRow3) {
                sl.add(words[i]);
            }
        }
        
        return sl.toArray(new String[0]);
    }
}
