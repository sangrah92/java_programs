

import java.util.Scanner;

public class CalculateUsingOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		double s = 0.0;
		int a[] = new int[4];
		String b[] = new String[3];
		
		for (i = 0; i < 4; i++) {
			System.out.print("Enter a Number: ");
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < 3; i++) {
			System.out.print("Operator[+,-,*,/]: ");
			b[i] = sc.next();
		}
		
		s = a[0];
		for (i = 0; i < 3; i++) {
			if (b[i].equals("+"))
				s = s + a[i + 1];
			if (b[i].equals("*"))
				s = s * a[i + 1];
			if (b[i].equals("-"))
				s = s - a[i + 1];
			if (b[i].equals("/"))
				s = s / a[i + 1];
		}
		
		System.out.println("Result is -->" + s);
		sc.close();
	}
	
}
******************************
