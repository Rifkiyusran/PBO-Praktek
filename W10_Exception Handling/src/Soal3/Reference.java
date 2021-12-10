package Soal3;

public class Reference{
	public static void main(String[] args){
		String pemain;
		try {
			pemain = new String();
			System.out.println("siapa pemain brazil " + pemain);
		}
		catch (Exception e){
			System.out.println("Nilai belum diinisialisasi");
		}
	}
}