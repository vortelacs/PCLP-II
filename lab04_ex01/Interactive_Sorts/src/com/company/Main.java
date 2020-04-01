package com.company;

import java.util.Scanner;

public abstract class Main {

    public static void show_menu() {
        System.out.println("- C – iniţializează tabloul de sortat cu valori generate aleator ");
        System.out.println("- V - vizualizează tablou ");
        System.out.println("- R - reiniţializează tabloul  ");
        System.out.println("- I - sortare prin inserţie ");
        System.out.println("- B - sortare prin inserţie binară");
        System.out.println("- S - sortare prin selecţie ");
        System.out.println("- T - sortare prin interschimbare  ");
        System.out.println("- H - sortare prin metoda Shakersort  ");
        System.out.println("- X - părăsirea programului. ");

    }

    public static void main(String[] args) {
        long startTime, endTime;

        Scanner in = new Scanner(System.in);
        int size, i;
        char choice;

        System.out.print("Give the number of elements of array: ");
        size = in.nextInt();

        int[] arr = new int[size];

        do {
            show_menu();
            System.out.print("Choose: ");
            choice = in.next().charAt(0);
            choice = Character.toUpperCase(choice);

            switch (choice) {
                case 'R':
                case 'C':
                    for (i = 0; i < size; i++) arr[i] = (int) (Math.random() * 1000);
                    break;
                case 'V':
                    for (i = 0; i < arr.length; i++) System.out.println(arr[i]);
                    break;
                case 'I':
                    startTime = System.currentTimeMillis();
                    Insertion_Sort.Sort(arr);
                    endTime = System.currentTimeMillis();
                    System.out.println("Time execution: " + (endTime - startTime) + " ms\n");
                    break;
                case 'B':
                    startTime = System.currentTimeMillis();
                    Binary_Insertion_Sort.Sort(arr);
                    endTime = System.currentTimeMillis();
                    System.out.println("Time execution: " + (endTime - startTime) + " ms\n");
                    break;
                case 'S':
                    startTime = System.currentTimeMillis();
                    Selection_Sort.Sort(arr);
                    endTime = System.currentTimeMillis();
                    System.out.println("Time execution: " + (endTime - startTime) + " ms\n");
                    break;
                case 'T':
                    startTime = System.currentTimeMillis();
                    Bubble_Sort.Sort(arr);
                    endTime = System.currentTimeMillis();
                    System.out.println("Time execution: " + (endTime - startTime) + " ms\n");
                    break;
                case 'H':
                    startTime = System.currentTimeMillis();
                    Shakersort.Sort(arr);
                    endTime = System.currentTimeMillis();
                    System.out.println("Time execution: " + (endTime - startTime) + " ms\n");
                    break;
                default:
                    System.out.println("Unexpected value: " + choice);
            }

        } while (choice != 'X');

        System.out.println("Goodbye");

    }
}
