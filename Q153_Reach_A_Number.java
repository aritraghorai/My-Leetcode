/*
 !Name: Aritra Ghorai
 !Date:09/09/2021
 ?Program Details:754. Reach a Number
 *https://leetcode.com/problems/reach-a-number/ 
   */
public class Q153_Reach_A_Number {
    public static void main(String[] args) {
        System.out.println(reachNumber(2));
    }

    public static int reachNumber(int target) {
        int window = 1;
        int low = 0, high = 1;
        int count = 1;
        while (target >= high) {
            if (high == target) {
                return count;
            }
            if (target > high) {
                window = window * 2;
                low = low + window;
                count++;
                high = high + window;
            }
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid == target) {
                count++;
                break;
            } else if (mid > target) {
                high = mid - 1;
                count++;
            } else {
                low = mid + 1;
                count++;
            }
        }
        return count;
    }
}
