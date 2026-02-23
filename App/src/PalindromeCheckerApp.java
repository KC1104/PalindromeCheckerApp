public class PalindromeCheckerApp {
    public static void main(String args[]) {
        String word="madam";
        boolean ans=true;
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)) ans=false;
        }
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}
