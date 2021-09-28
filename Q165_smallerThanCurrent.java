import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:22/09/2021
 ?Program Details:1365. How Many Numbers Are Smaller Than the Current Number
 *https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/ 
   */
public class Q165_smallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        var newSortedArray = nums.clone();
        Arrays.sort(newSortedArray);
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(newSortedArray[i]))
                map.put(newSortedArray[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            newSortedArray[i] = map.get(nums[i]);
        }
        return newSortedArray;
    }
}
