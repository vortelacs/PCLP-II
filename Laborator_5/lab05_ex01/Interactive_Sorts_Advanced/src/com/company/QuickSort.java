package com.company;

public class QuickSort {


    private static int partition(int[] arr, int down, int up) {

        int i, small = down - 1, temp;

        for (i = down; i < up; i++) {

            if (arr[i] < arr[up]) {
                small++;
                temp = arr[i];
                arr[i] = arr[small];
                arr[small] = temp;

            }
        }
        temp = arr[up];
        arr[up] = arr[small + 1];
        arr[small + 1] = temp;

        return small + 1;
    }


    private static void Quick(int[] arr, int down, int up) {
        int pivot;

        if (down < up) {

            pivot = partition(arr, down, up);

            Quick(arr, down, pivot - 1);
            Quick(arr, pivot + 1, up);

        }
    }

    public static int[] Sort(int[] arr) {

        Quick(arr, 0, arr.length - 1);

        return arr;
    }
}
