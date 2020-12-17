import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		
		int max_len = 0, len = 0;
		String w = "", max_word = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence in Upper Case");
		String str = sc.nextLine();
		str = str.toUpperCase().trim();
		str = str + ' ';
		
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x != ' ')
				w = w + x;
			else {
				len = w.length();
				if (len > max_len) {
					max_word = w;
					max_len = len;
				}
				w = "";
			}
		}
		
		System.out.println("Longest word = " + max_word);
		System.out.print("Length : " + max_len);
		sc.close();
	}
	
}
