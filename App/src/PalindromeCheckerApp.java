public class PalindromeCheckerApp {
    public static void main(String args[]) {
        //Checking palindrome by reversing he string and then comparing
        String word="racecar";
        boolean ans=true;
        char[] letters= new char[word.length()];

        for(int i=0;i<word.length();i++){
            letters[i]=word.charAt(i);
        }

        int j=0,k=letters.length -1;
        while(j<=k){
            if(letters[j]!=letters[k]){
                ans=false;
                break;
            }
            j++;k--;
        }
        System.out.println("Input Text: "+word);
        System.out.println("Is it a Palindrome: "+ans);

    }
}
