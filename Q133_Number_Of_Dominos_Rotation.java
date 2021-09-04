
/*
 !Name: Aritra Ghorai
 !Date:01/09/2021
 ?Program Details:1007. Minimum Domino Rotations For Equal Row
 *https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/
   */
public class Q133_Number_Of_Dominos_Rotation {
    static int count = Integer.MAX_VALUE;

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int change1 = tops[0];
        int change2 = bottoms[0];
        chack(tops, bottoms, change1);
        chack(tops, bottoms, change2);
        return count == Integer.MAX_VALUE ? -1 : count;

    }

    public static void chack(int[] tops, int[] bottoms, int ele) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < tops.length; i++) {

            if (ele == tops[i]) {

            } else if (ele == bottoms[i]) {
                count1++;
            } else {
                break;
            }
            if (i == tops.length - 1) {
                count = Math.min(count1, count);
            }
        }
        for (int i = 0; i < tops.length; i++) {

            if (ele == bottoms[i]) {

            } else if (ele == tops[i]) {
                count2++;
            } else {
                break;
            }
            if (i == tops.length - 1) {
                count = Math.min(count2, count);
            }
        }
    }

}
