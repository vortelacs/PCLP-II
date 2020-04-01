package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i;
        int[] arr_rand = new int[6];


        int[] arr = new int[49];
        System.out.println("Give the numbers");
        for (i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (i = 0; i < 6; i++) {
            arr_rand[i] = arr[(int) (Math.random() * 48)];
        }
        System.out.println("The computer chose the numbers:");
        for (i = 0; i < 6; i++) System.out.print(arr_rand[i] + " ");

        Selection_Sort Sort_obj = new Selection_Sort(arr_rand);

        Sort_obj.Sort();
    }
}
