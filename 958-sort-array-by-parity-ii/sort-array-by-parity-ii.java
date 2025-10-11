class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int e = 0;
        int o = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[e] = num;
                e += 2;
            } else {
                arr[o] = num;
                o += 2;
            }
        }
        return arr;
    }
}