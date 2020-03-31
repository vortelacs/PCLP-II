package com.company;

public class Shakersort {
    int[] arr;

    public Shakersort(int[] arr) {
        this.arr = arr;
    }

    public void Sort() {

        int i, temp;
        int up=arr.length;
        int down = 0;
        boolean ok;

        do {
            ok=true;
            for (i = down; i < up-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    ok=false;
                }
            }

            up--;
            if(ok==true) break;

            for (i = up-1; i >= down; i--) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i+1] = temp;
                    ok=false;
                }
            }
        down++;

        } while (ok==false);



        for (i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }

}

