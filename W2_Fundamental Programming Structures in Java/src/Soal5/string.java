package Soal5;


import java.util.Scanner;
public class string {
	public static void main(String[] args) {
		String A, B;
		int length,i;
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Masukan kata  :");
			A = keyboard.nextLine();
			System.out.println("Masukkan Kata :");
			B = keyboard.nextLine();
		}
		length = A.length() + B.length();
		System.out.println("Kata A dan B adalah :" +length);

		i = A.compareTo(B);
		if(i>0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		System.out.printf(A.substring(0,1).toUpperCase()+A.substring(1, A.length()));
        System.out.println(" " + B.substring(0,1).toUpperCase()+B.substring(1, B.length()));
		
	}

}