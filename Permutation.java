import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Permutation {
    public static void main(String args[]){
        int arr[] = new int[]{10,20,30};
        Permutation permutation = new Permutation();
        List<List<Integer>> permute = permutation.permutationNumber(arr);
        List<Integer> intLst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        intLst.sort(Collections.reverseOrder());
        int[] arr1 = intLst.stream().mapToInt(Integer::intValue).toArray();
        List<List<Integer>> permute1 = permutation.permutationNumber(arr);
        System.out.println("Permuations of array : [10, 20, 10] are:");
        System.out.println("=========================================");
        for(List<Integer> perm:permute)
        {
            System.out.println(perm);
        }
        for(List<Integer> perm:permute1)
        {
            System.out.println(perm);
        }
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        permuteHelper(list, new ArrayList<>(), arr,new boolean[arr.length]);
        return list;
    }

    private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr, boolean [] used){

        // Base case
        if(resultList.size() == arr.length){
            list.add(new ArrayList<>(resultList));
        } else{
            for(int i = 0; i < arr.length; i++){
                if(used[i] || i > 0 && arr[i] == arr[i-1] && !used[i - 1])
                {
                    // If element is already used
                    continue;
                }
                // choose element
                used[i] = true;
                resultList.add(arr[i]);

                // Explore
                permuteHelper(list, resultList, arr, used);

                // Unchoose element
                used[i] = false;
                resultList.remove(resultList.size() - 1);
            }
        }
    }


    List<List<Integer>> permutationNumber(int arr[]){
        List<List<Integer>> result = new ArrayList<>();
        int pIndex =0;

        for(int j =0 ;j <arr.length; j++){

            List<Integer> test = new ArrayList<>();
            if(!isUsed(arr[j], result)) {

                int index =0;
                test.add(index, arr[j]);
                index ++;
                for (int i = 0; i < arr.length; i++) {
                    if(test.get(0) != arr[i]) {
                        test.add(index, arr[i]);
                        index ++;
                    }

                }
                result.add(pIndex, test);
                pIndex++;
            }

        }

       return result;

    }
    boolean isUsed(int search, List<List<Integer>> lst){
        if(lst.size() == 0){
            return false;
        }
        boolean result = false;
        for(int i=0; i<lst.size(); i++){
            List<Integer> tmp = new ArrayList<>();
            tmp = lst.get(i);
            if(tmp.get(0) == search){
                result = true;
                break;
            }

        }
        return result;
    }
}
