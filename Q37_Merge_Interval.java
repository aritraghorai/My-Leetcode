import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:22/07/2021
 ?Program Details:56. Merge Intervals
 *https://leetcode.com/problems/merge-intervals/
   */
public class Q37_Merge_Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInterVal = sc.nextInt();
        int[][] intervals = new int[numberOfInterVal][2];
        for (int i = 0; i < numberOfInterVal; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int[][] ar = merge(intervals);
        for (int[] a : ar) {
            for (int b : a)
                System.out.print(b + " ");
            System.out.println();
        }
        sc.close();
    }

    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] in : intervals) {
            if (in[0] <= end) {
                end = Math.max(in[1], end);
            } else {
                res.add(new int[] { start, end });
                start = in[0];
                end = in[1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[0][]);

    }
}
