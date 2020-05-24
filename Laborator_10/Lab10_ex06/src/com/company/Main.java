package com.company;

import java.util.Scanner;

public class Main {


    static Scanner in = new Scanner(System.in);

    static void showMenu() {

        System.out.println("1. Adaugati un element in lista");
        System.out.println("2. Vizualizati lista");
        System.out.println("3. Vizualizati lista invers");
        System.out.println("4. Cauta un nod");
        System.out.println("5. Sterge un nod");
        System.out.println("9. Iesiti din program");

    }


    static void adauga() {

        System.out.print("Dati valoarea noului nod: ");
        int data = in.nextInt();
        Node nod = Node.getLast();

        Node new_node = new Node(data, Node.getFirst(), nod, Node.getFirst());
        Node.setLast(new_node);
        nod.setNext(new_node);
        Node.getFirst().setPrevious(new_node);
    }




    static void printeaza() {

        Node nod = Node.getFirst();

        for (int i = 1; i <= Node.getSize(); i++) {

            System.out.print(nod.getData() + " ");
            nod = nod.getNext();
        }
    }




    static void printeaza_invers() {

        Node nod = Node.getLast();

        for (int i = Node.getSize(); i > 0; i--) {
            System.out.print(nod.getData() + " ");
            nod = nod.getPrevious();
        }
    }



    static int cauta() {

        System.out.print("Dati valoarea nodului ce cautati: ");
        int data = in.nextInt();
        int i;
        Node nod = Node.getFirst();

        for (i = 1; i <= Node.getSize(); i++) {
            if (data == nod.getData()) return i;

            nod = nod.getNext();
        }
        return -1;
    }



    static void sterge() {

        System.out.print("Dati nodul ce vreti sa stergeti: ");
        int i, pos = in.nextInt();
        if (pos > Node.getSize()) {
            System.out.println("Nod inexistent!");
            return;
        }

        Node nod = Node.getFirst();
        Node nod_prev;

        for (i = 1; i < pos; i++) nod = nod.getNext();

        nod_prev = nod.getPrevious();
        nod_prev.setNext(nod.getNext());
        nod.getNext().setPrevious(nod_prev);
        if (pos == 1) Node.setFirst(nod.getNext());
        if (pos == Node.getSize()) Node.setLast(nod_prev);
        Node.lowerSize();

    }



    public static void main(String[] args) {


        int alegere;
        System.out.print("Dati primul nod: ");
        int data = in.nextInt();
        Node nod = new Node(data, null, null, null);
        Node.setFirst(nod);
        nod.setPrevious(nod);
        Node.setLast(nod);

        showMenu();

        do {

            System.out.print("Ce vreti sa faceti: ");
            alegere = in.nextInt();

            switch (alegere) {
                case 1:
                    adauga();
                    break;

                case 2:
                    printeaza();
                    System.out.println();
                    break;

                case 3:
                    printeaza_invers();
                    System.out.println();
                    break;

                case 4:
                    int pozitie = cauta();
                    if (pozitie > 0)
                        System.out.println("Nodul se afla pe pozitia " + (pozitie));
                    else System.out.println("Nodul nu a fost gasit sau a fost sters");
                    break;
                case 5:
                    sterge();
                    break;

                case 9:
                    System.out.println("La revedere!");
                    break;

                default:
                    System.out.println("Alegere invalida!");
                    showMenu();
                    break;

            }
        } while (alegere != 9);
    }
}