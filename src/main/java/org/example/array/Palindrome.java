package org.example.array;


public class Palindrome {
  //https://leetcode.com/problems/palindrome-number/
  public static void main(String[] args) {
    System.out.println(isPalindrome(-121));
  }
  private static boolean isPalindrome(int num){

    if(num<0) return false;
    int reversed = 0;
    int x = num;
    while (x!=0){
      int digits = x%10;
      reversed = reversed*10 + digits;
      x/=10;
    }
    return reversed == num;
  }

  public boolean isPalindromeByStringSolution(int x) {
    String s = String.valueOf(x); // Convert to String
    int n = s.length(); // Store the String length to int n

    for (int i=0; i<n/2; i++) {
      // We check whether the elements at the same distance from
      // beginning and from ending are same, if not we return false
      if (s.charAt(i) != s.charAt(n-i-1)) return false;
    }

    // if no flaws are found we return true
    return true;
  }
}
