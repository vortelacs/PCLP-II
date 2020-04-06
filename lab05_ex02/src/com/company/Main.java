package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size, i, j, addit=0;

        System.out.print("Give the number of elements: ");
        size = in.nextInt();

        long startTime = System.currentTimeMillis();

        int[] arr = new int[size];

        for (i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        if(arr.length%2==1) addit=1;

        int[] arr_i=new int[size/2];
        int[] arr_p=new int[size/2+addit];

        for(i=0, j=0;i<arr.length;i+=2,j++) arr_p[j] = arr[i];

        for(i=1, j=0;i<arr.length;i+=2,j++) arr_i[j] = arr[i];


        HeapSort.Sort(arr_i);
        ShellSort.Sort(arr_p);

        for(i=0, j=0;i<arr.length;i+=2,j++) arr[i] = arr_p[j];

        for(i=1, j=0;i<arr.length;i+=2,j++) arr[i] = arr_i[j];


        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println("Time execution: " + duration);

        for (i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}