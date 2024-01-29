package org.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
  //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
  public static void main(String[] args) {
    int[] nums = new int[]{1,1,2,2,3};
    removeDuplicates(nums);
  }

  public static int removeDuplicates(int[] nums) {
    for(int i= 0;i<nums.length;i++){
      findItemInArray(nums,i,nums[i]);
    }

    System.out.println(Arrays.toString(nums));
    return nums.length;
  }

  public static int findItemInArray(int [] nums,int exceptIndex,int target){
    for(int i=0;i<nums.length;i++){
      if(i!=exceptIndex && nums[i]==target){
        nums = Arrays.copyOf(nums,nums.length-1);
      }
    }
    return -1;
  }
}
