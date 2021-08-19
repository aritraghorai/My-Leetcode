
/*
 !Name: Aritra Ghorai
 !Date:19/08/2021
 ?Program Details: 357. Count Numbers with Unique Digits
 *https://leetcode.com/problems/count-numbers-with-unique-digits/
   */
public class Q105_Count_Number_Of_Unique_Digit {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(countNumbersWithUniqueDigits(a));
    }

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        int[] storage = new int[n + 1];
        storage[0] = 1;
        storage[1] = 9;
        storage[2] = 81;
        int result = 10;
        int duplicate = 0;
        for (int i = 2; i <= n; i++) {
            duplicate = duplicate * 10 + storage[i - 1] * (i - 1);
            storage[i] = (int) Math.pow(10, i) - (int) Math.pow(10, i - 1) - duplicate;
            result += storage[i];
        }
        return result;
    }
}
