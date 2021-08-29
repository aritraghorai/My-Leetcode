import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:29/08/2021
 ?Program Details:368. Largest Divisible Subset
 *https://leetcode.com/problems/transpose-matrix/
   */
public class Q128_longest_Divisible_Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(largestDivisibleSubset(nums));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 1) {
            return List.of(nums[0]);
        }
        Arrays.sort(nums);
        int[] storage = new int[nums.length];
        Arrays.fill(storage, 1);
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                storage[i] = nums[i] % nums[j] == 0 ? Math.max(storage[i], storage[j] + 1) : storage[i];
                if (storage[i] > max) {
                    max = storage[i];
                    index = i;
                }
            }
        }
        var result = new ArrayList<Integer>();
        result.add(nums[index]);
        int last = nums[index];
        max--;
        for (int i = index - 1; i >= 0; i--) {
            if (max == -1)
                break;
            if (last % nums[i] == 0 && storage[i] == max) {
                result.add(0, nums[i]);
                last = nums[i];
                max--;
            }
        }
        return result;
    }
}
