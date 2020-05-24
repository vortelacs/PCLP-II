package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dati numarul de studenti: ");
        int total = in.nextInt();

        LinkedList<Student> students = new LinkedList<>();

        for (int i = 0; i < total; i++) {
            System.out.print("Nume: ");
            String nume = in.next();
            System.out.print("Medie: ");
            int medie = in.nextInt();
            System.out.print("Optiune(1, 2 ori 3): ");
            int optiune = in.nextInt();
            if (optiune < 1 || optiune > 3) {
                System.out.println("Optiunea este invalida");
                i = i - 1;
                continue;
            }
            students.add(new Student(nume, medie, optiune));
        }

        LinkedList<Student> studenti_1 = new LinkedList<>();
        LinkedList<Student> studenti_2 = new LinkedList<>();
        LinkedList<Student> studenti_3 = new LinkedList<>();

        for (int i = 0; i < total; i++) {
            switch (students.get(i).getOptiune()) {
                case 1:
                    studenti_1.add(students.get(i));
                    break;
                case 2:
                    studenti_2.add(students.get(i));
                    break;
                case 3:
                    studenti_3.add(students.get(i));
                    break;

            }
        }
        System.out.println();
        for (Student s : students) System.out.print(s);
        System.out.println();

        studenti_1.sort(Comparator.comparing(Student::getMedie).reversed());
        studenti_2.sort(Comparator.comparing(Student::getMedie).reversed());
        studenti_3.sort(Comparator.comparing(Student::getMedie).reversed());

        System.out.print("Dati numarul de locuri la fiecare optiune: ");
        System.out.print("Locuri la prima optiune: ");
        int locuri_1 = in.nextInt();

         System.out.print("Locuri la a doua  optiune: ");
        int locuri_2 = in.nextInt();

         System.out.print("Locuri la a treia optiune: ");
        int locuri_3 = in.nextInt();

        System.out.println();
        for (int i = 0; i < locuri_1; i++) System.out.println(studenti_1.get(i));

        for (int i = 0; i < locuri_2; i++) System.out.println(studenti_2.get(i));

        for (int i = 0; i < locuri_3; i++) System.out.println(studenti_3.get(i));

    }
}
