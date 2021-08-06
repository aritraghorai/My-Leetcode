/*
 !Name: Aritra Ghorai
 !Date:06/08/2021
 ?Program Details: 485. Max Consecutive Ones
 *https://leetcode.com/problems/max-consecutive-ones/
   */
public class Q72_MaxConsicutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int a : nums) {
            if (a == 1) {
                count++;
            } else {
                maxCount = count > maxCount ? count : maxCount;
                count = 0;
            }
        }
        maxCount = count > maxCount ? count : maxCount;
        return maxCount;
    }
}
