package org.example.sorting;
import org.example.utils.ArrayUtils;

public class BubbleSort {
  /*
   * Time complexity: O(n^2)
   * Auxiliary space: O(1): as the only extra memory used is for temporary variables while swapping two values in Array. The selection sort never makes more than O(N) swaps and can be useful when memory writing is costly
   * Use case:
   *  -  small list
   *  -  only exists as a teaching process
   * */

  public static void main(String[] args) {
    int[] nums = new int[]{1, 5, 3, 4, 2};
    sort(nums);
    ArrayUtils.printArray(nums);
  }

  private static void sort(int[] nums) {
    int length = nums.length;
    //This loop to exclude right sub-array sorted
    for (int i = 0; i < length - 1; i++) {
      //This loop to swap elements
      for (int j = 0; j < length - 1 - i; j++) {
        if (nums[j] > nums[j+1]) {
          ArrayUtils.swapIndex(nums,j,j+1);
        }
      }
    }
  }
}
