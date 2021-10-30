import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:22/10/2021
 ?Program Details:315. Count of Smaller Numbers After Self
 *https://leetcode.com/problems/count-of-smaller-numbers-after-self/
   */
public class Q185_Count_Of_Smaller_Number_After_Self {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 6, 1 };
        System.out.println(countSmaller(nums));
    }

    static int[] arr;

    public static List<Integer> countSmaller(int[] nums) {
        merge_pair[] pairArray = new merge_pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            var np = new merge_pair(nums[i], i);
            pairArray[i] = np;
        }
        arr = new int[nums.length];
        mergeSort(pairArray, 0, nums.length - 1);
        var result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void mergeSort(merge_pair[] array, int low, int high) {
        if (low >= high)
            return;
        int mid = low + ((high - low) / 2);
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    private static void merge(merge_pair[] array, int low, int mid, int high) {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;
        var leftArray = new merge_pair[leftSize];
        var rightArray = new merge_pair[rightSize];
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[low + i];
        }
        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = array[mid + 1 + i];
        }
        int i = 0, j = 0, k = low, count = 0;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i].num > rightArray[j].num) {
                count++;
                array[k] = rightArray[j++];
            } else {
                arr[leftArray[i].indx] += count;
                array[k] = leftArray[i++];
            }
            k++;
        }
        // *Chack for frist Array
        while (i < leftSize) {
            arr[leftArray[i].indx] += count;
            array[k++] = leftArray[i++];
        }
        while (j < rightSize) {
            array[k++] = rightArray[j++];
        }

    }
}

class merge_pair {
    int num;
    int indx;

    public merge_pair(int num, int indx) {
        this.num = num;
        this.indx = indx;
    }
}
