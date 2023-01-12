package it.develhope.exercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Ho creato un while che chieda all'user di inserire un comando e che si fermi quando l'utente inserisce
         * stop.
         */
        String i = " ";
        while(!i.equals("stop")){
            System.out.println("Please enter a command: ");
            /**
             * Ho creato un scanner e ho dato il nextLine a i.
             */
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextLine();
        }
    }
}
