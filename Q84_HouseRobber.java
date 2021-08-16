import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:09/08/2021
 ?Program Details: 198. House Robber
*https://leetcode.com/problems/house-robber/
   */
public class Q84_HouseRobber {
    public static int rob(int[] nums) {
        // return rob(nums, 0, new Integer[nums.length]);
        // int[] storage = new int[nums.length + 2];
        // for (int i = nums.length - 1; i >= 0; i--) {
        // storage[i] = Math.max(storage[i + 1], storage[i + 2] + nums[i]);
        // }
        int[] storage = new int[3];
        for (int i = nums.length - 1; i >= 0; i--) {
            storage[0] = Math.max(storage[1], storage[2] + nums[i]);
            storage[2] = storage[1];
            storage[1] = storage[0];
        }
        return storage[0];
    }

    public static int rob(int[] nums, int index, Integer[] storage) {
        if (index >= nums.length) {
            return 0;
        }
        if (storage[index] != null) {
            return storage[index];
        }
        int oneStepCall = rob(nums, index + 1, storage);
        int secondStepCall = rob(nums, index + 2, storage) + nums[index];
        storage[index] = Math.max(oneStepCall, secondStepCall);
        return Math.max(oneStepCall, secondStepCall);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(rob(nums));
    }
}
