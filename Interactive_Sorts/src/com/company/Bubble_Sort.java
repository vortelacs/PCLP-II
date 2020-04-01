package com.company;

public class Bubble_Sort {


    public static int[] Sort(int[] arr) {
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

        return arr;
    }
}