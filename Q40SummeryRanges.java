import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:24/07/2021
 ?Program Details:228.Summary Ranges
 *https://leetcode.com/problems/summary-ranges/
   */
public class Q40SummeryRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(summaryRanges(nums));
        sc.close();
    }

    // *This Solution Done Using two pointer
    public static List<String> summaryRangesSlow(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        String str = "";
        int i = 0, j = 0;
        while (i < nums.length - 1 && j < nums.length - 1) {
            if (nums[i] == (nums[i + 1] - 1)) {
                i++;
            } else {
                if (i != j) {
                    result.add(nums[j] + "->" + nums[i]);

                } else {
                    result.add(str + nums[i]);

                }
                i++;
                j = i;
            }
        }
        if (i == j) {
            result.add(str + nums[i]);
        } else {
            result.add(nums[j] + "->" + nums[i]);

        }
        return result;
    }

    public static List<String> summaryRanges(int[] nums) {
        var result = new ArrayList<String>();
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (i < nums.length) {
            int temp = nums[i];
            s.append(nums[i++]);
            while (i < nums.length && nums[i] - nums[i - 1] == 1) {
                i++;
            }
            if (temp != nums[i - 1]) {
                s.append("->" + nums[i - 1]);
            }
            result.add(s.toString());
            s.setLength(0);
        }
        return result;
    }
}
