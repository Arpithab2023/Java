package power;

import java.util.Scanner;
public class PowerOfSquare 
{
	public static void main(String[] args) 
	{
		Scanner	Scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Scan.nextInt();
		System.out.println(PowerOfSquare.squareNumber(num));
		Scan.close();
	}
	public static int squareNumber(int num)
	{
		return num*num;
	}
}

