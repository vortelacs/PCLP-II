package com.company;

public class Main {

    static void printLab(int[][] lab) {

        for (int[] ints : lab) {

            for (int j = 0; j < lab[0].length; j++)
                System.out.print(ints[j] + " ");

            System.out.println();
        }
        System.out.println("\n");

    }

    static boolean isWay(int[][] lab, int x, int y){

        if(lab[x][y] != 0 && lab[x][y] !=3) return true;
        else return false;

    }

    static boolean isChecked(int[][] lab, int x, int y){

        if(lab[x][y] != 2) return true;
        else return false;

    }



    static void solving(int[][] lab) {

        int nX = 1; // current X
        int nY = 1; // current Y
        int lastX = 1;
        int lastY = 1;


        while (true) {

            lab[nX][nY] = 2;

            printLab(lab);


            



            if ( isWay( lab, nX + 1, nY) ) {
                if(nX==lastX) lab[nX][nY] =3;
                lastX = nX;
                nX++;
            } else if ( isWay(lab, nX , nY+1) ) {
                if(nY==lastY) lab[nX][nY] =3;
                lastY = nY;
                nY++;
            } else if( isWay(lab, nX-1 , nY) ) {
                if(nX==lastX) lab[nX][nY] =3;
                lastX = nX;
                nX--;
            }else if( isWay(lab, nX , nY-1) ) {
                if(nY==lastY) lab[nX][nY] =3;
                lastY = nY;
                nY--;
            }



            if(lab[nY][nX] ==10){
                System.out.println("Iesire gasita!!!");
                break;
            }
        }


    }


    public static void main(String[] args) {

        //Labirintul facut din tablou bidimensional
        //1- patratele pe care poti calca
        //0- pereti
        //2- patratele care ai calcat deja
        //3- drum verificat incorect
        //10- iesire
        //4- cale corecta(raspuns final)

        int[][] labirint = {
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 10, 0},
                {0, 0, 1, 0, 1, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0},};

        printLab(labirint);
        System.out.println();
        solving(labirint);


    }
}
