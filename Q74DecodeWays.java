import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:06/08/2021
 ?Program Details: 91. Decode Ways
 *https://leetcode.com/problems/decode-ways/
   */
public class Q74DecodeWays {
    public static int numDecodingsDp(String s) {
        int[] storage = new int[s.length() + 1];
        // Arrays.fill(storage, -1);
        // int a = numDecodings(s, 0, storage);
        // System.out.println(Arrays.toString(storage));
        // return a;
        for (int i = s.length(); i >= 0; i--) {
            if (i == s.length()) {
                storage[i] = 1;
            } else if (s.charAt(i) == '0') {
                storage[i] = 0;
            } else {

                storage[i] += storage[i + 1];
                if (i != s.length() - 1 && Integer.valueOf(s.substring(i, i + 2)) <= 26
                        && Integer.valueOf(s.substring(i, i + 2)) >= 10) {
                    storage[i] += storage[i + 2];
                }
            }
        }
        return storage[0];

    }

    public static int numDecodings(String s) {

        if (s.length() == 1) {
            int a = s.charAt(0) == '0' ? 0 : 1;
            return a;
        }
        int[] storage = new int[3];
        storage[2] = 1;
        if (s.charAt(s.length() - 1) != '0') {
            storage[1] = 1;
        } else {
            storage[1] = 0;
        }
        for (int i = s.length() - 2; i >= 0; i--) {
            int cal = 0;
            if (s.charAt(i) != '0') {
                cal += storage[1];
                if (Integer.valueOf(s.substring(i, i + 2)) <= 26 && Integer.valueOf(s.substring(i, i + 2)) >= 10) {
                    cal += storage[2];
                }
            }
            storage[0] = cal;
            storage[2] = storage[1];
            storage[1] = storage[0];

        }
        return storage[0];

    }

    public static int numDecodings(String s, int i, int[] storage) {
        if (s.length() == i) {
            return 1;
        }
        if (s.charAt(i) == '0') {
            return 0;
        }
        if (storage[i] != -1) {
            return storage[i];
        }
        int result = 0;
        result += numDecodings(s, i + 1, storage);
        if (i != s.length() - 1 && Integer.valueOf(s.substring(i, i + 2)) <= 26
                && Integer.valueOf(s.substring(i, i + 2)) >= 10) {
            result += numDecodings(s, i + 2, storage);
        }
        storage[i] = result;
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(numDecodings(n));
        sc.close();
    }
}
