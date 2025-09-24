// 504. Base 7
// Given an integer num, return a string of its base 7 representation.

 

// Example 1:

// Input: num = 100
// Output: "202"
// Example 2:

// Input: num = -7
// Output: "-10"

class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        int ogNum = num;
        StringBuilder sb = new StringBuilder();
        num = Math.abs(num);
        while(num != 0){
            int d = num % 7;
            sb.append(d);
            num /= 7;
        }
        if(ogNum < 0) sb.append("-");
        return sb.reverse().toString();
    }
}