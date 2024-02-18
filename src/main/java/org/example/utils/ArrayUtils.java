package org.example.utils;

import java.util.Arrays;

public class ArrayUtils {
  public static void swapIndex(int[] nums, int minIndex, int j) {
    int temp = nums[minIndex];
    nums[minIndex] = nums[j];
    nums[j] = temp;
  }

  public static void printArray(int[] nums) {
    Arrays.stream(nums).forEach(num -> {
      System.out.print(num+" ");
      System.out.println();
    });
  }
}
