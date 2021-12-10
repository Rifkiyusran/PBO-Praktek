package Soal3;

import java.io.FileInputStream;

public class File {
	public static void main(String[] args) {
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream("srontea.txt");
		}
	catch(Exception ex) {
			System.out.println("File Tidak Di Temukan");
		}
	}
}