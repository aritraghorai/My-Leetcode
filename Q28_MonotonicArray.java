import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:19/07/2021
 ?Program Details: 896.Monotonic 
 *https://leetcode.com/problems/monotonic-array/
   */
public class Q28_MonotonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(isMonotonic(nums));

    }

    public static boolean isMonotonic(int[] nums) {
        if (nums.length == 1)
            return true;
        boolean isIncresing = false, isDecresing = false;
        for (int i = 1; i < nums.length; i++) {
            if (!isIncresing && !isDecresing) {
                if (nums[i] > nums[i - 1]) {
                    isIncresing = true;
                } else if (nums[i] < nums[i - 1]) {
                    isDecresing = true;
                }
            }
            if (isDecresing) {
                if (nums[i] <= nums[i - 1]) {

                } else {
                    return false;
                }
            }
            if (isIncresing) {
                if (nums[i] >= nums[i - 1]) {

                } else {
                    return false;
                }
            }

        }
        if (isDecresing) {
            return true;
        } else if (isIncresing) {
            return true;
        }
        return true;
    }
}
