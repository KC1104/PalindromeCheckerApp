import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String args[]) {
        //Checking palindrome by adding characters to the stack and then comparing
        String word="12231";
        boolean ans=true;
       Stack<Character> stack=new Stack<>();

        for(int i=0;i<word.length();i++){
            stack.push(word.charAt(i));
        }

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=stack.pop()){
                ans=false;
                break;
            }
        }
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}
