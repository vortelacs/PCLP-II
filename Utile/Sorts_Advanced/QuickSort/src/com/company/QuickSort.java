package com.company;

public class QuickSort {

    int[] arr;

    public QuickSort(int[] arr) {

        this.arr = arr;
    }


    private int partition(int down, int up) {

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


    private void Quick(int down, int up) {
        int pivot;

        if (down < up) {

            pivot = partition(down, up);

            Quick(down, pivot - 1);
            Quick(pivot + 1, up);

        }
    }

    public void Sort() {

        int i;

        for (i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

        Quick(0, arr.length - 1);


        for (i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
