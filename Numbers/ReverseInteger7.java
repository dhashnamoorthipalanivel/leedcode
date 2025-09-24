// 7. Reverse Integer
// s
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21

public class ReverseInteger7 {
    class Solution {
        public int reverse(int x) {
            int n = 0;
            while (x != 0) {
                int d = x % 10;

                if (n > Integer.MAX_VALUE / 10 || (n == Integer.MAX_VALUE / 10 && d > 7))
                    return 0;
                if (n < Integer.MIN_VALUE / 10 || (n == Integer.MIN_VALUE / 10 && d < -8))
                    return 0;

                n = n * 10 + d;
                x /= 10;
            }
            return n;
        }
    }

}
