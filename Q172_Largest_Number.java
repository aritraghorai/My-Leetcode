import java.util.Arrays;

/*
 !Name: Aritra Ghorai
 !Date:06/10/2021
 ?Program Details:179. Largest Number
 *https://leetcode.com/problems/largest-number/
   */
public class Q172_Largest_Number {
    public String largestNumber(int[] nums) {
        String[] sArray = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sArray[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(sArray, (a, b) -> {
            long n1 = Long.parseLong(a + b);
            long n2 = Long.parseLong(b + a);

            if (n1 > n2)
                return 1;
            else if (n2 > n1)
                return -1;
            else
                return 0;

        });

        StringBuilder s = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            s.append(sArray[i]);
        }
        if (s.charAt(0) == '0')
            return "0";
        return s.toString();

    }
}
