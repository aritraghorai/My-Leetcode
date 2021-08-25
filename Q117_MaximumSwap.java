
import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:25/08/2021
 ?Program Details: 670. Maximum Swap
 *https://leetcode.com/problems/maximum-swap/
   */
public class Q117_MaximumSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(maximumSwap(a));
        sc.close();
    }

    public static int maximumSwap(int num) {
        // StringBuilder s = new StringBuilder("" + num);
        // int[] arr = new int[s.length()];
        // int[] arr2 = new int[s.length()];
        // arr[s.length() - 1] = s.length() - 1;
        // arr2[s.length() - 1] = s.charAt(s.length() - 1) - '0';
        // for (int i = s.length() - 2; i >= 0; i--) {
        // int a = s.charAt(i) - '0';
        // int b = s.charAt(arr[i + 1]) - '0';
        // if (a > b) {
        // arr[i] = i;
        // arr2[i] = s.charAt(i) - '0';
        // } else {
        // arr[i] = arr[i + 1];
        // arr2[i] = s.charAt(arr[i + 1]) - '0';
        // }
        // }
        // for (int i = 0; i < s.length() - 1; i++) {
        // if (s.charAt(i) - '0' < arr2[i + 1]) {
        // char a = s.charAt(i);
        // char b = s.charAt(arr[i + 1]);
        // s.setCharAt(i, b);
        // s.setCharAt(arr[i + 1], a);
        // break;
        // }
        // }
        // return Integer.parseInt(s.toString());
        char[] numArray = Integer.toString(num).toCharArray();
        int frist = 0;
        // *For normal maximum number Linke 521
        for (frist = 0; frist < numArray.length - 1; frist++) {
            if (Character.getNumericValue(numArray[frist]) < Character.getNumericValue(numArray[frist + 1])) {
                break;
            }
        }
        if (frist == numArray.length)
            return num;

        // *For case like 10999
        int max = 0, maxPositon = 0;
        for (int i = frist; i < numArray.length; i++) {
            if (Character.getNumericValue(numArray[i]) >= max) {
                max = numArray[i] - '0';
                maxPositon = i;
            }
        }
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] - '0' < max && maxPositon != i) {
                char temp = numArray[i];
                numArray[i] = (char) (max + '0');
                numArray[maxPositon] = temp;
                return Integer.parseInt(new String(numArray));
            }
        }
        return num;
    }
}
