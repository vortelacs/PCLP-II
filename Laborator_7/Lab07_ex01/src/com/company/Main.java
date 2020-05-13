package com.company;

import java.util.Scanner;

public class Main {


    static int suma(int[] arr, int n){

        if(n==0) return arr[0];
        else return arr[n] + suma(arr, n-1);
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Dati numarul de elemente din tablou: ");
        int size = in.nextInt();


        int[] array = new int[size];
        System.out.println("Dati elementele");
        for (int i = 0; i < size; i++) array[i] = in.nextInt();


        System.out.println("Suma numerelor este: " + suma(array, size-1));
    }
}
