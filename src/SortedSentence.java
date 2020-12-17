import java.util.Scanner;
import java.util.StringTokenizer;

public class SortedSentence {

	public static int potential(String s) {
		s = s.toUpperCase();
		int p = 0, l = s.length();
		char ch;
		for (int i = 0; i < l; i++) {
			ch = s.charAt(i);
			p = p + (ch - 64);
		}
		return p;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String s = sc.nextLine();
		int len = s.length();
		char last = s.charAt(len - 1);
		if (last != '!' && last != '?' && last != '.') {
			System.out.println("Invalid Input");
			return;
		}
		s = s.toUpperCase();
		StringTokenizer st = new StringTokenizer(s, " !?.,");
		int count = st.countTokens();
		String words[] = new String[count];
		int p[] = new int[count];
		System.out.print("WORD \t STRENGTH \n");
		
		for (int i = 0; i < count; i++) {
			words[i] = st.nextToken();
			p[i] = potential(words[i]);
			System.out.println(words[i] + " \t   " + p[i]);
		}
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - 1 - i; j++) {
				if (p[j] > p[j + 1]) {
					int temp = p[j];
					p[j] = p[j + 1];
					p[j + 1] = temp;
					String t = words[j];
					words[j] = words[j + 1];
					words[j + 1] = t;
				}
			}
		}
		
		System.out.print("\nSorted Sentence = ");
		for (int i = 0; i < count; i++)
			System.out.print(words[i] + " ");
		System.out.println();
		sc.close();
	}
	
}
