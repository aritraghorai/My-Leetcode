/*
 !Name: Aritra Ghorai
 !Date:31/08/2021
 ?Program Details:829.Consecutive Numbers Sum
 *https://leetcode.com/problems/consecutive-numbers-sum/
   */
public class Q131_Consecutive_Number_Sum {
    public static void main(String[] args) {
        System.out.println(consecutiveNumbersSum(15));
    }

    public static int consecutiveNumbersSumBrutForce(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int i = 0, j = 0, count = 1, sum = 0;
        while (j < arr.length && i < arr.length) {
            if (sum < n) {
                sum += arr[j];
                j++;
            } else if (sum > n) {
                sum -= arr[i];
                i++;
            } else {
                count++;
                sum -= arr[i];
                i++;
                sum += arr[j];
                j++;
            }
        }
        return count;
    }

    public static int consecutiveNumbersSum(int n) {

        int count = 0;
        for (int i = 1; 2 * n > i * i; i++) {
            int cal = n - (i * (i - 1)) / 2;
            if (cal % i == 0)
                count++;
        }
        return count;
    }
}
