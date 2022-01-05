package generic;

public class GMethod extends Manusia {
    public static <T> void print(T nilai) {
        System.out.println(nilai);
    }
    public void display(){
        System.out.println();
        System.out.println("Nilai-nilai yang dicetak:");

        
        print("Siagoy");
        print(15); 
        print(false); 
        print(15.0f); 
        print('Y'); 
    }
}