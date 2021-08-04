import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:03/08/2021
 ?Program Details: 45. Jump Game II
 *https://leetcode.com/problems/jump-game-ii/
   */
public class Q62MinJum2 {
    public static int jump(int[] nums) {
        // return jump(nums, 0, new int[nums.length]);
        int[] arr = new int[nums.length];
        int min = 100000;
        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = i + 1; j <= i + (nums[i]); j++) {
                if (j == nums.length) {
                    break;
                }
                min = Math.min(min, arr[j]);
            }
            arr[i] = min + 1;
            min = 100000;
        }
        return arr[0];
    }

    public static int jump(int[] nums, int index, int[] storage) {
        if (index >= nums.length - 1) {
            return 0;
        }
        int min = 100000;
        for (int i = 1; i <= nums[index]; i++) {
            int rec = jump(nums, index + i, storage);
            min = Math.min(rec + 1, min);
        }
        storage[index] = min;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(jump(nums));
        sc.close();
    }
}
