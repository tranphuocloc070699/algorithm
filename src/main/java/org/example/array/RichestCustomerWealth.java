package org.example.array;


public class RichestCustomerWealth {
  //https://leetcode.com/problems/richest-customer-wealth/
  public static void main(String[] args) {
    int max = 0;
    int[][] array = {
        {1, 2, 3},
        {5, 9, 7}
    };


    for (int[] subArr : array) {
      int currentTotal = arrayTotal(subArr);
      if (max < currentTotal) max = currentTotal;
    }

    System.out.println(max);
  }

  private static int arrayTotal(int[] arr) {
    int total = 0;
    for (int i : arr) {
      total += i;
    }
    return total;
  }
}
