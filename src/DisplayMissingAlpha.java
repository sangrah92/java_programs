import java.util.*;

public class DisplayMissingAlpha {

	private static boolean isStringUpperCase(String str) {

		// convert String to char array
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			// if any character is not in upper case, return false
			if (!Character.isUpperCase(charArray[i]))
				return false;
		}

		return true;
	}

	static String remVowel(String str) {
		Character vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		List<Character> al = Arrays.asList(vowels);

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {

			if (al.contains(sb.charAt(i))) {
				sb.replace(i, i + 1, "");
				i--;
			}
		}

		return sb.toString();
	}

	public static String sortString(String inputString) {
		char tempArray[] = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}

	static int MAX_CHAR = 26;

	static void findAndPrintUncommonChars(String str) {
		char[] ch = new char[str.length()];

		// Copy character by character into array
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		// for (char c : ch) {
		System.out.println("displaying missing alphabets:");

		for (char j = ch[0]; j <= ch[ch.length - 1]; j++) {
			System.out.printf("%c", j);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if (!isStringUpperCase(str))
			System.out.println("String is not in upppercase");
		else {

			String str2 = remVowel(str);
			System.out.println("after deleting vowel: " + str2);
			System.out.println("after arranging in alphabetical order: "
					+ sortString(str2));
			String str4 = sortString(str2);
			findAndPrintUncommonChars(str4);
		}
		sc.close();
	}

}
