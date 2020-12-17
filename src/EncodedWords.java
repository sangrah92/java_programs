import java.util.Scanner;

public class EncodedWords {

	static String minWord = "", maxWord = "";

	static int LongestWordLength(String str) {
		String[] words = str.split(" ");
		int length = 0;

		for (String word : words) {
			if (length < word.length()) {
				length = word.length();
			}
		}
		return length;
	}

	static void minMaxLengthWords(String input) {
		// minWord and maxWord are received by reference
		// and not by value
		// will be used to store and return output
		int len = input.length();
		int si = 0, ei = 0;
		int min_length = len, min_start_index = 0, max_length = 0, max_start_index = 0;

		// Loop while input string is not empty
		while (ei <= len) {
			if (ei < len && input.charAt(ei) != ' ') {
				ei++;
			} else {
				// end of a word
				// find curr word length
				int curr_length = ei - si;

				if (curr_length < min_length) {
					min_length = curr_length;
					min_start_index = si;
				}

				if (curr_length > max_length) {
					max_length = curr_length;
					max_start_index = si;
				}
				ei++;
				si = ei;
			}
		}

		// store minimum and maximum length words
		minWord = input
				.substring(min_start_index, min_start_index + min_length);
		maxWord = input
				.substring(max_start_index, max_start_index + max_length);
	}

	static boolean isPalindrome(String str) {

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters toc compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	static void encode(String s) {

		// changed string
		String newS = "";
		int k = 2;

		// iterate for every characters
		for (int i = 0; i < s.length(); ++i) {
			// ASCII value
			int val = s.charAt(i);
			// store the duplicate
			int dup = k;

			// if k-th ahead character exceed 'z'
			if (val + k > 90) {
				k -= (122 - val);
				k = k % 26;

				newS += (char) (70 + k);
			} else {
				if (val == 32)
					newS += (char) (val);
				else
					newS += (char) (val + k);
			}

			k = dup;
		}

		// print the new string
		System.out.println("The new encoded string is : " + newS);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = sc.nextLine();
		s = s + " ";
		s = s.toUpperCase();
		String s1 = "", s2 = "", word = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				s1 = s1 + ch;
			} else {
				s2 = s2 + s1.charAt(0);
				s1 = "";
			}
		}
		minMaxLengthWords(s);
		System.out.println("New word by taking first character of each word is " + s2 + "\n");
		if (isPalindrome(s2))
			System.out.print(s2 + " is a palindrome word. \n\n");
		else
			System.out.print(s2 + " is not a palindrome word. \n\n");
		System.out.println(maxWord + " is the word of maximum length " + maxWord.length() + ".\n");
		encode(s);
		sc.close();
	}

}
