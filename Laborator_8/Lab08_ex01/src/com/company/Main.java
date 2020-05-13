package com.company;

import java.util.Scanner;

public class Main {

    static void printPartition(int n){

        int[] parts = new int[n];
        int lastI = 0;
        int remaining;
        parts[lastI] = n;

        while(true){



            for(int i =0; i<=lastI;i++) System.out.print(parts[i] + " ");
            System.out.println();

            remaining=0;
            while(lastI>=0 && parts[lastI] == 1){
                remaining+=parts[lastI];
                lastI--;
            }

            if(lastI < 0) break;

            parts[lastI]--;
            remaining++;


            while(parts[lastI] < remaining){

                parts[lastI+1]= parts[lastI];
                remaining -=parts[lastI];
                lastI++;
            }

            parts[lastI+1] =remaining;
            lastI++;


        }

    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Dati numarul ce doriti sa il partitionati: ");
        int numar = in.nextInt();
        printPartition(numar);


    }
}
