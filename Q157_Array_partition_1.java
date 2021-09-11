import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:11/09/2021
 ?Program Details:561. Array Partition I
 *https://leetcode.com/problems/array-partition-i/ 
   */
public class Q157_Array_partition_1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}
