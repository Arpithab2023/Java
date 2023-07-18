package semestermarks;

import java.util.Scanner;

public class SemesterMarks {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter a all sem marks");
		int sem1 = Scan.nextInt();
		int sem2 = Scan.nextInt();
		int sem3 = Scan.nextInt();
		int sem4 = Scan.nextInt();
		int sem5 = Scan.nextInt();
		int sem6 = Scan.nextInt();
		int sem7 = Scan.nextInt();
		int sem8 = Scan.nextInt();
		

		System.out.printf("%.2f",calculateAverage(sem1, sem2,  sem3, sem4, sem5,sem6,sem7,  sem8));
		Scan.close();
	}

	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7,
			int sem8)

	{
		return (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8) / 8.0;
	}
}
