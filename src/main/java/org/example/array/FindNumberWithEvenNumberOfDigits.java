package org.example.array;

public class FindNumberWithEvenNumberOfDigits {
  //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
  public static void main(String[] args) {
    int[] nums = {555,901,482,1771};
    System.out.println(findNumbers(nums));
  }

  private static int findNumbers(int[] nums) {
    int count = 0;
      for(int item : nums){
        if(digitsWithLog(item)%2==0){
          count++;
        }
      }
      return count;
  }

  private static int digits(int num){
    int count = 0;
    if(num<0){
      num*=-1;
    }
    while (num>0){
      count++;
      num /=10;
    }
    return count;
  }

  private static int digitsWithLog(int num){
    return (int)Math.log10(num) + 1;
  }
}
