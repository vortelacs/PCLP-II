package com.company;

public class HeapSort {


    private static void build_max_Heap(int size, int[] arr) {
        int i, temp;

        for (i = size; i > 0; i--) {

            if (arr[i] > arr[i / 2]) {

                temp = arr[i];
                arr[i] = arr[i / 2];
                arr[i / 2] = temp;
            }
        }
    }

    public static int[] Sort(int[] arr) {
        int i, temp;


        for (i = arr.length - 1; i > 0; i--) {

            build_max_Heap(i, arr);

            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

        }

        return arr;
    }
}

