class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum = numBottles;
        int empty = numBottles;

        while(empty >= numExchange){
            empty = empty - numExchange;
            sum++;
            numExchange++;
            empty++;
        }
        return sum;
    }
}