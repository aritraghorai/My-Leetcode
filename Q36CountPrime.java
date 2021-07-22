import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:22/07/2021
 ?Program Details:204. Count Primes
 *https://leetcode.com/problems/count-primes/
   */
public class Q36CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPrimes(n));
        sc.close();
    }

    public static int countPrimes(int n) {
        if (n == 1 || n == 0 || n == 2) {
            return 0;
        }
        int count = 0;
        boolean[] arr = new boolean[n];
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (arr[i] == false) {
                for (int j = 2 * i; j < n; j += i) {
                    arr[j] = true;
                }
                count++;
            }
        }
        return count;
    }
}
