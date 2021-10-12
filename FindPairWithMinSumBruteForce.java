import java.util.Arrays;

public class FindPairWithMinSumBruteForce {
    public static void main(String args[]){
        int[] arr =new int[] {1,3,-5,7,8,20,-40,6};
        Arrays.sort(arr);
        int minimumSum=arr[0]+arr[1];
        int pair1stIndex=0;
        int pair2ndIndex=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tempSum=arr[i]+arr[j];
                if(Math.abs(tempSum) < Math.abs(minimumSum))
                {
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minimumSum=tempSum;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to zero : "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }
    public static void findPairWithClosestToXBruteForce(int arr[],int X)
    {
        if(arr.length<2)
            return;
        // Suppose 1st two element has minimum diff with X
        int minimumDiff=Math.abs(arr[0]+arr[1]-X);
        int pair1stIndex=0;
        int pair2ndIndex=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tempDiff=Math.abs(arr[i]+arr[j]-X);

                if(tempDiff< minimumDiff)
                {
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minimumDiff=tempDiff;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to X using brute force method: "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }


    public static void findPairsWithSumEqualsToXBruteForce(int arr[], int X) {
        if (arr.length < 2)
            return;

        System.out.println("The pair whose sum is equal to 15 using brute force method: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];

                if (tempSum == X) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
    public static int[] separate0s1sSolution1(int arr[])
    {

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i]=0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i]=1;
        }
        return arr;
    }
    public static int[] separateEvenOddNumbers(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < arr.length; i++) {

            while(arr[left]%2==0)
            {
                left++;
            }
            while(arr[right]%2==1)
            {
                right--;
            }

            if(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
    }

}
