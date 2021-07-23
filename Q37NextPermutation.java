import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:23/07/2021
 ?Program Details:31.Next Permutation
 *https://leetcode.com/problems/next-permutation/
   */
public class Q37NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        nextPermutation(nums);
        sc.close();
        for (int a : nums) {
            System.out.print(a + " ");
        }
    }

    public static void nextPermutation(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return;
        }
        int i = nums.length - 2, j = nums.length - 1;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if (i >= 0) {
            while (nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);

    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j)
            swap(nums, i++, j--);
    }

    public static void swap(int[] nums, int i, int j) {

        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
