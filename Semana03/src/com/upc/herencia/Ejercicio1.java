package com.upc.herencia;

public class Ejercicio1 {
    public static void main(String[] args) {
        ProfesorTC profesorTC1 = new ProfesorTC("88888888","Pepe",3,1000,0.12);
        ProfesorTP profesorTP1 = new ProfesorTP("99999999","Jose",2,40,40);
        System.out.println("Sueldo P. Completo:" + profesorTC1.calcularSueldo());
        System.out.println("Sueldo P. Parcial:" + profesorTP1.calcularSueldo());



    }
}
