/*
 !Name: Aritra Ghorai
 !Date:13/10/2021
 ?Program Details:Single Number II
 *https://leetcode.com/problems/single-number-ii/
   */
public class Q176_Sigle_Number_Two {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = ((ones ^ num) & (~twos));
            twos = ((twos ^ num) & (~ones));
        }
        return ones;
    }
}
