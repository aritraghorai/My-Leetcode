import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:20/09/2021
 ?Program Details: 922. Sort Array By Parity II
 *https://leetcode.com/problems/sort-array-by-parity-ii/
   */
public class Q161_Sort_Array_By_Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        for (int a : sortArrayByParityII(nums)) {
            System.out.print(a + " ");
        }
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1;
        while (even < nums.length && odd < nums.length) {
            while (even < nums.length && nums[even] % 2 == 0)
                even += 2;
            while (odd < nums.length && nums[odd] % 2 != 0)
                odd += 2;
            if (even < nums.length && odd < nums.length) {
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
            }

        }
        return nums;

    }
}
