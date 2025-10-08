class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

       for(int num : nums1){
        s1.add(num);
       }

       for(int num : nums2){
        s2.add(num);
       }

       ArrayList<Integer> l1 = new ArrayList<>();
       ArrayList<Integer> l2 = new ArrayList<>();

       for(int n : s1){
        if(!s2.contains(n)) l1.add(n);
       }

       for(int n : s2){
        if(!s1.contains(n)) l2.add(n);
       }

       ArrayList<List<Integer>> fl = new ArrayList<>();
       fl.add(l1);
       fl.add(l2);

       return fl;
    }
}