import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MissingInteger {
    public static void main(String args[]) {

//        int x =1; int y =7;
//        System.out.println(x^y);

//        int[] arr = new int[]{1, 3, 5, 6, 7};
//        for (int i = 0; i < arr.length; i++) {
//
//            if ((i + 1) < arr.length && !(arr[i] - arr[i + 1] == -1)) {
//                System.out.println(arr[i] + 1);
//            }
//        }
// 28
      int a[] = { 1, 2, 4,5, 6, 7 };
////
////        int n = a.length ;
////        int miss = getMissingNo1(a, n);
////
////        System.out.print(miss);
        int miss = getMissingNo1(a, 5);
        System.out.println(miss);

    }
    static int getMissingNo1(int a[], int n)
    {
        int n_elements_sum = n * (n + 1) / 2;

        int sum = 0;

        for(int i = 0; i < n; i++)
            sum += a[i];

        return  sum - n_elements_sum;
    }
    static int getMissingNo(int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        /* For xor of all the elements
           in array */
        for (int i = 1; i < n; i++) {
            x1 = x1 ^ a[i];

        }

        /* For xor of all the elements
           from 1 to n+1 */
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }
}


