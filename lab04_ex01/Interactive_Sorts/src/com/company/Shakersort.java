package com.company;

public class Shakersort {

    public static int[] Sort(int[] arr) {

        int i, temp;
        int up = arr.length;
        int down = 0;
        boolean ok;

        do {
            ok = true;
            for (i = down; i < up - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    ok = false;
                }
            }

            up--;
            if (ok) break;

            for (i = up - 1; i >= down; i--) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    ok = false;
                }
            }
            down++;

        } while (!ok);


        return arr;
    }

}

