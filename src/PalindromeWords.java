import java.util.Scanner;
import java.util.StringTokenizer;

public class PalindromeWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
        String s = sc.nextLine();
        int count = 0;
        s = s.trim();
        s = s.toUpperCase();
        int len = s.length();
        char last = s.charAt(len - 1);
        if(last != '.' && last != '?' && last != '!'){
            System.out.println("Invalid Termination of String");
            return;
        }
        StringTokenizer st = new StringTokenizer(s, " .?!");
        int c = st.countTokens();
        for(int i = 1; i <= c; i++){
            String word = st.nextToken();
            if(isPalindrome(word)){
                System.out.print(word + " ");
                count++;
            }
        }
        if(count > 0)
            System.out.println("\nNumbers of Palindrome Words are : " + count);
        else
            System.out.println("No Palindrome Word is Present.");
        sc.close();
    }
    public static boolean isPalindrome(String w){
        String r = new String();
        for(int i = w.length() - 1; i >= 0; i--)
            r += w.charAt(i);
        return w.equalsIgnoreCase(r);
	}

}
