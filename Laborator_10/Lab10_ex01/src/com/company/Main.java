package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();
        for (int i = 0; i < 50; i++) lista.add(i);

        System.out.print("Dati numarul de elemente in set: ");
        int set_Size = in.nextInt();
        int[] set = new int[set_Size];

        System.out.println("Dati elementele");
        for (int i = 0; i < set_Size; i++) set[i] = in.nextInt();


        for (int i = 0; i < set_Size; i++) {

            if(lista.contains(set[i])) lista.remove((Integer) set[i]);

            lista.add(0, set[i]);

        }
        System.out.println(lista);

    }

}
