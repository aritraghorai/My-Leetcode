package Array;

import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:06/07/2021
 ?Program Details: Remove Duplicate Eliment Using Two Pointer after delete you have to return number of eliment
   */
public class Q2_RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int i = 0;
        int j = 1;
        int count = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[count] = nums[i];
                count++;
                i = j;

                j++;
            }
        }
        if (nums[i] == nums[j - 1]) {
            nums[count] = nums[i];
            count++;
        }

        return count;
    }
}
