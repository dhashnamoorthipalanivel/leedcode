class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] == 1) return 0;
        int n = nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] != 1) n = i;
        }
        return n;
    }
}