class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        int c = 0;
        HashMap<Character,Integer> m = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }

        boolean oddFound = false;
        for(int val : m.values()){
            if(val % 2 == 0) c+= val;
            else{
                c += val - 1;
                oddFound = true;
            }
        }

        if(oddFound) c+=1;
        return c;
    }
}