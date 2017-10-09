package com.company.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    static  String s = "will be okey soon!";
    static String[][] m = new String[2][4];
    static Scanner scanner;

    public static void main(String[] args) throws IOException {

        openFile();
        readFile();
        out();

    }

    private static void out() {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }


    }

    private static void readFile() {

        while (scanner.hasNext()){
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {


                    if (scanner.hasNext() == false) {
                        m[i][j] = "0";
                    } else {
                        m[i][j] = scanner.next();
                    }

                }
            }
        }
        scanner.close();

    }


    private static void openFile() throws FileNotFoundException {

        scanner = new Scanner(new File("src//1.txt"));



    }


}
