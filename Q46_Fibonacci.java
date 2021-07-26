/*
 !Name: Aritra Ghorai
 !Date:26/07/2021
 ?Program Details:509. Fibonacci Number
 *https://leetcode.com/problems/fibonacci-number/ 
   */
public class Q46_Fibonacci {
    public static void main(String[] args) {

    }

    public static int fib(int n, int[] memory) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        int result = fib(n - 1, memory) + fib(n - 1, memory);
        memory[n] = result;
        return result;
    }
}
