class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != c) return i;
            else c++;
        }
        return c;
    }
}