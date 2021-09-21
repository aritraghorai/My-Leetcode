import java.util.Arrays;
import java.util.HashMap;

/*
 !Name: Aritra Ghorai
 !Date:21/09/2021
 ?Program Details:1331. Rank Transform of an Array
*https://leetcode.com/problems/rank-transform-of-an-array/
   */
public class Q164_Rank_of_Transform_Of_An_Array {
    public int[] arrayRankTransform(int[] actual_Array) {
        var arr = actual_Array.clone();
        Arrays.sort(arr);
        var map = new HashMap<Integer, Integer>();
        int rank = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(actual_Array[i]);
        }
        return arr;
    }
}
