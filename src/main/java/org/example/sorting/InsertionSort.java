package org.example.sorting;
import org.example.utils.ArrayUtils;

public class InsertionSort {
  /*
   * Time complexity: O(n^2)
   * Auxiliary space: O(1): as the only extra memory used is for temporary variables while swapping two values in Array. The selection sort never makes more than O(N) swaps and can be useful when memory writing is costly
   * Use case:
   *  -  small list
   *  -  only exists as a teaching process
   * */

  public static void main(String[] args) {
    int[] nums = new int[]{12, 11, 13, 5, 6};
    sort(nums);
    ArrayUtils.printArray(nums);
  }

  private static void sort(int[] nums) {
    int length = nums.length;
    for (int i = 1; i < length; i++) {
      int j = i-1;
      int key = nums[i];

      while (j>=0 && nums[j]>key) {
        nums[j+1] = nums[j];
        j=j-1;
      }

      nums[j+1] = key;
    }
  }


}
