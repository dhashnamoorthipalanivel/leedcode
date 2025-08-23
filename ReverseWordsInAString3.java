public class ReverseWordsInAString3 {
    class Solution {
        public String reverseWords(String s) {
            String[] st = s.split(" ");
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < st.length; i++) {
                String word = st[i];
                sb.append(new StringBuilder(word).reverse());

                if (i < st.length - 1) {
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
    }
}
