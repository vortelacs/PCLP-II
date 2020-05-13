package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class ListInvert {

    static void printLista(LinkedList <Integer> lista, int inx){

        if(inx<0) return;

        System.out.print(lista.get(inx) + " ");
        printLista(lista, inx-1);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dati numarul de elemente:");
        int size = in.nextInt();

        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i < size; i++){
            System.out.println("Dati elementul: "+(i+1));

            lista.add(in.nextInt());
        }

        printLista(lista, size-1);

    }

}


