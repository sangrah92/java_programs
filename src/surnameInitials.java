import java.util.Scanner;

public class surnameInitials {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String name = sc.nextLine();
		name = name.trim();
		String s[] = name.split(" ");
		String rev = "";
		String surName = "";
		
		for (int i = s.length - 1; i >= 0; i--) {
			rev += s[i] + " ";
		}

		int space = rev.indexOf(' ');
        surName = rev.substring(0, space).toUpperCase();
        System.out.print(surName);
        
        int lastSpace = rev.lastIndexOf(' ');
        for (int i = 0; i < lastSpace; i++) {
            char ch = rev.charAt(i);
            if (ch == ' ') 
               System.out.print(" " + Character.toUpperCase(rev.charAt(i+1)) + ".");
        }
		sc.close();
	}

}
