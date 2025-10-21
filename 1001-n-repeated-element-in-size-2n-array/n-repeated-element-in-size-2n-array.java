class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int n = 0;
        for(int num : nums){
            if(!s.contains(num)) s.add(num);
            else n = num;
        }
        return n;
    }
}