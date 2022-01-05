package generic;

public class Generic<T> {
    private T Manusia;
    
    protected void setManusia(T Manusia){
        this.Manusia = Manusia;
    }
    
    protected T getManusia(){
        return Manusia;
    }
}