package timeconverter;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter a minutes");
		double minutes = Scan.nextInt();
		System.out.printf("%.1f", convertToHours(minutes));
		Scan.close();
	}

	public static double convertToHours(double minutes) {
		return minutes / 60;
	}
}
