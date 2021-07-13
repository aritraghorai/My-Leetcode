import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:09/07/2021
 ?Program Details:Plas One Problem In Leetcode
   */
public class Q6PlasOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] newDigit = plusOne(nums);
        for (int a : newDigit) {
            System.out.print(a + " ");
        }
        sc.close();
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            int[] arr = new int[1];
            arr[0]++;
            return arr;
        }
        int i = digits.length - 1;
        while (i != -1) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
                i--;
            }
        }
        if (digits[0] == 0) {
            int[] newDigit = new int[digits.length + 1];
            newDigit[0] = 1;
            return newDigit;
        }
        return digits;
    }
}
