package leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class Median {

  public static void main(String args[]){
    Median median = new Median();
    int[] nums1 = {1,2};
    int[] nums2 = {3,4};
    double med  = median.findMedianSortedArrays(nums1, nums2);
    System.out.println(med);
  }

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] merge = new int[nums1.length + nums2.length];
    //option 1
    System.arraycopy(nums1, 0, merge, 0, nums1.length);
    System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);

    //option 2
//    int index = 0;
//  for(int i=0; i<nums1.length; i++){
//    merge[index] = nums1[i];
//    index++;
//  }
//    for(int i=0; i<nums2.length; i++){
//      merge[index] = nums2[i];
//      index++;
//    }

    Arrays.sort(merge);

    if(merge.length % 2 != 0){
      return merge[merge.length/2];
    } else {
      int len =  merge.length/2;
      double median = (( Double.valueOf(merge[len-1]) + Double.valueOf(merge[len]))) /2;
      return median;
    }

  }
}
 

 
