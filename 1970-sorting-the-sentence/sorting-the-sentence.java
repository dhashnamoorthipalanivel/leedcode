class Solution {
    public String sortSentence(String s) {
        String[] sArr = s.split(" ");
        String[] srArr = new String[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            int n = sArr[i].charAt(sArr[i].length() - 1) - '0'; 
            srArr[n - 1] = sArr[i].substring(0, sArr[i].length() - 1); 
        }

        return String.join(" ", srArr);
    }
}