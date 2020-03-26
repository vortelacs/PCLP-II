package com.company;

public class Insertion_Sort<i> {
    int[] arr;

    public Insertion_Sort(int[] arr) {
        this.arr = arr;
    }

    public void Sort() {

        int index, temp_save, j, i;

        for (i = 1; i < arr.length; i++) {
            index = i;

            for (j = i-1; j >= 0; j--) {
                if (arr[i] <= arr[j]) index=j;

            }

        if(index!=i){
            temp_save = arr[i];
            for(j=i;j>index;j--) arr[j] = arr[j-1];
            arr[index]=temp_save;
        }

        }
        for (i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }
}

