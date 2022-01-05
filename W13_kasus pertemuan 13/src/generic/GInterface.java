package generic;

public class GInterface extends Manusia {

    public void display(){
        Integer inums[] = { 3, 6, 2, 8, 6 };
        Character chs[] = { 'b', 'r', 'p', 'w' };
        CInterface<Integer> angka = new CInterface<>(inums);
        CInterface<Character> character = new CInterface<>(chs);
        
        System.out.println("Before Sorting");
        System.out.println("Angka");
        for(Integer i : inums){
            System.out.println(i);
        }
        System.out.println("Huruf");
        for(Character c : chs){
            System.out.println(c);
        }
        
        angka.sort(inums);
        character.sort(chs);
        
        System.out.println("After Sorting Descending");
        System.out.println("Angka");
        for(Integer i : inums){
            System.out.println(i);
        }
        System.out.println("Huruf");
        for(Character c : chs){
            System.out.println(c);
        }
    }
}