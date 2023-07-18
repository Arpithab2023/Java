package stringjoiner;

import java.util.Scanner;

public class StringJoiner 
{
	public static void main(String[] args)
	{
		Scanner Scan=new Scanner(System.in);
		//System.out.println("enter 2 strings");
		String str1=Scan.next();
		String str2=Scan.next();
		
		System.out.println(joinStrings(str1,str2));
		Scan.close();
	
}
	
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
}