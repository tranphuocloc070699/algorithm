package org.example;

public class ArmstrongNumber {
  public static void main(String[] args) {
    System.out.println(isArmstrongNumber(1000));
  }
  public static Boolean isArmstrongNumber(int n){
    int original = n;
    int sum = 0;
    while (n>0){
      int rem = n % 10;
      n = n /10;
      sum = sum + rem*rem*rem;
    }
    return sum == original;
  }
}
