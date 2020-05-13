package com.company;

public class Bubble_Sort {

    int[] arr;

    public Bubble_Sort(int[] arr) {

        this.arr = arr;
    }

    public void Sort() {
        int i, temp, ok;
        int j = arr.length - 1;

        do {
            ok = 1;

            for (i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    ok = 0;
                }
            }
            j--;
        } while (ok == 0);

        for (i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }
}