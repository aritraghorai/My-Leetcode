import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:30/07/2021
 ?Program Details:93. Restore IP Addresses
 *https://leetcode.com/problems/restore-ip-addresses/
   */
public class Q54_Restored_ip_address {
    public static void main(String[] args) {
        String s = "101023";
        restoreIpAddresses(s);
        System.out.println(result);
    }

    public static List<String> result = new ArrayList<>();

    public static List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 && s.length() > 12) {
            return result;
        }
        restoreIpAddresses(s, "", 0);
        return result;
    }

    public static void restoreIpAddresses(String s, String recS, int dot) {
        if (dot == 4 || s.length() == 0) {
            if (dot == 4 && s.length() == 0) {
                // *Remove the last dot
                result.add(recS.substring(0, recS.length() - 1));

            }
            return;
        }

        // *Call for one element
        restoreIpAddresses(s.substring(1), recS + s.substring(0, 1) + ".", dot + 1);
        // *Call for two element
        if (s.length() >= 2 && s.charAt(0) != '0') {
            restoreIpAddresses(s.substring(2), recS + s.substring(0, 2) + ".", dot + 1);
        }
        // *call for three element
        if (s.length() >= 3 && s.charAt(0) != '0' && Integer.valueOf(s.substring(0, 3)) <= 255) {
            restoreIpAddresses(s.substring(3), recS + s.substring(0, 3) + ".", dot + 1);
        }
    }

}
