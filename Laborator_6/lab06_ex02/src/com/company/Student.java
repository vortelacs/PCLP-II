package com.company;

import java.io.Serializable;

public class Student implements java.io.Serializable {

    private String nume;
    private String prenume;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    private int grupa;



    public void setData(String nume, String prenume, int grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
    }

    public String toString(){
        return nume + "\n" + prenume + "\n" + grupa + "\n";
    }
}
