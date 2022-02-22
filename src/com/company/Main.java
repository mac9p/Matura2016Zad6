package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        long[] tablicaLiczb = new long[999];
        Scanner skaner = new Scanner(new FileReader(new File("C:\\Users\\mleko\\Desktop\\" +
                "springProjekty\\untitled6\\src\\com\\company\\liczby.txt")));
        int i = 0;
        while (skaner.hasNext()){
            tablicaLiczb[i] = skaner.nextLong();
            i++;
        }
        System.out.println(Arrays.toString(tablicaLiczb));
        System.out.println(" ");
        System.out.println(liczbyOsemkowe(tablicaLiczb));
        System.out.println(" ");
        System.out.println(liczbyCzworkoweBezZera(tablicaLiczb));
        System.out.println(" ");
        System.out.println(liczbyParzysteWDwojkowym(tablicaLiczb));

    }

    static int liczbyOsemkowe(long[] tab){
        List<Long> longs = new LinkedList<Long>();
        for (long el: tab
             ) {
            String elementinString = Long.toString(el);
            if (elementinString.endsWith("8")){
                longs.add(el);
            }
        }

        return longs.size();
    }
    static int liczbyCzworkoweBezZera(long[] tab){
        List<Long> longs = new LinkedList<Long>();
        for (long el: tab
        ) {
            String elementinString = Long.toString(el);

            if (elementinString.endsWith("4") && !elementinString.contains("0")){
                longs.add(el);
            }
        }

        return longs.size();
    }

    static int liczbyParzysteWDwojkowym(long[] tab){
        List<Long> longs = new LinkedList<Long>();
        for (long el: tab
        ) {
            String elementinString = Long.toString(el);

            if (elementinString.endsWith("2")){
                String trimmedString = elementinString.substring(0,elementinString.length()-1);
                Long trimmedEl = Long.parseLong(trimmedString);
                if (trimmedEl%2 == 0){
                    longs.add(el);
                }

            }
        }

        return longs.size();
    }
    static int liczbyOsemkoweSumaWDziesietnym(long[] tab){
        List<Long> longs = new LinkedList<Long>();
        for (long el: tab
        ) {
            String elementinString = Long.toString(el);
            if (elementinString.endsWith("8")){
                longs.add(el);
            }
        }
        int sum = 0;
        for (Long el: longs
             ) {
            sum+= el;
        }

        return longs.size();
    }

}
