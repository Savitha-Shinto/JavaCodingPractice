import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArray {
    public static void main(String args[]){
        Integer[] arr = new Integer[] {34,5,11,22,66};
        System.out.println(getSecondLargestInArray(arr));
    }
    static int getSecondLargestInArray(Integer[] arr){
//       int[] result = Arrays.stream(arr).sorted().toArray();
//       return result[result.length-2];
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        return list.get(list.size()-2);



    }
}
