package com.company;

import java.text.Collator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Dati numarul de cuvinte: ");
        int size = in.nextInt();
        LinkedList<String> cuvinte = new LinkedList<>();

        System.out.println("Dati cuvintele:");
        for(int i = 0; i<size;i++) cuvinte.add(in.next());

        cuvinte.sort((o1, o2) -> Collator.getInstance().compare(o1, o2));

        for(String i: cuvinte) System.out.println(i);

    }
}