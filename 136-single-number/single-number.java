import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        for (int n : m.keySet()) {
            if (m.get(n) == 1) {
                return n;
            }
        }

        return -1; 
    }
}
