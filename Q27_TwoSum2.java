import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:18/07/2021
 ?Program Details:167. Two Sum II - Input array is sorted
 *https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
   */
public class Q27_TwoSum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int[] result = twoSum(nums, k);
        for (int a : result) {
            System.out.print(a + " ");
        }
        sc.close();
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if ((numbers[i] + numbers[j]) == target) {
                break;
            } else if ((numbers[i] + numbers[j]) > target) {
                j--;
            } else {
                i++;
            }

        }
        int[] result = { i + 1, j + 1 };
        return result;
    }

}
