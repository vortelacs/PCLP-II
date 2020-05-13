package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileInvert {

    static void printList(LinkedList<String> lista, FileWriter out, int inx) throws IOException {

        if(inx<0) return;
        out.write(lista.get(inx) + "\n");

        printList(lista, out, inx-1);

    }

    public static void main(String[] args) throws IOException {


        File filein = new File(System.getProperty("user.dir") + "\\text1.txt");
        File fileout = new File(System.getProperty("user.dir") + "\\text2.txt");

        Scanner in = new Scanner(filein);
        FileWriter out = new FileWriter(fileout);

        LinkedList<String> lista = new LinkedList<>();

        while(in.hasNextLine()){

            lista.add(in.nextLine());
        }


        printList(lista, out, lista.size()-1);

        out.close();

    }

}
