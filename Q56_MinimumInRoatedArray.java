/*
 !Name: Aritra Ghorai
 !Date:31/07/2021
 ?Program Details: 153. Find Minimum in Rotated Sorted Array
 *https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
   */
public class Q56_MinimumInRoatedArray {

    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            // *If The array is sorted
            if (nums[start] <= nums[end])
                return nums[start];
            int mid = start + ((end - start) >> 1);
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
