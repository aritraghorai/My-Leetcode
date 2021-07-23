import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:23/07/2021
 ?Program Details:46.Permutations
 *https://leetcode.com/problems/permutations/
   */
public class Q38Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(permute(nums));
        sc.close();
    }

    public static List<List<Integer>> permute(int[] nums) {
        return permute(nums, 0);
    }

    public static List<List<Integer>> permute(int[] nums, int s) {
        if (s == nums.length) {
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>());
            return base;

        }
        int num = nums[s];
        List<List<Integer>> rec = permute(nums, s + 1);
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> inner : rec) {
            for (int i = 0; i <= inner.size(); i++) {
                inner.add(i, num);
                result.add(new ArrayList<>(inner));
                inner.remove(i);
            }
        }
        return result;
    }
}
