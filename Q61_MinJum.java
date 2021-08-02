import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:02/08/2021
 ?Program Details: 55. Jump Game
 *https://leetcode.com/problems/jump-game/
   */
public class Q61_MinJum {
  public static boolean canJump(int[] nums) {
    // return canJump(nums, 0, new int[nums.length + 1]);
    int lastIndex = nums.length - 1;
    for (int i = lastIndex; i >= 0; i--) {
      if (i + nums[i] >= lastIndex) {
        lastIndex = i;
      }
    }
    return lastIndex == 0;
  }

  public static boolean canJump(int[] nums, int index, int[] storage) {
    if (index == nums.length - 1) {
      return true;
    }
    if (index >= nums.length) {
      return false;
    }
    if (storage[index] != 0) {
      return true;
    }
    boolean isJim = false;
    for (int i = 1; i <= nums[index]; i++) {
      isJim = isJim || canJump(nums, index + i, storage);
    }
    if (isJim == true)
      storage[index] = 1;
    return isJim;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println(canJump(nums));
    sc.close();
  }

}
