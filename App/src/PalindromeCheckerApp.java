import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class PalindromeCheckerApp {
    public static void main(String args[]) {
        //Checking palindrome by using Queue and Stack
        String word="civic";
        boolean ans=true;
       Stack<Character> stack=new Stack<>();
       Queue<Character> queue=new LinkedList<>();

        for(int i=0;i<word.length();i++){
            stack.push(word.charAt(i));
            queue.add(word.charAt(i));
        }

        for(int i=0;i<word.length();i++){
            if(queue.remove()!=stack.pop()){
                ans=false;
                break;
            }
        }
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}
