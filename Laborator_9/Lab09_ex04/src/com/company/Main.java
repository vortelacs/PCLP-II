package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dati fraza 1: ");
        String fraza1 = in.nextLine();

        System.out.print("Dati fraza 2: ");
        String fraza2 = in.nextLine();


        String[] cuvinte1=fraza1.split("\\W+");
        String[] cuvinte2=fraza2.split("\\W+");

        LinkedList<String> lista1 = new LinkedList<>(Arrays.asList(cuvinte1));
        LinkedList<String> lista2 = new LinkedList<>(Arrays.asList(cuvinte2));

        System.out.println(lista1);
        System.out.println(lista2);

        System.out.println("Cuvintele comune in cele doua fraze:");
        for(String i: lista1) if(lista2.contains(i)) System.out.println(i);

    }
}
