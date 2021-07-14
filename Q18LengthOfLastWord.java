import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:14/07/2021
 ?Program Details:58.Length of Last Word
 *https://leetcode.com/problems/length-of-last-word/
   */
public class Q18LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
        sc.close();
    }

    public static int lengthOfLastWord(String s) {

        int count = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ')
            i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
