class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();  
        String vowel = "AEIOUaeiou";
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (vowel.indexOf(str[l]) != -1 && vowel.indexOf(str[r]) != -1) {
                // swap
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
                l++;
                r--;
            } else if (vowel.indexOf(str[l]) == -1) {
                l++;
            } else {
                r--;
            }
        }
        return new String(str);
    }
}
