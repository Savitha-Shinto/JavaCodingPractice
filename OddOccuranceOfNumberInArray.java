public class OddOccuranceOfNumberInArray {
    public static void main(String args[]){
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println(getOddTimesElement(array));
    }
    static int getOddTimesElement(int ar[])
    {
        int i;
        int result = 0;
        for (i = 0; i < ar.length; i++)
        {
            // XOR operation
            result = result ^ ar[i];
        }
        return result;
    }

}
