/*
 !Name: Aritra Ghorai
 !Date:09/09/2021
 ?Program Details:540. Single Element in a Sorted Array
 *https://leetcode.com/problems/single-element-in-a-sorted-array/ 
   */
public class Q152_Search_Single_In_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

}
