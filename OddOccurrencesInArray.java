public class OddOccurrencesInArray {
public static void main(String args[]){
    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
    System.out.println(oddOccurrencesInArray.solution(new int[] {1,2,1,2,3}));
}
    public int solution(int[] A) {
// Best Solution
// sure there is at least one element
//        int result = A[0];
//
//        // bitwise xor wipes out double elements
//        // only remains odd values
//        // loop for remaining
//        for(in i=1; i<A.length; i++) {
//            result =  result ^ A[i];
//        }
        //return result;
        //second option

        int count =0;
        for(int i =0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                if( A[i] == A[j]) {
                    count++;
                }

            }
            if(count % 2 != 0 ){

                return A[i];
            }

        }

        return -1;


    }
}

