// 917. Reverse Only Letters
// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

 

// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"
// Example 2:

// Input: s = "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"
// Example 3:

// Input: s = "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (Character.isLetter(arr[l]) && Character.isLetter(arr[r])) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (!Character.isLetter(arr[l])) {
                l++;
            } else {
                r--;
            }
        }
        return new String(arr); 
    }
}
