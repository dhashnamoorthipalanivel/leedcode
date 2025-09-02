// 169. Majority Element
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

package Arrays;

import java.util.HashMap;

public class MajorityElement169 {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
            }

            int majority = nums[0];
            int maxCount = 0;

            for (int n : m.keySet()) {
                if (m.get(n) > maxCount) {
                    maxCount = m.get(n);
                    majority = n;
                }
            }

            return majority;
        }
    }
}
