import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:10/07/2021
 ?Program Details:Palindrome Number In Leetcode
   */

public class Q11Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPalindrome(a));
        sc.close();
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int newNum = 0;
        int rem;
        int old = x;
        while (x != 0) {
            rem = x % 10;
            newNum = (newNum * 10) + rem;
            x /= 10;
        }
        if (newNum == old) {
            return true;
        } else {
            return false;
        }
    }

}
