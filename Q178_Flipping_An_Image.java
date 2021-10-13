/*
 !Name: Aritra Ghorai
 !Date:13/10/2021
 ?Program Details:832. Flipping an Image
 *https://leetcode.com/problems/flipping-an-image/ 
   */
public class Q178_Flipping_An_Image {
    public int[][] flipAndInvertImage(int[][] image) {
        // *Frist Flip It Horizontally
        for (int[] ima : image) {
            int j = 0, k = ima.length - 1;
            while (j <= k) {
                int temp = ima[j] ^ 1;
                ima[j] = ima[k] ^ 1;
                ima[k] = temp;
                j++;
                k--;
            }
        }
        return image;
    }
}
