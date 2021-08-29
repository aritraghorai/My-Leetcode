import java.util.Arrays;

/*
 !Name: Aritra Ghorai
 !Date:28/08/2021
 ?Program Details: 189. Rotate Array
 *https://leetcode.com/problems/rotate-array/
   */
public class Q126_rotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    // *Brutforce and it give tle
    public void rotateBrutForce(int[] nums, int k) {
        for (int j = 1; j <= k; j++) {
            int a = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = a;
        }
    }

    public static void rotate(int[] nums, int k) {
        var length = nums.length;
        k = k % nums.length;
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            nums[i] = nums[i] ^ nums[j];
            nums[j] = nums[i] ^ nums[j];
            nums[i] = nums[i] ^ nums[j];
            i++;
            j--;
        }
    }

}
