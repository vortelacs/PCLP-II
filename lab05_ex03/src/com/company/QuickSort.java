package com.company;

public class QuickSort {


    private static int partition(Consumer[] arr, int down, int up) {

        int i, bigger = down - 1;
        Consumer temp;

        for (i = down; i < up; i++) {

            if (arr[i].get_Factura() > arr[up].get_Factura()) {
                bigger++;
                temp = arr[i];
                arr[i] = arr[bigger];
                arr[bigger] = temp;

            }
        }
        temp = arr[up];
        arr[up] = arr[bigger + 1];
        arr[bigger + 1] = temp;

        return bigger + 1;
    }


    private static void Quick(Consumer[] arr, int down, int up) {
        int pivot;

        if (down < up) {

            pivot = partition(arr, down, up);

            Quick(arr, down, pivot - 1);
            Quick(arr, pivot + 1, up);

        }
    }

    public static Consumer[] Sort(Consumer[] arr) {

        Quick(arr, 0, arr.length - 1);

        return arr;
    }
}
