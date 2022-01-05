package generic;

public class Bounded <T extends Manusia> {
    private T objRef;
    
    public Bounded(T obj){
        this.objRef = obj;
    }
    
    public void Run(){
        this.objRef.display();
    }
}

class Manusia{
    public void display(){
        System.out.println("Pemanggilan semua Class Generic menggunakan Generic Bound : ");
    }
}