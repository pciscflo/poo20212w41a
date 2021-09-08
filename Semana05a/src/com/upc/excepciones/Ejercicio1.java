package com.upc.excepciones;

public class Ejercicio1 {

    public static void main(String args[]) {
        try {
            Utilitario.leerFile("C:/Instaladores/Demo5.txt");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fin de Main");
    }
}