package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static void sterge(LinkedList<String> cuvinte, LinkedList<Integer> numere, int i){

        if(i<0) return;
        cuvinte.remove((int)numere.get(i));
        sterge(cuvinte, numere, i-1);
        
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Dati numarul de cuvinte: ");
        int size = in.nextInt();

        LinkedList<String> cuvinte = new LinkedList<>();
        LinkedList<Integer> numere = new LinkedList<>();



        System.out.println("Dati cuvintele:");
        for(int i=0;i<size;i++) cuvinte.add(in.next());



        System.out.print("Dati numarul de cuvinte ce vreti sa stergeti: ");
        int size2= in.nextInt();

        System.out.println("Dati numarele lor de ordine:");
        for(int i=0;i<size2;i++) numere.add(in.nextInt()-1);
        numere.sort(Integer::compareTo);



        sterge(cuvinte, numere, size2 - 1);

        for(String i: cuvinte) System.out.println(i);

    }
}
