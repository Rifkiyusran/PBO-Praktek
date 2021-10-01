package Soal2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] argss){
        String[][] inputan = new String[3][2];
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String bahasa;
            for(int i = 0; i < 3; i++) {
                bahasa = input.readLine();
                inputan[i] = (bahasa.split("\\s+"));
            }
            System.out.println("================================");
            for(String[] data : inputan) {
                System.out.println(String.format("%-15s", data[0]).toLowerCase() + String.format("%3s", data[1]).replace(" ", "0"));
            }
            System.out.println("================================");            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}