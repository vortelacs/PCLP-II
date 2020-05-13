package com.company;

public class Planet {
    private int X;
    private int Y;
    private int Z;
    private String name;

    public void set_Name(String str) {
        name = str;
    }

    public void set_X(int x) {
        X = x;
    }

    public void set_Y(int y) {
        Y = y;
    }

    public void set_Z(int z) {
        Z = z;
    }

    public String get_Name() {
        return name;
    }

    public int get_X() {
        return X;
    }

    public int get_Y() {
        return Y;
    }

    public int get_Z() {
        return Z;
    }

}
