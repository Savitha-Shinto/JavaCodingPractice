import java.util.Arrays;

public class ArraySmallestLargetNumber {
    public static void main(String args[]){
        ArraySmallestLargetNumber arraySmallestLargetNumber = new ArraySmallestLargetNumber();
        int[] arr = new int[] {7,1,8,3,5,4};
        System.out.println(arraySmallestLargetNumber.getSmallest(arr));
        System.out.println(arraySmallestLargetNumber.getLargest(arr));

    }
    int getSmallest(int[] arr){
        int[] resultarr = Arrays.stream(arr).sorted().toArray();
        return resultarr[0];
    }
    int getLargest(int[] arr){
        int[] resultarr = Arrays.stream(arr).sorted().toArray();
        return resultarr[resultarr.length-1];
    }
}
