class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> r = new HashSet<>();

        for(int num : nums1){
            s.add(num);
        }

        for(int num : nums2){
            if(s.contains(num)) r.add(num);
        }

        int[] arr = new int[r.size()];
        int i=0;
        for(int num : r){
            arr[i++] = num;
        }

        return arr;
    }
}