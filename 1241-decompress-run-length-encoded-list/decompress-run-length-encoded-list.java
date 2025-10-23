class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int n = nums[i];
            for (int j = 0; j < n; j++) {
                l.add(nums[i + 1]);
            }
        }
        int[] arr = new int[l.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = l.get(i);
        }
        return arr;
    }
}