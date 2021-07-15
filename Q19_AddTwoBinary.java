import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:14/07/2021
 ?Program Details:67.Add Binary
 *https://leetcode.com/problems/add-binary/submissions/
   */
public class Q19_AddTwoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(addBinary(s, s1));
        sc.close();
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        boolean isBoothOne = false;
        StringBuilder re = new StringBuilder();
        // String result = "";
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                if (isBoothOne) {
                    re.append(1);
                    // result = '1' + result;
                    isBoothOne = false;
                } else {
                    re.append(0);
                    // result = '0' + result;

                }
            } else if (a.charAt(i) == '0' && b.charAt(j) == '1') {
                if (isBoothOne) {
                    re.append(0);
                    // result = '0' + result;

                } else {
                    // result = '1' + result;
                    re.append(1);
                }
            } else if (a.charAt(i) == '1' && b.charAt(j) == '0') {
                if (isBoothOne) {
                    // result = '0' + result;
                    re.append(0);

                } else {
                    // result = '1' + result;
                    re.append(1);
                }
            } else if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (isBoothOne) {
                    re.append(1);
                } else {
                    isBoothOne = true;
                    // result = '0' + result;
                    re.append(0);
                }
            }
            i--;
            j--;
        }
        if (i == -1) {
            while (j >= 0) {

                if (isBoothOne) {
                    if (b.charAt(j) == '0') {
                        // result = '1' + result;
                        re.append(1);
                        isBoothOne = false;
                    } else {
                        // result = '0' + result;
                        re.append(0);
                    }
                } else {
                    if (b.charAt(j) == '0') {
                        // result = '0' + result;
                        re.append(0);
                    } else {
                        // result = '1' + result;
                        re.append(1);
                    }
                }
                j--;

            }
        }
        if (j == -1) {
            while (i >= 0) {
                if (isBoothOne) {
                    if (a.charAt(i) == '0') {
                        // result = '1' + result;
                        re.append(1);
                        isBoothOne = false;
                    } else {
                        // result = '0' + result;
                        re.append(0);
                    }
                } else {
                    if (a.charAt(i) == '0') {
                        // result = '0' + result;
                        re.append(0);

                    } else {
                        // result = '1' + result;
                        re.append(1);
                    }
                }
                i--;
            }
        }
        if (isBoothOne) {
            // result = '1' + result;
            re.append(1);
        }

        return re.reverse().toString();
    }
}
