/*
 !Name: Aritra Ghorai
 !Date:30/10/2021
 ?Program Details:2047. Number of Valid Words in a Sentence
 *https://leetcode.com/problems/number-of-valid-words-in-a-sentence/
   */
public class Q187_Number_of_Word_In_A_Sentense {
    public int countValidWords(String sentence) {
        String regex = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String r2 = "[^0-9]+";
        String[] arr = sentence.split("\\s+");
        int ans = 0;
        for (String s : arr) {
            if (s.matches(regex) && s.matches(r2)) {
                ans++;
                // System.out.println(s);
            }
        }
        return ans;
    }
}
