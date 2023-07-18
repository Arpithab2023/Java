package planetexplorer;

import java.util.Scanner;

public class PlanetExplorer {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the  surface radius  of the sphere");

		double r = Scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.printf("%.2f", explorer.calculateSurfaceArea(r));
		Scan.close();

	}

	public double calculateSurfaceArea(double r) {
		return 4 * 3.14159 * r * r;
	}
}
