import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {

		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer number:: ");
		num = sc.nextInt();

		int square = 0;
		int temp = 0;
		int countDigits = 0;
		int firstPart = 0;
		int secondPart = 0;
		int sum = 0;

		square = num * num;

		temp = num;
		while (temp != 0) {
			countDigits++;
			temp /= 10;
		}

		firstPart = square / (int) Math.pow(10, countDigits);
		secondPart = square % (int) Math.pow(10, countDigits);
		sum = firstPart + secondPart;

		// compare sum and number and check any part have only 0
		if (sum == num && firstPart != 0 && secondPart != 0)
			System.out.println(num + " is a" + " kaprekar number");
		else
			System.out.println(num + " is not a" + " kaprekar number");

		sc.close();

	}

}
