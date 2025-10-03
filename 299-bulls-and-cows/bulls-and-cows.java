class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        int b = 0;
        int[] sCount = new int[10]; 
        int[] gCount = new int[10]; 

        for (int i = 0; i < secret.length(); i++) {
            char g = guess.charAt(i);
            if (secret.charAt(i) == g) {
                c++; 
            } else {
                sCount[secret.charAt(i) - '0']++; 
                gCount[g - '0']++;               
            }
        }

        for (int i = 0; i < 10; i++) {
            b += Math.min(sCount[i], gCount[i]); 
        }

        sb.append(c + "A");
        sb.append(b + "B");

        return sb.toString();
    }
}
