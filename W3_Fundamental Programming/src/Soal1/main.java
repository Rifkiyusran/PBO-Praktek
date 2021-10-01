package Soal1;

import java.util.*;

public class main {
    public static void main(String[] args){
    	Scanner keyboard = new Scanner(System.in);
    	String input;
    	input= keyboard.nextLine();
    	String[] temp = input.split("\\ |!|,|\\?|\\.|\\_|\\@|'");
    	System.out.println(temp.length);
    	input=input.replaceAll("\\'","\n");
    	input=input.replaceAll(" ","\n");
    	System.out.println(input);
    	
    }
} 