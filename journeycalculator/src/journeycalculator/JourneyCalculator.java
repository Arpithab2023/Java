package journeycalculator;

import java.util.Scanner;

public class JourneyCalculator 
{
	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the spee and time in realnumbers");
		double speed=Scan.nextDouble();
		double time=Scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.printf("%.2f\n",journeyCalculator.calculateDistance(speed,time));
		Scan.close();
	}






	public double calculateDistance(double speed, double time) 
	{
		return speed * time;
	}
}