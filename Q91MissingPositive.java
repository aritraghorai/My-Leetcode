import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:11/08/2021
 ?Program Details: 41. First Missing Positive
 *https://leetcode.com/problems/first-missing-positive/
   */
public class Q91MissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] <= nums.length && nums[i] > 0 && i != nums[i] - 1 && nums[i] != nums[nums[i] - 1]) {
                int index = nums[i] - 1;
                // int temp = nums[i];
                // nums[i] = nums[index];
                // nums[index] = temp;
                // * Swap
                nums[i] = nums[i] ^ nums[index];
                nums[index] = nums[i] ^ nums[index];
                nums[i] = nums[i] ^ nums[index];
            }
        }
        int i = 0;
        for (i = 0; i < n; i++) {
            if (i + 1 != nums[i]) {
                return i + 1;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(firstMissingPositive(nums));
    }
}
