package Association;

public class Pemain {
	private String nama;
	private int nomerpunggung;
	private String posisi;
	
	Pemain(String nama) {
		this.nama = nama;
	}
	
	public void setNomerPunggung(int nomerpunggung) {
		this.nomerpunggung = nomerpunggung;
	}
	
	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	
	public String getnamapemain() {
		return this.nama;
	}
	
	public int getNomerPunggung() {
		return this.nomerpunggung;
	}
	
	public String getPosisi() {
		return this.posisi;
	}
}