package com.company;

public class HeapSort {
    private int[] arr;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void build_max_Heap(int size) {
        int i, temp;

        for (i = size; i > 0; i--) {

            if (arr[i] > arr[i / 2]) {

                temp = arr[i];
                arr[i] = arr[i / 2];
                arr[i / 2] = temp;
            }
        }
    }

    public int[] Sort() {
        int i, temp;

        for (i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

        for (i = arr.length - 1; i > 0; i--) {

            build_max_Heap(i);

            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

        }

        return arr;
    }
}

