import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:05/10/2021
 ?Program Details:1353. Maximum Number of Events That Can Be Attended
 *https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/
   */
public class Q171_Max_Number_Of_Events {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });
        int i = 0;
        int maxMe = 0;
        int n = events.length;
        // *To extracted the task which is end frist
        var pq = new PriorityQueue<Integer>();
        for (int day = 0; day <= events[events.length - 1][1]; day++) {
            while (i < n && events[i][0] == day) {
                pq.add(events[i++][1]);
            }
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                maxMe++;
                pq.poll();
            }
        }
        return maxMe;
    }
}
