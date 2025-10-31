class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for (int num : nums) {
            if (!s1.contains(num))
                s1.add(num);
            else
                s2.add(num);
        }

        int[] arr = new int[s2.size()];
        int i = 0;
        for (int num : s2) {
            arr[i++] = num;
        }

        return arr;
    }
}
