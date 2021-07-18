
import java.util.HashMap;
import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:17/07/2021
 ?Program Details:Longest K unique characters substring 
 *https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
 *https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
   */
public class Q24LongestKthSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(longestkSubstr(s, k));
        sc.close();
    }

    public static int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        while (i < s.length() && j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);

            } else {
                map.put(s.charAt(j), 1);

            }
            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    if (map.get(s.charAt(i)) == 1) {
                        map.remove(s.charAt(i));
                    } else {
                        map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    }
                    i++;
                }
                j++;
            }

        }
        if (map.size() < k) {
            return -1;
        }

        return max;
    }
}
