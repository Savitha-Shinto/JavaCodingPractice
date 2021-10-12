package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MissingSmallestPositiveNumber {

  public static int findSmallestMissing(Integer[] arr){
    Set<Integer> set = new HashSet();
    Collections.addAll(set, arr);
    int index = 1;
    while(true){
      if(!set.contains(index)){
        return index;
      }
      index ++;
    }

  }

  public static void main(String[] args)
  {
    Integer[] arr = {  1, 4, 2, -1, 6, 5 };

    System.out.println("The smallest missing positive number from the array is "
      + findSmallestMissing(arr));
  }
}
