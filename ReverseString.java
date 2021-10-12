public class ReverseString {
    public static void main(String args[]){
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("Savitha"));
        System.out.println(reverseString.recursiveReverse("Anish"));
        System.out.println(reverseString.usingStringBuffer("Shinto"));
    }
    String reverse(String input){
        String result = "";
        for(int i=input.length()-1; i>=0; i--){
            result  += input.charAt(i);
        }
        return result;
    }
    String recursiveReverse(String arg){
        if(arg.length() == 1) {
            return arg;
        } else {
            return arg.charAt(arg.length()-1) + recursiveReverse(arg.substring(0, arg.length()-1));
        }
    }
    String usingStringBuffer(String arg){
       StringBuffer sb = new StringBuffer(arg);
       return sb.reverse().toString();
    }
}
