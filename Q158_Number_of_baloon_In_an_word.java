/*
 !Name: Aritra Ghorai
 !Date:14/09/2021
 ?Program Details:Maximum Number of Balloons 
 *https://leetcode.com/problems/maximum-number-of-balloons/
   */
public class Q158_Number_of_baloon_In_an_word {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int[] letters = new int[26];
        for (char a : text.toCharArray()) {
            letters[a - 'a']++;
        }
        char[] balloons = new String("balloon").toCharArray();
        int res = Integer.MAX_VALUE;
        letters[11] /= 2;
        letters[14] /= 2;
        for (char a : balloons) {
            res = Math.min(letters[a - 'a'], res);
        }
        return res;
    }
}
