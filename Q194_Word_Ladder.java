import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:29/11/2021
 ?Program Details:127. Word Ladder
*https://leetcode.com/problems/word-ladder/
   */
public class Q194_Word_Ladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        var wordSet = new HashSet<>(wordList);
        var map = new HashSet<>();
        var qu = new LinkedList<String>();
        qu.offer(beginWord);
        int step = 1;
        while (!qu.isEmpty()) {
            int si = qu.size();
            while (si-- > 0) {
                var rp = qu.poll();
                if (rp.equals(endWord))
                    return step;
                map.add(rp);
                // *add connected words
                var sb = new StringBuilder(rp);
                for (int i = 0; i < sb.length(); i++) {
                    char temp = sb.charAt(i);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == temp)
                            continue;
                        sb.setCharAt(i, ch);
                        String s = sb.toString();
                        if (wordSet.contains(s) && !map.contains(s)) {
                            qu.offer(s);
                        }
                    }
                    sb.setCharAt(i, temp);
                }
            }
            step++;
        }
        return 0;
    }
}
