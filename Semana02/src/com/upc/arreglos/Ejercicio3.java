package com.upc.arreglos;

import java.util.List;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("AA1", "Toyota", "Yaris", 15000, (byte)4 );
        Auto auto2 = new Auto("AA5", "Suzuki", "Swift", 14000, (byte)2 );
        Empresa empresa = new Empresa("Coca Cola");
        empresa.registrar(auto1);
        empresa.registrar(auto2);
        System.out.println("Promedio de Precios: " + empresa.obtenerPromedio());
        List<Auto> autos;
        autos = empresa.getAutos();
        for (Auto p: autos){
            System.out.println(p.getCodigo() +"   " + p.getModelo()+ "  "+ p.calcularPrecioFinal());
        }
        System.out.println("------------------");
        Auto a;
        a = empresa.obtenerDatosMasCaro();
        System.out.println("AUTO caro:" + a.getCodigo() + "  " + a.getMarca()+ "  " + a.calcularPrecioFinal());
        System.out.println("*****************");
        Random r = new Random();
        int valorDado = r.nextInt(6) + 1;//0 a 5 + 1
        System.out.println(valorDado);
    }
}
