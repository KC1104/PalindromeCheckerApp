import java.util.*;

public class PalindromeCheckerApp {
    public static boolean check(int f,int l,String w){
        if(w.charAt(f)!=w.charAt(l)) return false;
        while(f<=l){
            f++;l--;
            check(f,l,w);
        }
        return true;

    }
    public static void main(String args[]) {
        //Checking palindrome by using Queue and Stack
        String word="madam";
        boolean ans=check(0,word.length()-1,word);
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}
