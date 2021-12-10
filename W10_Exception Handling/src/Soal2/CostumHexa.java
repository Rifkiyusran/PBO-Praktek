package Soal2;

import java.util.Scanner;
public class CostumHexa {

	public static int cekHexa2Dec(String hexa) {
	    try {
	        return Integer.parseInt(hexa, 16);
	    } catch (NumberFormatException ex) {
	        return 0;
	    }
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nilai HexaDesimal: ");
		String hexaDec = input.next();
		input.close();
		
		int cekHexa = cekHexa2Dec(hexaDec);
		if(cekHexa != 0) { // jika input merupakan hexadesimal
			System.out.println(hexaDec + " nilai yang di inputkan merupakan bilangan HexaDesimal");
			System.out.println("Nilai Desimal: " + cekHexa);
		}else { // jika input bukan merupakan hexadesimal
			System.out.println(hexaDec + " nilai yang di inputkan bukan merupakan bilangan HexaDesimal");
		}
	}
}