package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number, i, j, save_min_i = 0, save_min_j = 1, save_max_i = 0, save_max_j = 1;
        float max_distance = -1, min_distance = 0, current_distance;
        Scanner in = new Scanner(System.in);

        System.out.print("Give the number of planets:");
        number = in.nextInt();

        Planet[] planets = new Planet[number];
        for (i = 0; i < number; i++) planets[i] = new Planet();


        System.out.println("\nGive the information about planets:");

        for (i = 0; i < number; i++) {
            System.out.println("\nGive for the planet " + (i + 1) + " :");

            System.out.print("Name: ");
            planets[i].set_Name(in.next());

            System.out.print("X coordinate: ");
            planets[i].set_X(in.nextInt());

            System.out.print("Y coordinate: ");
            planets[i].set_Y(in.nextInt());

            System.out.print("Z coordinate: ");
            planets[i].set_Z(in.nextInt());
        }

        for (i = 0; i < planets.length; i++) {

            for (j = i + 1; j < planets.length; j++) {

                int x_dif = planets[i].get_X() - planets[j].get_X();
                int y_dif = planets[i].get_Y() - planets[j].get_Y();
                int z_dif = planets[i].get_Z() - planets[j].get_Z();


                current_distance = (float) Math.sqrt(Math.pow(x_dif, 2) + Math.pow(y_dif, 2) + Math.pow(z_dif, 2));
                if (max_distance < current_distance) {
                    max_distance = current_distance;
                    save_max_i = i;
                    save_max_j = j;
                }
                if (i == 0) {
                    if (j == 1) {
                        min_distance = current_distance;
                        save_min_i = i;
                        save_min_j = j;
                    }
                } else if (min_distance > current_distance) {
                    min_distance = current_distance;
                    save_min_i = i;
                    save_min_j = j;
                }
            }
        }

        System.out.println("\nThe farthest two planets are :");
        System.out.println("    " + planets[save_max_i].get_Name() + "  and  " + planets[save_max_j].get_Name());
        System.out.format("The distance between them is  %.3f\n", max_distance);

        System.out.println("\nThe nearest two planets are :");
        System.out.println("    " + planets[save_min_i].get_Name() + "  and  " + planets[save_min_j].get_Name());
        System.out.format("The distance between them is  %.3f", min_distance);
    }
}
