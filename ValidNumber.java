package leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ValidNumber {
  public static void main(String args[]){
    String[] arr ={"2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789","abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"};
    List<String> valid = new ArrayList<>();
    List<String> invalid = new ArrayList<>();
    for(int i=0;i<arr.length; i++) {
      try {
        BigDecimal bigDecimalCurrency = new BigDecimal(arr[i]);
        valid.add(arr[i]);
      }catch (NumberFormatException e){
        invalid.add(arr[i]);
      }
    }
    System.out.println(valid);
    System.out.println(invalid);
  }

}
 
