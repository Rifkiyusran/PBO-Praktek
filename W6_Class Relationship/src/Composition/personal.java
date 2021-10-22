package Composition;

import java.io.*;
import java.util.*;

	class personal{
	public String nama;
	public String tanggalLahir;
		personal(String nama, String tanggalLahir) {
			this.nama = nama;
			this.tanggalLahir = tanggalLahir;
		}
	}
	class tglKelahiran {
		private final List<personal> personals;
		tglKelahiran (List<personal> personals){
			this.personals = personals;
		}
		public List<personal> getPersonal(){
			return personals;
		}
	}