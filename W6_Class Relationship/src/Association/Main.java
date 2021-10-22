package Association;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club clb = new Club("Paris Saint Germain");
		Pemain Pemain= new Pemain("Neymar da Silva Santos Júnior");
		Pemain.setNomerPunggung(10);
		Pemain.setPosisi("LWF");
		System.out.println("Nama 		:" +Pemain.getnamapemain());
		System.out.println("Nomer Punggung 	:" +Pemain.getNomerPunggung());
		System.out.println("Posisi  	:" +Pemain.getPosisi()+"\nMerupakan Pemain Dari Club : ");
		System.out.println(clb.getNamaClub());
		
	}

}