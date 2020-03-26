package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nr_test;
        char ch_test;
        Scanner in = new Scanner(System.in);

        Getter_Setter test = new Getter_Setter();

        System.out.print("Give the character: ");
        ch_test = in.next().charAt(0);

        test.setCharacter(ch_test);

        System.out.print("Give the number: ");
        nr_test = in.nextInt();

        test.setNumber(nr_test);

        System.out.println("Your character is " + test.getCharacter());
        System.out.println("Your number is " + test.getNumber());

    }
}
