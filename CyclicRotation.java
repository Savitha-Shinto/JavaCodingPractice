public class CyclicRotation {
    public static void main(String[] args){
        CyclicRotation cyclicRotation = new CyclicRotation();
        cyclicRotation.cyclicRotation(new int[] {3,6,7,8,9}, 3);
    }
    public void cyclicRotation(int[] arr, int k){
        int result[] = new int[arr.length];
        for(int i = 0; i<k; i++){
            result[0] = arr[arr.length-1];
            for(int j=0; j<=arr.length-2; j++){
                result[j+1] = arr[j];
            }
            System.out.println("Results");
            for(int n=0;n<result.length; n++){
                System.out.println(result[n]);
            }
            System.out.println("Copy result to arr");
            for(int n=0;n<result.length;n++){
                arr[n] = result[n];
                System.out.println(arr[n]);

            }

         }

    }
}
