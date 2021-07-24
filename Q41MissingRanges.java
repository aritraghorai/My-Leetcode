import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:24/07/2021
 ?Program Details:268. Missing Number
 *https://leetcode.com/problems/missing-number/
   */
public class Q41MissingRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i] ^ (i + 1);
        }
        return num;
    }
}
