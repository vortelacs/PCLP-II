package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name, guess;
        Scanner in = new Scanner(System.in);

        System.out.print("Give name that should be guessed: ");
        name = in.nextLine();
        char[] cname = name.toCharArray();

        int i = 0, ok = 0;

        Comparation phrase = new Comparation();

        while (ok == 0) {

            System.out.print("Give your string: ");
            guess = in.nextLine();

            if (phrase.mn(name, guess) == 0) {
                System.out.print("Wrong\n");
                i++;
            } else {
                System.out.print("Congrats, you won in " + (i + 1) + " tries");
                ok = 1;
            }
        }
    }
}