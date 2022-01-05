package generic;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int pilih;
        for (;;)
        {
            System.out.println("Menu Generic");
            System.out.println("1. Generic Bounded Type Parameters");
            System.out.println("2. Generic Class");
            System.out.println("3. Generic Method");
            System.out.println("4. Generic Interfaces");
            System.out.println("5. Generic WildCard");

            System.out.print("Pilih Menu : ");
            Scanner keyboard = new Scanner(System.in);
            pilih = keyboard.nextInt();

            switch(pilih){
                case 1:
                    // Generic Bounded Type Parameters
                    System.out.println();
                    System.out.println("Generic Bounded Type Parameters");
                    Bounded<Manusia> BMan = new Bounded<>(new Manusia());
                    BMan.Run();
                    break;
                case 2:
                    // Generic Class
                    System.out.println();
                    System.out.println("Generic Class");
                    Bounded<GClass> BGenC = new Bounded<>(new GClass());
                    BGenC.Run();
                    break;
                case 3:
                    // Generic Method
                    System.out.println();
                    System.out.println("Generic Method");
                    Bounded<GMethod> BGenM = new Bounded<>(new GMethod());
                    BGenM.Run();
                    break;
                case 4:
                    // Generic Interfaces
                    System.out.println();
                    System.out.println("Generic Interfaces");
                    Bounded<GInterface> BGenI = new Bounded<>(new GInterface());
                    BGenI.Run();
                    break;
                case 5:
                    // Generic WildCard
                    System.out.println();
                    System.out.println("Generic WildCard");
                    Bounded <GWildcard> BGenW = new Bounded<>(new GWildcard());
                    BGenW.Run();
                    break;
                default: System.out.println("Pilihan Tidak ada");
                    break;
            }
            System.out.print("\n\n");
        }
    }
}