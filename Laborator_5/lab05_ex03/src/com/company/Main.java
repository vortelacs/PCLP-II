package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number, i;

        Scanner in = new Scanner(System.in);

        System.out.print("Give the number of consumers:");
        number = in.nextInt();

        Consumer[] consumers = new Consumer[number];
        for (i = 0; i < number; i++) consumers[i] = new Consumer();


        System.out.println("\nGive the information about consumers:");

        for (i = 0; i < number; i++) {
            System.out.println("\nGive for the consumer " + (i + 1) + " :");

            System.out.print("Name: ");
            consumers[i].set_Name(in.next());

            System.out.print("Adress: ");
            consumers[i].set_Adress(in.next());

            System.out.print("Phone number: ");
            consumers[i].set_Phone(in.nextInt());

            System.out.print("Valoare factura: ");
            consumers[i].set_Factura(in.nextInt());
        }

        QuickSort.Sort(consumers);


        System.out.println("Primii 3 abonati dupa valorea facturii sunt:\n");
        for (i = 0; i < 3 && i < consumers.length; i++) {
            System.out.println("Nume :" + consumers[i].get_Name());
            System.out.println("Adresa:" + consumers[i].get_Adress());
            System.out.println("Numar telefon:" + consumers[i].get_Phone());
            System.out.println("Valoare factura:" + consumers[i].get_Factura());
            System.out.println();
        }
    }
}
