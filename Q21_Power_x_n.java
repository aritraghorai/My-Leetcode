
import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:15/07/2021
 ?Program Details:50. Pow(x, n)
*https://leetcode.com/problems/powx-n/
   */
public class Q21_Power_x_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(myPow(a, n));
        sc.close();
    }

    public static double myPow(double x, int n) {
        if (x <= 0.00001 && x > 0)
            return 0.0;
        if (x == 1.0) {
            return 1.0;
        }
        if (x == -1.0) {
            return (n % 2 == 0) ? 1.0 : -1.0;
        }
        if (n < -100) {
            return 0;
        }
        double ans = (n >= 0) ? power(x, n) : (double) 1 / power(x, n * (-1));
        return ans;
    }

    private static double power(double x, int n) {
        if (n == 0)
            return 1.0;

        if (n % 2 == 0)
            return power(x, n / 2) * power(x, n / 2);
        else
            return power(x, n / 2) * power(x, n / 2) * x;

    }

}
