package com.company;

public class ShellSort {


    public static int[] Sort(int[] arr) {

        int index, temp_save, j, i, gap;

        for (gap = arr.length / 2; gap > 0; gap /= 2) {

            for (i = gap; i < arr.length; i++) {

                index = i;

                for (j = i; j >= 0; j -= gap) {
                    if (arr[i] <= arr[j]) index = j;

                }

                if (index != i) {
                    temp_save = arr[i];
                    for (j = i; j > index; j -= gap) arr[j] = arr[j - gap];
                    arr[index] = temp_save;
                }

            }

        }
        return arr;
    }
}
