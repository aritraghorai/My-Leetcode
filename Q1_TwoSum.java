
/*
 !Name: Aritra Ghorai
 !Date:06/07/2021
 ?Program Details:Two Sum problem On leetcode
   */
import java.util.HashMap;
import java.util.Scanner;

public class Q1_TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] nums2 = twoSumImprove(nums, target);
        for (int a : nums2) {
            System.out.print(a + " ");
        }
        sc.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] nums2 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    nums2[0] = i;
                    nums2[1] = j;
                    break;
                }
            }
        }
        return nums2;
    }

    public static int[] twoSumImprove(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] nums2 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem) && (map.get(rem) != i)) {
                nums2[0] = i;
                nums2[1] = map.get(rem);
                break;
            }
        }
        return nums2;
    }
}
