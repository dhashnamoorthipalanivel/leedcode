import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

       
        ArrayList<Integer> nums2List = new ArrayList<>();
        for (int num : nums2) {
            nums2List.add(num);
        }

        
        for (int i = 0; i < nums1.length; i++) {
            if (nums2List.contains(nums1[i])) {
                list.add(nums1[i]);
                nums2List.remove(Integer.valueOf(nums1[i])); 
            }
        }

        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
