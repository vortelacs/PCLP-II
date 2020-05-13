package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ok = 0, i;
        Scanner in = new Scanner(System.in);

        System.out.print("Dati sirul: ");
        String Str = in.nextLine();

        char[] Sirul = Str.toCharArray();
        System.out.print("Dati caracterul cautat: ");
        char ch = in.next().charAt(0);

        for (i = 0; i < Sirul.length; i++) {
            if (ch == Sirul[i]) {
                System.out.println("Caracterul a fost gasit pe indexul " + i);
                ok = 1;
                break;
            }
        }

        if (ok == 0) System.out.print("Caracterul nu a fost gasit");
    }
}
