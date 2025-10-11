class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();

        ArrayList<Integer> numsl = new ArrayList<>();

        for (int num : nums2) {
            numsl.add(num);
        }

        int i = 0;
        while (i < nums1.length) {
            int n = numsl.indexOf(nums1[i]);
            int find = -1;
            for (int j = n+1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    find = nums2[j];
                    break;
                }
            }
            l.add(find);
            i++;
        }

        int[] arr = new int[l.size()];
        for (int k = 0; k < l.size(); k++) {
            arr[k] = l.get(k);
        }
        return arr;
    }
}