package doubletrouble;

import java.util.Scanner;

public class DoubleTrouble {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	//System.out.println("enter the number");
	int num=Scan.nextInt();
	//int res=doubleTheNumber(num);// why we can collect whatever is there we can print
	System.out.println(doubleTheNumber(num));
	Scan.close();
}
// functions
public static int doubleTheNumber(int num) 
{
	return num*2;
}
}