import java.util.Scanner;

public class studentMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rollno[] = new int[5];
		int marksMaths[] = new int[5];
		int marksEnglish[] = new int[5];
		int marksSanskrit[] = new int[5];
		int total[] = new int[5];
		int i, j, k, l;

		for (i = 0; i < 5; i++) {
			System.out.println("Enter roll number of the student");
			rollno[i] = sc.nextInt();
			System.out.println("Enter marks of the student in Maths");
			marksMaths[i] = sc.nextInt();
			System.out.println("Enter marks of the student in English");
			marksEnglish[i] = sc.nextInt();
			System.out.println("Enter marks of the student in Sanskrit");
			marksSanskrit[i] = sc.nextInt();

			total[i] = (marksMaths[i] + marksEnglish[i] + marksSanskrit[i]);
		}
		System.out
				.println("----------------------------------RESULT----------------------------------------------");
		System.out
				.println("Roll no. \t Maths \t English \t Sanskrit \t Total ");

		for (j = 0; j < 5; j++) {
			System.out.println(rollno[j] + "\t \t" + marksMaths[j] + "\t \t"
					+ marksEnglish[j] + "\t \t" + marksSanskrit[j] + "\t \t"
					+ total[j]);
		}

		int maxMaths = marksMaths[0];
		int maxEnglish = marksEnglish[0];
		int maxSanskrit = marksSanskrit[0];
		int posMaths = 0;
		int posEnglish = 0;
		int posSanskrit = 0;
		System.out.println("\nRoll no. & highest marks of the students in each subject");
		System.out.println("Subject \t Roll no. \t  HIghest Marks ");

		for (k = 0; k < 5; k++) {
			if (maxMaths < marksMaths[k]) {
				maxMaths = marksMaths[k];
				posMaths = k;
			}
			if (maxEnglish < marksEnglish[k]) {
				maxEnglish = marksEnglish[k];
				posEnglish = k;
			}
			if (maxSanskrit < marksSanskrit[k]) {
				maxSanskrit = marksSanskrit[k];
				posSanskrit = k;
			}
		}
		System.out.println("Maths" + "\t" + rollno[posMaths] + "\t \t"
				+ maxMaths);
		System.out.println("English" + "\t" + rollno[posEnglish] + "\t \t"
				+ maxEnglish);
		System.out.println("Sanskrit" + "\t" + rollno[posSanskrit] + "\t \t"
				+ maxSanskrit);

		int max = total[0];
		int posTotal = 0;
		System.out.println("\nRoll no. & highest total marks of the student");
		System.out.println("Roll no. \t  Highest Total Marks ");

		for (l = 0; l < 5; l++) {
			if (max < total[l]) {
				max = total[l];
				posTotal = l;
			}
		}
		System.out.println(rollno[posTotal] + "\t \t \t" + max);
		sc.close();

	}

}
