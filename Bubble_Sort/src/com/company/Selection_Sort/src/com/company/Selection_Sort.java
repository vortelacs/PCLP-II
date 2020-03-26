package com.company;

public class Selection_Sort {
    int[] arr;

    public Selection_Sort(int[] arr) {
        this.arr = arr;
    }

    public void Sort() {
        int index, temp, j, i;

        for (i = 0; i < arr.length; i++) {
            index = i;

            for (j = i; j < arr.length; j++) if (arr[j] < arr[index]) index = j;

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }
}
