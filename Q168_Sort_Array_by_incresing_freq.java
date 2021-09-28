import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:26/09/2021
 ?Program Details:1636. Sort Array by Increasing Frequency
 *https://leetcode.com/problems/sort-array-by-increasing-frequency/ 
   */
public class Q168_Sort_Array_by_incresing_freq {
  public int[] frequencySort(int[] nums) {
    var map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    int[][] arr = new int[nums.length][2];
    for (int i = 0; i < nums.length; i++) {
      arr[i][0] = nums[i];
      arr[i][1] = map.get(nums[i]);
    }
    Arrays.sort(arr, (a, b) -> {
      return a[1] == b[1] ? a[0] - b[0] : a[1] - b[1];
    });
    for (int i = 0; i < nums.length; i++) {
      nums[i] = arr[i][0];
    }
    return nums;
  }
}
