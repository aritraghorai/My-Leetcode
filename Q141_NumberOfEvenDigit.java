/*
 !Name: Aritra Ghorai
 !Date:06/09/2021
 ?Program Details: 1295. Find Numbers with Even Number of Digits
 *https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
   */
public class Q141_NumberOfEvenDigit {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
            if (even(a)) {

                count++;
            }
        }
        return count;
    }

    private boolean even(int a) {
        // int count = 0;
        // while (a > 0) {
        // count++;
        // a /= 10;
        // }
        // return count % 2 == 0;
        // return ((int) Math.log10(a) + 1) % 2 == 0;
        return (((int) Math.log10(a) + 1) & 1) != 0;
    }
}
