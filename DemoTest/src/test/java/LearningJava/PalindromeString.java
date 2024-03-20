package LearningJava;

public class PalindromeString {

    public static void main(String[] args) {
        // Palindrome String is a string that remains the same when its characters are reversed. Ex: Madam.
        
        String Orgstr= "Madam";
        String rev = "";
        int len = Orgstr.length(); 
        
        for(int i=len-1; i>=0; i--)
        {
            rev=rev+Orgstr.charAt(i);
        }

        if(Orgstr.equals(rev)) {
            System.out.println(Orgstr+ " is Palindrome");
        }
        else {
            System.out.println(Orgstr+ " is not Palindrome");

        }
    }

}
