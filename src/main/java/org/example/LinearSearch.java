package org.example;

public class LinearSearch {
  public static void main(String[] args) {
//    executeSearchingNumThenReturnIndex();
      executeSearchingStringThenReturnValue();

  }
  public static void executeSearchingNumThenReturnIndex(){
    int[] array = {1,2,5,7,9,63,45,14,5};
    int target = 5;
    System.out.println(searchingNumThenReturnIndex(array,target));
  }
  public static int searchingNumThenReturnIndex(int[] array,int target){
    if(array.length==0){
      return -1;
    }
    for(int i =0;i<=array.length;i++){
      if(array[i]==target) return i;
    }
    return -1;
  }


  public static void executeSearchingStringThenReturnValue(){
    String[] array = {"a","b","c","char1","char2"};
    String target = "char2";
    System.out.println(searchingStringThenReturnValue(array,target));
  }
  public static String searchingStringThenReturnValue(String[] array,String target){
    if(array.length==0) return null;

    for(String value : array){
      if(value.equals(target)) return value;
    }
    return null;
  }

  public static int searchingRangeThenReturnIndex(int[] array, int target, int start, int end){
    if(array.length==0) return -1;
    for(int i =start;i<=end;i++){
      if(array[i]==target) return i;
    }
    return -1;
  }
}
