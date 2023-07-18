package temperature;

import java.util.Scanner;

public class Temperature //class name
{
	


	public static void main(String[] args)
	{
		Scanner Scan= new Scanner(System.in);
		System.out.println("enter a fahrenheit");
		double fahrenheit=Scan.nextDouble();
		Temperature temperatureConverter = new Temperature(); //Temperature is class name it must be same as above class name
		System.out.printf("%.2f\n",temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		Scan.close();
	}


//functions
public double convertFahrenheitToCelsius(double fahrenheit)
{
	return (fahrenheit - 32) * 5/9 ;
}
}

