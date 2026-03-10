import java.util.*;
class PalindromeService{
    public boolean checkPalindrome(String w){
        int start=0,end=w.length()-1;
        while(start<=end){
            if(w.charAt(start)!=w.charAt(end)) return false;
            start++;end--;
        }
        return true;
    }
}
public class PalindromeCheckerApp {
    public static void main(String args[]) {
        //Checking palindrome by using Queue and Stack
        String word="racecar";
        PalindromeService ob=new PalindromeService();
        boolean ans=ob.checkPalindrome(word);
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}

