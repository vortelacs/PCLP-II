package com.company;

import java.util.Scanner;

public class Main {


    static Scanner in = new Scanner(System.in);

    static void adauga() {

        System.out.print("Dati cuvantul noului nod: ");
        String data = in.next();
        Node nod;

        if (Node.getSize() == 0) {

            nod = new Node(data, null, null, null);
            Node.setLast(nod);
            Node.setFirst(nod);
            return;
        }

        nod = Node.getLast();

        Node new_node = new Node(data, null, nod, Node.getFirst());
        Node.setLast(new_node);
        nod.setNext(new_node);
        Node.getFirst().setPrevious(new_node);
    }


    static void printeaza() {

        if (Node.getSize() != 0)
            for (Node n = Node.getFirst(); n != null; n = n.getNext()) System.out.println(n.getData());
        else System.out.println("Lista nu contine cuvinte");

    }



    /*
        Am implementat ShakerSort in loc de Bubble Sort ca sa se observe ca e o lista dublu inlantuita,
        astfel sa se faca parcurgerea in ambele sensuri

        In comentariul de la sfarsitul fisierului dat este varianta Bubble Sort a functiei de sortare
    */

    static void sorteaza() {
        boolean sorted;
        Node current;
        int i, first = 0, last = Node.getSize();
        String temp;

        do {
            sorted = true;
            current = Node.getFirst();

            for (i = first; i < last - 1; i++) {

                if (current.getData().compareTo(current.getNext().getData()) > 0) {

                    temp = current.getData();
                    current.setData(current.getNext().getData());
                    current.getNext().setData(temp);
                    sorted = false;
                }
                current = current.getNext();

            }
            for (i = first; i < last - 1; i++) {

                if (current.getData().compareTo(current.getPrevious().getData()) < 0) {

                    temp = current.getData();
                    current.setData(current.getPrevious().getData());
                    current.getPrevious().setData(temp);
                    sorted = false;
                }
                current = current.getPrevious();
            }
            first++;
            last--;

        } while (!sorted);

    }


    public static void main(String[] args) {

        System.out.print("Dati numarul de noduri: ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) adauga();

        printeaza();
        System.out.println();
        System.out.println();
        sorteaza();
        printeaza();


    }
}


    /*     !! BUBBLE SORT !!

        static void sorteaza() {
        boolean sorted;
        Node current;
        int i, size= Node.getSize();
        String temp;

        do {
            sorted = true;
            current = Node.getFirst();

            for (i = first; i < size - 1; i++) {

                if (current.getData().compareTo(current.getNext().getData()) > 0) {

                    temp = current.getData();
                    current.setData(current.getNext().getData());
                    current.getNext().setData(temp);
                    sorted = false;
                }
                current = current.getNext();
            }
            size--;
        } while (!sorted);

    }    */