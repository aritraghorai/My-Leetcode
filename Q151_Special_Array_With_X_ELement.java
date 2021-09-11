/*
 !Name: Aritra Ghorai
 !Date:09/09/2021
 ?Program Details:1608. Special Array With X Elements Greater Than or Equal X
 *https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/ 
   */
public class Q151_Special_Array_With_X_ELement {
  public int specialArray(int[] nums) {
    int[] bucket = new int[1001];
    for (int num : nums) {
      bucket[num]++;
    }

    int n = nums.length;
    for (int i = 0; i < 1001; i++) {
      if (i == n) {
        return i;
      }
      n -= bucket[i];
    }
    return -1;
  }
}
