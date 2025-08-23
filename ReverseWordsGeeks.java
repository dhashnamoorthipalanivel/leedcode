public class ReverseWordsGeeks {
    class Solution {
        public String reverseWords(String s) {
            String[] st = s.trim().split("\\.+");
            StringBuilder sb = new StringBuilder();
            for (int i = st.length - 1; i >= 0; i--) {
                if (st[i].isEmpty())
                    continue;
                sb.append(st[i]);
                if (i > 0 && !st[i - 1].isEmpty()) {
                    sb.append(".");
                }
            }
            return sb.toString();
        }
    }
}
