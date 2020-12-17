import java.util.Scanner;

public class zeroOnePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if ((i-k) % 2 == 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println("");
		}

		sc.close();
	}

}
