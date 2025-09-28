class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            int sum = (i >= 0 ? num[i] : 0) + (k % 10);
            res.add(sum % 10);
            k = k / 10 + sum / 10; 
            i--;
        }

        Collections.reverse(res);
        return res;
    }
}
