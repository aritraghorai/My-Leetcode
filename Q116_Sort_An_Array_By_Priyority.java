import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:24/08/2021
 ?Program Details: 905. Sort Array By Parity
 *https://leetcode.com/problems/sort-array-by-parity/
   */
public class Q116_Sort_An_Array_By_Priyority {
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            if ((nums[j] & 1) == 0) {
                int a = nums[i];
                nums[i] = nums[j];
                nums[j] = a;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        var result = sortArrayByParity(nums);
        for (int a : result)
            System.out.print(a + " ");
    }
}
