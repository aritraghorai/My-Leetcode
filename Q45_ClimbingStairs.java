import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:26/07/2021
 ?Program Details: 70. Climbing Stairs
 *https://leetcode.com/problems/climbing-stairs
   */
public class Q45_ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n, new int[n + 1]));
        sc.close();
    }

    public static int climbStairs(int n, int[] memory) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        int result = climbStairs(n - 1, memory) + climbStairs(n - 2, memory);
        memory[n] = result;
        return result;
    }
}
