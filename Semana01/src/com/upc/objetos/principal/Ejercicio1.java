package com.upc.objetos.principal;

import com.upc.objetos.Alumno;

public class Ejercicio1 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(1001,"Pepito",18,20);
        System.out.println(alumno1.calcularPromedio());
        Alumno alumno2 = new Alumno(1002,"Ana", 20, 17);
        double promedio;
        promedio = alumno2.calcularPromedio();
        System.out.println(promedio);
        Alumno alumno3 = new Alumno();
        alumno3.setCodigo(1003);
        alumno3.setNombre("Juan");
        alumno3.setNota1(16);
        alumno3.setNota2(18);
        System.out.println(alumno3.calcularPromedio());

    }
}
