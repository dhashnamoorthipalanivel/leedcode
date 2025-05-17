import java.util.*;

// 26. Remove Duplicates from Sorted Array
public class RemoveDuplicateArray {

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
