package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergekSortedLists {
  public static void main(String args[]){

    LinkedList list = new LinkedList();
    list.add(1);
    list.add(4);
    list.add(5);
    LinkedList list1 = new LinkedList();
    list1.add(1);
    list1.add(3);
    list1.add(4);
    LinkedList list2 = new LinkedList();
    list2.add(2);
    list2.add(6);
    LinkedList result = new LinkedList(list);
    for(int i =0; i<list1.size(); i++){
      result.add(list1.get(i));
    }
    for(int i =0; i<list2.size(); i++){
      result.add(list2.get(i));
    }
    Collections.sort(result);
    System.out.println(result);


  }
}
