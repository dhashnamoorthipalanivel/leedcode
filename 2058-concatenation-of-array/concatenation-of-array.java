class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<=1;i++){
            for(int j=0;j<nums.length;j++){
                l.add(nums[j]);
            }
        }

        int[] arr = new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i] = l.get(i);
        }

        return arr;
    }
}