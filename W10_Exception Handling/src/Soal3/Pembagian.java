package Soal3;

public class Pembagian {
	public static void main(String[] args) {
		try {
			System.out.println("15/0 : " + 15/0);
		}
		catch(Exception ex) {
			System.out.println("Hasil dari pembagian tidak bisa dibagi dengan angka 0");
		}
	}
}