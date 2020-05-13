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


        System.out.println("Dati de unde vreti sa incepeti sa taiati(inclusiv): ");
        int cutStart = in.nextInt();

        System.out.println("Dati pana unde vreti sa taiati(inclusiv): ");
        int cutFinish = in.nextInt();

        System.out.println("Dati unde vreti sa lipiti (pozitia):");
        int pasteStart = in.nextInt();


        for (String i :lista1) System.out.print(i + " ");
        System.out.println();
        for (String i :lista2) System.out.print(i + " ");
        System.out.println();


        for(int i=cutStart-1,  j = pasteStart-1; i < cutFinish; i++, j++){

            lista2.add(j, lista1.get(i));
        }

        for (String i :lista2) System.out.print(i + " ");
    }
}
