package Soal4;

import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);		
		int gajipokok = 500000;
		int hargaItem = 50000;
		int itempenjualan , bonus, denda, gaji = 0;
		
		itempenjualan = keyboard.nextInt();
		if (itempenjualan >= 80) {
			bonus = (itempenjualan * hargaItem) * (35/100);
			gaji = gajipokok + bonus ;
			System.out.println(gaji);
		} 
		else if (itempenjualan >= 40 && itempenjualan < 80) {
			bonus = (itempenjualan * hargaItem) * (25/100);
			gaji = gajipokok + bonus;
			System.out.println(gaji);
		}
		else if (itempenjualan <= 15 && itempenjualan >= 1) {
			denda = ((15 * hargaItem) - (14 * hargaItem)) * 15/100;
			gaji = gajipokok - denda;
			System.out.println(gaji);		}
		else {
			bonus = itempenjualan * (hargaItem * 10/100);
			gaji = gajipokok + bonus;
			System.out.println(gaji);		}
	}
}