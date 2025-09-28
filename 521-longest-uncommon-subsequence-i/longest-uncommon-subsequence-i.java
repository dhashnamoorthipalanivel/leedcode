class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length() == b.length()){
            if(a.contains(b)) return -1;
        }
        return Math.max(a.length(),b.length());
    }
}