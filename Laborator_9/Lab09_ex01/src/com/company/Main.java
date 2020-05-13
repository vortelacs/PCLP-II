package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static void showMenu() {

        System.out.println("1. Adaugati un element in lista");
        System.out.println("2. Vizualizati lista");
        System.out.println("3. Iesiti din program");

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int alegere;
        boolean exit = false;
        LinkedList<Integer> lista = new LinkedList<>();
        showMenu();

        while (!exit) {

            System.out.print("Ce vreti sa faceti: ");
            alegere = in.nextInt();

            switch (alegere) {
                case 1:
                    System.out.print("Dati elementul: ");
                    lista.add(in.nextInt());
                    break;
                case 2:
                    for(int i: lista) System.out.print(i + " ");
                    System.out.println();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Alegere invalida!");
                    showMenu();
                    break;

            }
        }
    }
}
