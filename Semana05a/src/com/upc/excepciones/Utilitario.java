package com.upc.excepciones;

import java.io.FileInputStream;
import java.util.Scanner;

public class Utilitario {
    public static void leerFile(String path) {
        FileInputStream fis = new FileInputStream(path);
        Scanner sc = new Scanner(fis);    //file to be scanned
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());      //returns the line that was skipped
        }
        sc.close();
    }
}
