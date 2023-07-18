package secretmessagedecoder;

import java.util.Scanner;

public class SecreteMessageDecoder {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=Scan.next().charAt(0);
		SecreteMessageDecoder decoder = new SecreteMessageDecoder();
		System.out.println(decoder.decodeCharacter(ch));
		Scan.close();

	}
	 public int decodeCharacter(char ch)
	 {
		 return ch;
	 }

}
