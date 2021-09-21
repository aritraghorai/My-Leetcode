/*
 !Name: Aritra Ghorai
 !Date:20/09/2021
 ?Program Details:387. First Unique Character in a String
 *https://leetcode.com/problems/first-unique-character-in-a-string/ 
   */
public class Q162_Frist_unique_Char_Int_String {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] arr = s.toCharArray();
        for (char a : arr) {
            freq[a - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i] - 'a'] == 1)
                return i;
        }
        return 0;
    }
}
