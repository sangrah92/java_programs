import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a sentence: "); 
		String str = sc.nextLine();
		String s[] = str.split(" ");
		String ans = "";
		
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		
		System.out.println("Reversed String:");
		System.out.println(ans.substring(0, ans.length() - 1));
		sc.close();
		
	}
	
}
