package com.company;

public class Binary_Insertion_Sort {
    int[] arr;

    public Binary_Insertion_Sort(int[] arr) {
        this.arr = arr;
    }

    public int Binary_Search_Place(int indexToSort) {
        int  st, dr, place;

        if (arr[indexToSort] >= arr[indexToSort - 1]) return indexToSort;
        if (arr[indexToSort] <= arr[0]) return 0;

        place = indexToSort / 2;
        st = 0;
        dr = indexToSort;

        while (true) {

            if (arr[indexToSort] == arr[place])
                return place;
            else if (arr[indexToSort] > arr[place]) {

                if (arr[indexToSort] <= arr[place + 1])
                    return place + 1;
                else st = place;

            } else if (arr[indexToSort] < arr[place]) {
                if (arr[indexToSort] >= arr[place - 1])
                    return place;
                else dr = place;

            }
            place = (dr + st) / 2;
        }
    }

    public void Sort() {

        int temp_save, j, i, place;

        for (i = 1; i < arr.length; i++) {

            place = Binary_Search_Place(i);

            if (place != i) {
                temp_save = arr[i];
                for (j = i; j > place; j--) arr[j] = arr[j - 1];
                arr[place] = temp_save;
            }

        }
        for (i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }
}
