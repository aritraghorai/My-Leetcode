import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:28/07/2021
 ?Program Details: 283. Move Zeroes
 *https://leetcode.com/problems/move-zeroes/
   */
public class Q52MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }
        for (int i = idx; i < nums.length; i++) {
            nums[idx++] = 0;
        }
    }
}
