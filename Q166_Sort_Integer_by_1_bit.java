import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:22/09/2021
 ?Program Details:1356. Sort Integers by The Number of 1 Bits
 *https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/ 
   */
public class Q166_Sort_Integer_by_1_bit {
  public int[] sortByBits(int[] arr) {
    int[][] nums = new int[arr.length][2];
    for (int i = 0; i < nums.length; i++) {
      nums[i][0] = arr[i];
      nums[i][1] = Integer.bitCount(arr[i]);
    }
    Arrays.sort(nums, (a, b) -> {
      return a[1] == b[1] ? a[0] - b[0] : a[1] - b[1];
    });
    for (int i = 0; i < arr.length; i++) {
      arr[i] = nums[i][0];
    }
    return arr;
  }
}
