import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:04/09/2021
 ?Program Details: 567. Permutation in String
 *https://leetcode.com/problems/permutation-in-string/
   */
public class Q136_Permutation_In_a_String {
    public boolean checkInclusion(String p, String s) {
        int windowSize = p.length();
        int i = 0, j = 0;
        var map = new HashMap<Character, Integer>();
        for (char ch : p.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int count = map.size();
        while (i < s.length() && j < s.length()) {
            if ((j - i + 1) < windowSize) {
                if (map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                    if (map.get(s.charAt(j)) == 0) {
                        count--;
                    }

                }
                j++;
            } else {

                if (map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                    if (map.get(s.charAt(j)) == 0) {
                        count--;
                    }
                }
                j++;
                if (count == 0) {
                    return true;
                }
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    if (map.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;

            }
        }
        return false;
    }
}
