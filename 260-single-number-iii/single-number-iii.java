class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            m.put(n,m.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int num : m.keySet()){
            if(m.get(num) == 1) l.add(num);
        }
        int[] arr = new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
}