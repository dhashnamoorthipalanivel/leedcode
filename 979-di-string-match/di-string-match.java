class Solution {
    public int[] diStringMatch(String s) {
        int l = 0;
        int h = s.length();
        int[] arr = new int[h + 1];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I')
                arr[i] = l++;
            else
                arr[i] = h--;
        }
        arr[arr.length - 1] = l;
        return arr;
    }
}