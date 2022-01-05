package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;


public class GWildcard extends Manusia {
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
    public void display(){
        Collection<String> Group1 = new ArrayList<>();
        Group1.add("Rifki Yusran");
        Group1.add("Mesut Ozil");
        Group1.add("Jadon Sancho");
        System.out.println("Group Berdasarkan Nama : ArrayList Collection");
        printCollection(Group1);
        Collection<Integer> Group2 = new LinkedList<>();
        Group2.add(201511058);
        Group2.add(201511077);
        Group2.add(201511080);
        System.out.println("Group Berdasarkan NIM : LinkedList Collection");
        printCollection(Group2);
        Collection<Character> Group3 = new HashSet<>();
        Group3.add('Y');
        Group3.add('A');
        Group3.add('M');
        System.out.println("Group Berdasarkan Character : HashSet Collection");
        printCollection(Group3);
    }
}