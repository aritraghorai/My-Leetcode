import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:16/09/2021
 ?Program Details:560. Subarray Sum Equals K
 *https://leetcode.com/problems/subarray-sum-equals-k/ 
   */
public class Q159_Number_of_subarray_sum_K {
    public static void main(String[] args) {

    }

    public int subarraySum(int[] A, int K) {
        int count = 0;
        int sum = 0;
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (map.containsKey(sum - K)) {
                count += map.get(sum - K);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
