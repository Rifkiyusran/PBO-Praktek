package generic;

public class GClass extends Manusia {
    public void display(){
        
        Generic<String> nama = new Generic<>();
        nama.setManusia("Yoga Nizar H");
        System.out.println("Namaku: "+nama.getManusia());
        
        
        Generic<Integer> umur = new Generic<>();
        umur.setManusia(19);
        System.out.println("Umurku: "+umur.getManusia()+" Tahun");
        
   
        Generic<Boolean> kondisi = new Generic<>();
        kondisi.setManusia(true);
        System.out.println("Saya sedang belajar: "+kondisi.getManusia());
        
        
        Generic<Float> IPK = new Generic<>();
        IPK.setManusia(4.0f);
        System.out.println("Nilai IPKku: "+IPK.getManusia());
        
        
        Generic<Character> Karakter = new Generic<>();
        Karakter.setManusia('Y');
        System.out.println("Huruf Awalan Namaku: "+Karakter.getManusia());
    }
}