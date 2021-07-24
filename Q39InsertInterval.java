import java.util.ArrayList;

/*
 !Name: Aritra Ghorai
 !Date:24/07/2021
 ?Program Details:57.Insert Interval
 *https://leetcode.com/problems/insert-interval/
   */
public class Q39InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        // *Creat An ArrayList to save all the interval
        ArrayList<int[]> result = new ArrayList<>();
        int start = 0;
        // *Insert All The interval which starting index is smaller than newInterval
        while (start < intervals.length) {
            if (intervals[start][0] < newInterval[0]) {
                result.add(intervals[start++]);
            } else
                break;
        }
        // *Now Insert our new Interval
        if (result.isEmpty() || result.get(result.size() - 1)[1] < newInterval[0]) {
            result.add(newInterval);
        } else {
            // *Mergeing with the last interval of the array
            result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], newInterval[1]);
        }
        while (start < intervals.length) {
            if (result.get(result.size() - 1)[1] >= intervals[start][0])
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], intervals[start++][1]);
            else
                result.add(intervals[start++]);
        }
        return result.toArray(new int[0][]);

    }
}
