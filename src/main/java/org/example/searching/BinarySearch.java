package org.example.searching;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,50, 1000};
    int[] arrDesc = {100,50,40,30,20,10};
    int target = 50;
    System.out.println(findByBinarySearch(arr, target));
  }


  public static int findByBinarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target == arr[mid]) return mid;

      if (arr[start] < arr[end]) {
        if (target > arr[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (target < arr[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }

    }

    return -1;
  }
}
