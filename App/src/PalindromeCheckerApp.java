import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String args[]) {
        //Checking palindrome by using Queue and Stack
        String word="refer";
        boolean ans=true;
        Deque<Character> d=new ArrayDeque<>();
        for(int i=0;i<word.length();i++){
            d.add(word.charAt(i));
        }
        while(d.size()>1){
            if(d.pop()!=d.removeLast()) ans=false;
        }
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}
