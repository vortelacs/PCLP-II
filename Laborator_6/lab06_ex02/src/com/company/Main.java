package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File in = new File("src\\com\\company\\an.txt");
        File a = new File("src\\com\\company\\a.txt");
        File b = new File("src\\com\\company\\b.txt");
        //    File out = new File("src\\com\\company\\an_sort.txt");
        //a.createNewFile();
        //b.createNewFile();

        int size = 0, i, j;
        Student studtmp1 = new Student();
        Student studtmp2 = new Student();

        Scanner input = new Scanner(in);

        FileWriter intmp = new FileWriter(in);
        FileWriter aOut = new FileWriter(a);
        FileWriter bOut = new FileWriter(b);
        //    FileWriter fOut = new FileWriter(out);






        while (input.hasNextLine()) { // check number of lines in file
            size++;
            input.nextLine();
        }
        size /= 3;
        input.close();







        //for (i = 1; i < size / 2; i *= 2) {
            input = new Scanner(in);
            Scanner aIn = new Scanner(a);
            Scanner bIn = new Scanner(b);


            while (input.hasNextLine()) {
         //       for (j = 0; j < i; j++) {

                    if (input.hasNextLine()) {
                        studtmp1.setData(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()));
                        aOut.write(studtmp1.toString());
                    } else break;

         //       }
         //       for (j = 0; j < i; j++) {
                    if (input.hasNextLine()) {
                        studtmp1.setData(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()));
                        bOut.write(studtmp1.toString());
                    } else break;
                }
          //  }

            aOut.close();
            bOut.close();


            for (j = 0; j < size / 2; j++) {
                studtmp1.setData(aIn.nextLine(), aIn.nextLine(), Integer.parseInt(aIn.nextLine()));
                studtmp2.setData(bIn.nextLine(), bIn.nextLine(), Integer.parseInt(bIn.nextLine()));

                if (studtmp1.getNume().compareTo(studtmp2.getNume()) < 0) {
                    intmp.write(studtmp1.toString());
                    intmp.write(studtmp2.toString());

                } else if (studtmp1.getNume().compareTo(studtmp2.getNume()) > 0) {
                    intmp.write(studtmp2.toString());
                    intmp.write(studtmp1.toString());

                } else if(studtmp1.getPrenume().compareTo(studtmp2.getPrenume()) < 0){
                    intmp.write(studtmp1.toString());
                    intmp.write(studtmp2.toString());

                }else{
                    intmp.write(studtmp2.toString());
                    intmp.write(studtmp1.toString());
                }


            }


            aIn.close();
            bIn.close();
            input.close();

      //  }


        aOut.close();
        bOut.close();


        System.out.println(size);

    }
}
