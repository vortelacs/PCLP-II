package com.company;

import java.util.Scanner;

public class Main {

    static int lastOne(int[] afis) {

        for (int k = afis.length - 1; k >= 0; k--) {
            if (afis[k] == 1) return k;
        }
        return 0;
    }

    static void afisare(char[] set, int[] afis) {

        for (int i = 0; i < afis.length; i++) {
            if (afis[i] == 1) System.out.print(set[i]);
        }
        System.out.println();

    }

    static void reset(int[] afis, int start) {

        int total = 0;
        for (int i = start; i < afis.length; i++) {
            if (afis[i] == 1) {
                total++;
                afis[i] = 0;
            }
        }

        for (int j = 0; j < total; j++) afis[j + start] = 1;
    }


    static void combinari(char[] set, int[] afis, int currentI) {

        int j;
        afisare(set, afis);

        if (currentI < afis.length - 1) {
            afis[currentI] = 0;
            afis[currentI + 1] = 1;
            currentI++;

        } else {
            for (j = currentI - 1; j >= 0; j--) {
                if (afis[j] == 1 && afis[j + 1] == 0) {


                    afis[j] = 0;
                    afis[j + 1] = 1;

                    reset(afis, j + 2);
                    currentI = lastOne(afis);
                    break;
                }

            }
            if (j == -1) return;

        }
        combinari(set, afis, currentI);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.print("Dati numarul de elemente: ");
        int n = in.nextInt();

        System.out.print("Dati numarul de elemente luate in combinatii: ");
        int m = in.nextInt();

        int[] current = new int[n];
        for (i = 0; i < m; i++) {
            current[i] = 1;
        }

        char[] set = new char[n];

        System.out.println("Dati elementele: ");
        for (i = 0; i < n; i++) set[i] = in.next().charAt(0);


        combinari(set, current, m - 1);

    }
}

