import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:08/09/2021
 ?Program Details:367. Valid Perfect Square
 *https://leetcode.com/problems/valid-perfect-square/ 
   */
public class Q145_Perfect_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
