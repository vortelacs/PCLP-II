package com.company;

import java.util.Scanner;

public class Base {


    static int changeBase(int number, int base, int power){

        if(number == 0) return 0;
        else{
            return (int) ((number%base)*(Math.pow(10, power)) + changeBase(number/base, base, power+1));
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dati numarul de convertit: ");
        int number = in.nextInt();
        System.out.print("Dati noua baza: ");
        int baza = in.nextInt();


        int raspuns = changeBase(number, baza, 0);

        System.out.println(raspuns);

    }
}
