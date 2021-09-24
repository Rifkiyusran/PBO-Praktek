package Soal1;

// impor scanner ke program
import java.util.*;
public class datatype {

	public static void main(String[] args) {
		// Deklarasi Variabel
		long ln;
			
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukan jumlah nilai yang akan di inputkan: ");
		int k = keyboard.nextInt();
		
		for (int i=0; i<k; i++) {
			try 
			{
				// pindai output dari nomor yang ingin Anda gunakan
				System.out.println("\nMasukan nilai yang ingin di lihat: ");
				ln = keyboard.nextLong();
				
				// Untuk menampilkan hasil 
				System.out.println(ln+" can be fitted in:");
                		if(ln>=-128 && ln<=127)System.out.println("* byte");
                		if(ln>=-32768 && ln<=32767)System.out.println("* short");
                		if(ln>=-2147483648 && ln<= 2147483647)System.out.println("* int");
                		if(ln>=-9223372036854775808L && ln<= 9223372036854775807L)System.out.println("* long");
			}
			catch(Exception moreThanLong)
	        	{
	            		System.out.println(keyboard.next() + " can't be fitted anywhere.");
	        	}
		}
		
	}

}