package com.company;

public class Monom {

    private int coeficient;
    private final int exponent;

    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

    public Monom(int coeficient, int exponent) {
        this.coeficient = coeficient;
        this.exponent = exponent;
    }

    public int getCoeficient() {
        return coeficient;
    }

    public int getExponent() {
        return exponent;
    }

    @Override
    public String toString() {
        return coeficient + "*x^"+exponent;
    }


}
