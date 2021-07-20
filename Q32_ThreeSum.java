import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:20/07/2021
 ?Program Details:15.3Sum
 *https://leetcode.com/problems/3sum/
   */
public class Q32_ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int j, k;
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            k = nums.length - 1;
            // *Avoid Duplicate
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (j < k) {
                if ((nums[i] + nums[j] + nums[k]) == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    // *Avoid Duplicate
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    // break;
                } else if ((nums[i] + nums[j] + nums[k]) > 0) {
                    k--;
                } else if ((nums[i] + nums[j] + nums[k]) < 0) {
                    j++;
                }
            }
        }
        return result;

    }
}
