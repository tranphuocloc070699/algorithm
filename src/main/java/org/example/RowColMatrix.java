package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RowColMatrix {
  public static void main(String[] args) {
    int[][] array = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
    };

    System.out.println(Arrays.toString(search(array,11)));
  }

  static int[] search(int[][] matrix,int target) {
    int row = 0;
    int col = matrix.length-1;
    while (row <matrix.length && col >0) {
          if(matrix[row][col]==target) return new int[]{row,col};

          if(matrix[row][col] < target){
            row++;
          }else{
            col--;
          }
    }

    return new int[]{-1,-1};
  }
}
