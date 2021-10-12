import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxCounter {
    public static void main(String args[]){
        MaxCounter maxCounter = new MaxCounter();
        HashMap<Integer,Integer> res = maxCounter.solution(new int[]{1,1,2,2,3,3});
        //for(int i=0;i<=res.size(); i++){
            System.out.println(res.toString());
       // }
    }
    public HashMap<Integer,Integer> solution(int[] nums){
        HashSet<Integer> uni = new HashSet<>();
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(Integer i : set) {
            hashMap.put(i,0);
        }

        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            }
        }

        return hashMap;
    }
}
