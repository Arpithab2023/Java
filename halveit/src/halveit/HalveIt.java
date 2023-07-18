package halveit;

import java.util.Scanner;

public class HalveIt {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter amount");
		double num = Scan.nextDouble();

		System.out.printf("%.2f", halveTheNumber(num));
		Scan.close();

	}

	public static double halveTheNumber(double num) {
		return num / 2;
	}
}
