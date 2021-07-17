package Array;

import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:08/07/2021
 ?Program Details:Remove Certail Element From The Array
   */
public class Q3_RemoveEliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        sc.close();
        int a = RemoveCertailElement(nums, b);
        System.out.println(a);
        for (int i = 0; i < a; i++) {
            System.out.print(nums[i] + " ");

        }
    }

    public static int RemoveCertailElement(int[] nums, int n) {
        if (nums.length == 1) {
            if (nums[0] == n) {
                return 0;
            } else
                return 1;
        }
        if (nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != n) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

}
