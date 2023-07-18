package galacitic;

import java.util.Scanner;

public class GalaciticArithmetic 
{
	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		//System.out.println("Enter 2 numbers");
		
		long num1 = Scan.nextLong();
		long num2 = Scan.nextLong();
		// for performing addition , call method
		long sum = galacticAddition(num1, num2); //right side ,this is method
		System.out.println(sum); //printing statement
		Scan.close();
	}

	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}
