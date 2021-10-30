import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:22/10/2021
 ?Program Details:451. Sort Characters By Frequency
 *https://leetcode.com/problems/sort-characters-by-frequency/
   */
public class Q184_Sort_Character_By_Frequency {
    public String frequencySort(String s) {
        var map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        ArrayList<pair> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr.add(new pair(s.charAt(i), map.get(s.charAt(i))));
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i).a);
        }
        return sb.toString();
    }

}

class pair implements Comparable<pair> {
    public char a;
    public int freq;

    public pair(char a, int freq) {
        this.a = a;
        this.freq = freq;
    }

    @Override
    public int compareTo(pair o) {
        return this.freq == o.freq ? this.a - o.a : this.freq - o.freq;
    }
}
