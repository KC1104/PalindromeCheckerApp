public class PalindromeCheckerApp {
    public static void main(String args[]) {
        //Checking palindrome by reversing he string and then comparing
        String word="madam";
        String reverse="";
        for(int i=word.length()-1;i>=0;i--) {
            reverse += word.charAt(i);
        }
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+word.equals(reverse));

    }
}
