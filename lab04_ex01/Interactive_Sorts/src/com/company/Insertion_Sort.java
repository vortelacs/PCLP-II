package com.company;

public class Insertion_Sort {

    public static int[] Sort(int[] arr) {

        int index, temp_save, j, i;

        for (i = 1; i < arr.length; i++) {
            index = i;

            for (j = i - 1; j >= 0; j--) {
                if (arr[i] <= arr[j]) index = j;

            }

            if (index != i) {
                temp_save = arr[i];
                for (j = i; j > index; j--) arr[j] = arr[j - 1];
                arr[index] = temp_save;
            }

        }
        return arr;
    }

}

