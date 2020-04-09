package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int i;
        float total = 0;
        File in, out;
        in = new File("C:\\Users\\vorte\\Desktop\\EUGEN acasa\\JAVA\\lab06_ex01\\src\\com\\company\\examene.txt");
        out = new File("C:\\Users\\vorte\\Desktop\\EUGEN acasa\\JAVA\\lab06_ex01\\src\\com\\company\\media.txt");
        BufferedReader bRead = new BufferedReader(new FileReader(in));
        Writer myWriter = new FileWriter(out);

        for (i = 0; i < 6; i++) total += Integer.parseInt(bRead.readLine());

        myWriter.write(total/6+"");
        myWriter.close();
        System.out.printf("Media notelor obtinute este: %.2f", total / 6);
    }
}
