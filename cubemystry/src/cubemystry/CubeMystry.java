package cubemystry;

import java.util.Scanner;

public class CubeMystry 
{
	public static void main(String[] args)
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Scan.nextInt();
		System.out.println(CubeMystry.CubeMystry(num));
		Scan.close();
	}
	public static int CubeMystry(int num) 
	{
		return num*num*num;
	}
}