package Composition;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		personal tanggallahir1 = new personal("Neymar da Silva Santos J�nior", "5 Februari 1992");
		personal tanggallahir2 = new personal("Paul Labil� Pogba", "15 Maret 1993");
		personal tanggallahir3 = new personal("Jadon Malik Sancho", "25 Maret 2000");
		personal tanggallahir4 = new personal("N'Golo Kant�", "29 Maret 1991");

		List<personal> personals = new ArrayList<personal>();
		personals.add(tanggallahir1);
		personals.add(tanggallahir2);
		personals.add(tanggallahir3);
		personals.add(tanggallahir4);
		tglKelahiran kelahiran = new tglKelahiran(personals);
		List<personal> var = kelahiran.getPersonal();
			for(personal sVar : var){
				System.out.println("Nama 		: " + sVar.nama + "\n"+"Tanggal Lahir 	: " + sVar.tanggalLahir);
			}
	}

}