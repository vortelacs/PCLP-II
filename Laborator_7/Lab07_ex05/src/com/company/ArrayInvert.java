package com.company;

import java.util.Scanner;

public class ArrayInvert {

    static void printArray(int[] arr, int inx){

        if(inx <0) return;

        System.out.print(arr[inx] + " ");
        printArray(arr, inx - 1);

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Dati numarul de elemente:");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Dati elementele tabloului");
        for (int i = 0; i < size; i++) arr[i] = in.nextInt();

        printArray(arr, size-1);


    }

}
