package com.company;

public class ShellSort {

    int[] arr;

    public ShellSort(int[] arr) {

        this.arr = arr;
    }

    public void Sort() {

        int index, temp_save, j, i, gap;

        for (gap = arr.length / 2; gap > 0; gap /= 2) {

            for (i = gap; i < arr.length; i ++) {

                index=i;

                for (j = i; j >= 0; j-=gap) {
                    if (arr[i] <= arr[j]) index = j;

                }

                if (index != i) {
                    temp_save = arr[i];
                    for (j = i; j > index; j-=gap) arr[j] = arr[j - gap];
                    arr[index] = temp_save;
                }

            }

        }
        for (i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }
}
