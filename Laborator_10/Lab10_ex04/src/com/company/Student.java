package com.company;


public class Student {

    private final String nume;
    private final int medie;
    private final int optiune;

    public Student(String nume, int medie, int optiune) {
        this.medie = medie;
        this.nume = nume;
        this.optiune = optiune;
    }

    public int getMedie() {
        return medie;
    }

    public String getNume() {
        return nume;
    }

    public int getOptiune() {
        return optiune;
    }

    @Override
    public String toString() {
        return "Numele " + nume +
                ", media=" + medie +
                ", optiunea=" + optiune + "\n";
    }
}
