// package leedcode;

import java.util.LinkedHashSet;

public class RemoveDuplicateSortArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            int i = 0;
            for (int val : set) {
                nums[i++] = val;
            }
            return set.size();
        }
    }
}
