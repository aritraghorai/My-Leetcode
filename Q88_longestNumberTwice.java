/*
 !Name: Aritra Ghorai
 !Date:10/08/2021
 ?Program Details: 747. Largest Number At Least Twice of Others
 *https://leetcode.com/problems/largest-number-at-least-twice-of-others/
   */
public class Q88_longestNumberTwice {
  public int dominantIndex(int[] nums) {
    int largest = Integer.MIN_VALUE;
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (largest < nums[i]) {
        largest = nums[i];
        index = i;
      }
    }
    for (int a : nums) {
      if (a == largest) {
        continue;
      }
      if ((a * 2) > largest)
        return -1;

    }
    return index;
  }
}
