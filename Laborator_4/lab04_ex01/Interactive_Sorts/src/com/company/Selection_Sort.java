package com.company;

public class Selection_Sort {

    public static int[] Sort(int[] arr) {
        int index, temp, j, i;

        for (i = 0; i < arr.length; i++) {
            index = i;

            for (j = i; j < arr.length; j++) if (arr[j] < arr[index]) index = j;

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
