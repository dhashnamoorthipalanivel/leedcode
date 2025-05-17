import java.util.*;

// 27. Remove Element
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (num != val) {
                list.add(num);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}
