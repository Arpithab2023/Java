package heightconverter;

import java.util.Scanner;

public class HeightConverter {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter height");
		double inches = Scan.nextDouble();
		HeightConverter converter = new HeightConverter();
		System.out.printf("%.2f", converter.convertInchesToFeet(inches));
		Scan.close();
	}

	public double convertInchesToFeet(double inches) {
		return inches / 12;
	}
}
