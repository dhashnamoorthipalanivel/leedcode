public class ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder st = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    st.append(Character.toLowerCase(c));
                }
            }
            for (int i = 0; i < st.length() / 2; i++) {
                if (st.charAt(i) != st.charAt(st.length() - i - 1))
                    return false;
            }
            return true;
        }
    }
}
