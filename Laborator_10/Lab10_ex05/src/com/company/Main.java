
package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    static void interschimba(LinkedList<Integer> lista) {

        System.out.println("Dati primul element");
        int element_1 = in.nextInt();
        if (!lista.contains(element_1)) {
            System.out.println("Elementul nu putut fi gasit!");
            return;
        }
        System.out.println("Dati al doilea element");

        int element_2 = in.nextInt();
        if (!lista.contains(element_2)) {
            System.out.println("Elementul nu putut fi gasit!");
            return;
        }

        Collections.swap(lista, lista.indexOf(element_1), lista.indexOf(element_2));

    }

    static int cauta(LinkedList<Integer> lista) {

        System.out.println("Dati elementul ce doriti sa cautati");
        int element = in.nextInt();

        if (!lista.contains(element)) return -1;


        return lista.indexOf(element);

    }

    static void sterge(LinkedList<Integer> lista) {
        System.out.println("Dati elementul ce doriti sa stergeti");
        int element = in.nextInt();

        if (!lista.contains(element)) {

            System.out.println("Elementul dat nu a fost gasit!");
            return;
        }

        lista.remove((Integer) element);
        System.out.println("Elementul a fost sters");


    }


    static void showMenu() {


        System.out.println("Alegeti ce vreti sa faceti: ");
        System.out.println("1. Adaugati un nod");
        System.out.println("2. Vizualizati lista ");
        System.out.println("3. Vizualizati lista in odine inversa");
        System.out.println("4. Sa gasiti un nod");
        System.out.println("5. Sa stergeti un nod");
        System.out.println("6. Sa schimbati doua noduri intre ele");
        System.out.println("9. Iesire din program");

    }

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        int alegere;

        LinkedList<Integer> lista = new LinkedList<>();
        showMenu();

        do {

            System.out.print("Ce vreti sa faceti: ");
            alegere = in.nextInt();

            switch (alegere) {
                case 1:
                    System.out.print("Dati elementul: ");
                    lista.add(in.nextInt());
                    break;

                case 2:
                    for (int i : lista) System.out.print(i + " ");
                    System.out.println();
                    break;

                case 3:
                    for (int i = lista.size() - 1; i >= 0; i--) System.out.print(lista.get(i) + " ");
                    System.out.println();
                    break;
                case 4:
                    int pozitie = cauta(lista);
                    if(pozitie == -1) {
                        System.out.println("Elementul nu a putut fi gasit");
                        continue;
                    }
                    System.out.println("Elementul se afla pe pozitia " + (pozitie+1));
                    break;
                case 5:
                    sterge(lista);
                    break;
                case 6:
                    interschimba(lista);
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Alegere invalida!");
                    showMenu();
                    break;

            }
        } while (alegere != 9);
    }
}