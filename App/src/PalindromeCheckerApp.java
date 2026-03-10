import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String args[]) {
        //Checking palindrome by using Queue and Stack
        String word="A man a plan a canal Panama";
        boolean ans=true;
        String normalized="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==' ')  continue;
            normalized+=Character.toLowerCase(word.charAt(i));
        }

        for(int i=0;i<normalized.length()/2;i++){
            if(normalized.charAt(i)!=normalized.charAt(normalized.length()-i-1)) ans=false;
        }
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}
