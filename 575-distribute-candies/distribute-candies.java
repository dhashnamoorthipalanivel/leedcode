class Solution {
    public int distributeCandies(int[] candyType) {
       HashSet<Integer> s = new HashSet<>();
       for(int num : candyType) s.add(num);
       int n = candyType.length / 2;

       int max = Math.min(s.size(),n);
       
       return max;
    }
}