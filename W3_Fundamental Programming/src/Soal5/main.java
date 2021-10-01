package Soal5;

import java.util.Scanner;


public class main {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int plat1, plat2, plat3, plat4;
		String nomer;
		
		plat1 = keyboard.nextInt();
		plat2 = keyboard.nextInt();
		plat3 = keyboard.nextInt();
		plat4= keyboard.nextInt();

		nomer = String.valueOf(plat1) + String.valueOf(plat2) + String.valueOf(plat3) + String.valueOf(plat4);
        long all = Long.parseLong(nomer);
        
        Long lastOP = (all-999999)%5;
        
        if(lastOP == 0){
            System.out.println("Jalan");
        }else{
            System.out.println("Berhenti");
        }
        
    }
}