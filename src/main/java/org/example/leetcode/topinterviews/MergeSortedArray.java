package org.example.leetcode.topinterviews;

public class MergeSortedArray {

  public static void main(String[] args) {

  }


  private static void merge(int[] nums1, int m, int[] nums2, int n) {
    int nums1Length = nums1.length;
    for (int i = 0; i < nums1Length - 1; i++) {
      if (nums1[i]==0 && nums2[i]!=0) {
          nums1[i]=nums2[i];
      }
    }
  }
}
