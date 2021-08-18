package com.upc.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(); // String [] nombres = new String[10];
        nombres.add("Carlos");
        nombres.add("Carmen");
        nombres.add("Luis");
        for(String p:nombres){
            System.out.println(p);
        }

    }
}
