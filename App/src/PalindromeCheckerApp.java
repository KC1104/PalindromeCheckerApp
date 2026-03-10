import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String args[]) {
        //Checking palindrome by using Queue and Stack
        String word="level";
        boolean ans=true;
        LinkedList<Character> l=new LinkedList<>();
        for(int i=0;i<word.length();i++){
            l.add(word.charAt(i));
        }
        while(l.size()>1){
            if(l.removeFirst()!=l.removeLast()) ans=false;
        }
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}
