package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dati numarul de copii: ");
        int n = in.nextInt();

        System.out.print("Dati m: ");
        int m = in.nextInt();

        int current = 0, i;


        LinkedList<Integer> copii = new LinkedList<>();
        for (i = 0; i < n; i++) copii.add(i + 1);

        
        System.out.println(copii);


        while (copii.size() > 1) {

            for (i = 1; i != m; i++, current++){
                if (current > n-1) current = 0;
            }
            if (current > n-1) current = 0;

            int temp = copii.get(current);
            copii.remove(current);

            n--;

            System.out.print(copii);
            System.out.println("      Eliminat copilul nr.   " + temp);

        }

        System.out.println("\n    A ramas copilul numarul " + copii.get(0));

    }
}
