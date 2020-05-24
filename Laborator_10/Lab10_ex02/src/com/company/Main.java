package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean cont;

        LinkedList<Monom> polinom_1 = new LinkedList<>();
        LinkedList<Monom> polinom_2 = new LinkedList<>();
        LinkedList<Monom> suma = new LinkedList<>();
        LinkedList<Monom> produs = new LinkedList<>();

        System.out.print("Dati numarul de monoame din polinomul 1: ");
        int size_1 = in.nextInt();

        System.out.print("Dati numarul de monoame din polinomul 2: ");
        int size_2 = in.nextInt();

        System.out.println("Dati elementele din polinomul 1: ");
        for (int i = 0; i < size_1; i++) {
            System.out.print("Coeficient: ");
            int coef = in.nextInt();
            System.out.print("Exponent: ");
            int exp = in.nextInt();
            polinom_1.add(new Monom(coef, exp));
        }

        System.out.println("Dati elementele din polinomul 2: ");
        for (int i = 0; i < size_2; i++) {
            System.out.print("Coeficient: ");
            int coef = in.nextInt();
            System.out.print("Exponent: ");
            int exp = in.nextInt();
            polinom_2.add(new Monom(coef, exp));
        }


        for (Monom m : polinom_1) {
            cont = false;
            for (Monom n : polinom_2) {

                if(m.getExponent() == n.getExponent()){

                    int cSuma = m.getCoeficient() +n.getCoeficient();
                    suma.add(new Monom(cSuma , m.getExponent()));

                    int cProdus = m.getCoeficient() *n.getCoeficient();
                    produs.add(new Monom(cProdus , m.getExponent()));


                    cont = true;
                    break;
                }
            }
            if(!cont) {
                suma.add(m);
                produs.add(m);
            }

        }

        for (Monom n : polinom_2){
            cont = false;

            for (Monom m : polinom_1) if(m.getExponent() == n.getExponent()){
                cont = true;
                break;
            }

            if(!cont) {
                suma.add(n);
                produs.add(n);
            }

        }


        suma.sort(Comparator.comparing(Monom:: getExponent).reversed());
        produs.sort(Comparator.comparing(Monom:: getExponent).reversed());

        System.out.println(suma);
        System.out.println(produs);


    }
}
