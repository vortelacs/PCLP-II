package com.company;

public class Comparation {

    private static char[] name, guess;

    public static int mn(String cname, String cguess) {

        name = cname.toCharArray();
        guess = cguess.toCharArray();

        if (name.length == guess.length) {
            if (compare(name.length - 1) == 0) return 0;
            else return 1;
        } else return 0;
    }

    public static int compare(int a) {
        if (a >= 0) {
            if (name[a] == guess[a] && compare(a - 1) == 1) return 1;
            else return 0;
        } else return 1;
    }

}