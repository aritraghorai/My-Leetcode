/*
 !Name: Aritra Ghorai
 !Date:07/09/2021
 ?Program Details: 744. Find Smallest Letter Greater Than Target
 *https://leetcode.com/problems/find-smallest-letter-greater-than-target/
   */
public class Q143_find_smallest_letter_grater_than_the_target {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        System.out.println(nextGreatestLetter(letters, 'a'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (letters[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return letters[low % letters.length];

    }
}
