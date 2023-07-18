package financecalculator;

import java.util.Scanner;

public class FinanceCalculator {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Input");
		double principal = Scan.nextDouble();
		double Rate = Scan.nextDouble();
		double time = Scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.printf("%.2f", calculator.calculateSimpleInterest(principal, Rate, time));
		Scan.close();
	}

	public double calculateSimpleInterest(double principal, double Rate, double time) {
		return principal * Rate * time;
	}
}
