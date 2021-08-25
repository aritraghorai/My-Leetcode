import java.util.Arrays;

/*
 !Name: Aritra Ghorai
 !Date:25/08/2021
 ?Program Details: 881. Boats to Save People
 *https://leetcode.com/problems/boats-to-save-people/
   */
public class Q118_BaotToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int count = 0;
        while (i <= j) {
            if (people[i] + people[j] == limit) {
                count++;
                i++;
                j--;
            } else if (people[i] + people[j] > limit) {
                count += 2;
                i++;
                j--;
            } else {
                i++;
                count++;
            }

        }
        return count;
    }
}
