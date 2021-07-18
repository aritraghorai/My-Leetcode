import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:18/07/2021
 ?Program Details:136.Single Number
 *https://leetcode.com/problems/single-number/ 
 *We Solve The program Using XOR(^)Operator
 *Example:0^2=2 and 2^2=0
   */
public class Q26_SingleNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(singleNumber(nums));
  }

  public static int singleNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result ^= nums[i];
    }
    return result;
  }
}
