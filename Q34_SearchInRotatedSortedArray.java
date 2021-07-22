import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:21/07/2021
 ?Program Details: 33.Search in Rotated Sorted Array
 *https://leetcode.com/problems/search-in-rotated-sorted-array/
   */
public class Q34_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(nums, target));
        sc.close();
    }

    public static int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        if (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;

    }
}
