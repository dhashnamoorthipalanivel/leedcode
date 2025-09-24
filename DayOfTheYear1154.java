// 1154. Day of the Year
// Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

// Example 1:

// Input: date = "2019-01-09"
// Output: 9
// Explanation: Given date is the 9th day of the year in 2019.
// Example 2:

// Input: date = "2019-02-10"
// Output: 41


class Solution {
    public int dayOfYear(String date) {
        int day = 0;
        String[] parts = date.split("-");
        int[] arr = new int[parts.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int year = arr[0];
        int month = arr[1];
        int dayOfMonth = arr[2]; 

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        switch (month) {
            case 1: // January
                day += dayOfMonth;
                break;
            case 2: // February
                day += 31 + dayOfMonth;
                break;
            case 3: // March
                day += 31 + (isLeap ? 29 : 28) + dayOfMonth;
                break;
            case 4: // April
                day += 31 + (isLeap ? 29 : 28) + 31 + dayOfMonth;
                break;
            case 5: // May
                day += 31 + (isLeap ? 29 : 28) + 31 + 30 + dayOfMonth;
                break;
            case 6: // June
                day += 31 + (isLeap ? 29 : 28) + 31 + 30 + 31 + dayOfMonth;
                break;
            case 7: // July
                day += 31 + (isLeap ? 29 : 28) + 31 + 30 + 31 + 30 + dayOfMonth;
                break;
            case 8: // August
                day += 31 + (isLeap ? 29 : 28) + 31 + 30 + 31 + 30 + 31 + dayOfMonth;
                break;
            case 9: // September
                day += 31 + (isLeap ? 29 : 28) + 31 + 30 + 31 + 30 + 31 + 31 + dayOfMonth;
                break;
            case 10: // October
                day += 31 + (isLeap ? 29 : 28) + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dayOfMonth;
                break;
            case 11: // November
                day += 31 + (isLeap ? 29 : 28) + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dayOfMonth;
                break;
            case 12: // December
                day += 31 + (isLeap ? 29 : 28) + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dayOfMonth;
                break;
            default:
                System.out.println("Invalid month");
        }

        return day; 
    }
}
