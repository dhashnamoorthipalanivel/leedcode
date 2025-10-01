class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int sum = numBottles;
       while(numBottles >= numExchange){
        int e = numBottles / numExchange;
        int r = numBottles % numExchange;
        sum += e;
        numBottles = e+r;
       }
       return sum; 
    }
}