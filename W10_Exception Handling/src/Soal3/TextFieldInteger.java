package Soal3;

import java.util.Scanner;

public class TextFieldInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inputkan Nilai yang di inginkan: ");
		try {
			int integer = input.nextInt();
			System.out.println("Nilai input: " + integer);
		}
	catch(Exception ex) 
	{
			System.out.println("Nilai yang diinputkan bukan merupakan integer");
	}
		input.close();
	}
}