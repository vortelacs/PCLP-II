package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);

        System.out.print("Dati sirul: ");
        String Str = in.nextLine();

        char[] Sirul = Str.toCharArray();

        for (i = 0; i < Sirul.length; i++) {
            if (Sirul[i] == ' ') System.out.println("");
            else System.out.print(Sirul[i]);

        }
    }
}