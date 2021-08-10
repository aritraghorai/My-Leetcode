import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:09/08/2021
 ?Program Details: 925. Long Pressed Name
 *https://leetcode.com/problems/long-pressed-name/
   */
public class Q82_LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i != 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        if (name.length() == i) {
            while (j < typed.length()) {
                if (name.charAt(i - 1) == typed.charAt(j))
                    j++;
                else
                    return false;
            }
            if (j == typed.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        System.out.println(isLongPressedName(s, s1));
        sc.close();
    }
}
