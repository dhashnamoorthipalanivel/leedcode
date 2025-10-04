class Solution {
    public String removeDuplicateLetters(String s) {
        boolean [] seen = new boolean [26];
        int [] freq=new int[26];
        for(int i =0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            freq[c-'a']--;


            if(seen[c-'a']) continue;
            while(!st.isEmpty() && c < st.peek() && freq[st.peek()-'a'] > 0 ) {
                seen[st.pop() - 'a'] = false;
            }


            st.push(c);
            seen[c-'a']=true;
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()) {
            sb.append(st.pop());
        }


        return sb.reverse().toString();
    }
}