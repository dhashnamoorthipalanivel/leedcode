class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            m.put(n,m.getOrDefault(n,0)+1);
        }

        for(int num : m.values()){
            if(num > 1) return true;
        }

        return false;
    }
}