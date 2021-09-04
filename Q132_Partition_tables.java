import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:31/08/2021
 ?Program Details: 763. Partition Labels
 *https://leetcode.com/problems/partition-labels/
   */
public class Q132_Partition_tables {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

    public static List<Integer> partitionLabels(String s) {

        var result = new ArrayList<Integer>();
        char[] sToChar = s.toCharArray();
        // *array last occurace and we can use hashmap also
        int[] arrayLastOccurance = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrayLastOccurance[sToChar[i] - 'a'] = i;
        }
        int max = 0;
        int pre = -1;
        for (int i = 0; i < s.length(); i++) {
            if (arrayLastOccurance[sToChar[i] - 'a'] > max) {
                max = arrayLastOccurance[sToChar[i] - 'a'];
            }
            if (i == max) {
                result.add(max - pre);
                pre = i;
            }
        }
        return result;

    }

}
