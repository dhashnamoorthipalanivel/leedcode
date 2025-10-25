class Solution {
    public int totalMoney(int n) {
        int m = 0;
        if (n < 7) {
            for (int i = 1; i <= n; i++)
                m += i;
        } else {
            int wm = 28;
            int w = n / 7;
            int d = n % 7;
            for (int i = 1; i <= w; i++) {
                m += wm;
                wm += 7;
            }
            for (int j = 1; j <= d; j++)
                m += (w + j);
        }
        return m;
    }
}