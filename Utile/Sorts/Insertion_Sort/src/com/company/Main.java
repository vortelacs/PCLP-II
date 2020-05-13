package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);
        int size, i;

        System.out.print("Give the number of elements:");
        size = in.nextInt();

        int[] arr = new int[size];

        for (i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        Insertion_Sort Sort_obj = new Insertion_Sort(arr);

        Sort_obj.Sort();

        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println("Time execution: " +duration);
    }
}
