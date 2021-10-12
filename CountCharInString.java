public class CountCharInString {
    public static void main (String args[]){
        CountCharInString countCharInString = new CountCharInString();
        System.out.println(countCharInString.recursion("aaaaabbbbcccc",'b',0));
        System.out.println(countCharInString.usingStream("aaaaabbbbccc", 'a'));
    }
    public int countLetter(String word, char search){
        int result =0;
        for (int i=0; i< word.length()-1; i++){
            if(word.charAt(i) == search) {
                result++;
            }
        }
        return result;
    }
    int recursion(String word, char search, int index){
        int count = 0;
        if(index >= word.length()){
            return 0;
        }
        if (word.charAt(index) == search){
            count ++;
        }

        return count + recursion(word, search, index + 1);

    }

    int usingStream(String word, char search){
        return (int) word.chars().filter(ch -> ch == search).count();
    }
}
