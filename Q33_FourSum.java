import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:21/07/2021
 ?Program Details:18.4Sum
 *https://leetcode.com/problems/4sum/
   */
public class Q33_FourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 2])
                    continue;
                int k = j + 1;
                int m = nums.length - 1;
                while (k < m) {
                    if ((nums[i] + nums[j] + nums[k] + nums[m]) == target) {
                        if (set.add(List.of(nums[i], nums[j], nums[k], nums[m])))
                            result.add(List.of(nums[i], nums[j], nums[k], nums[m]));
                        k++;
                        m--;

                    } else if ((nums[i] + nums[j] + nums[k] + nums[m]) > target) {
                        m--;

                    } else {
                        k++;
                    }

                }
            }
        }
        return result;
    }
}
