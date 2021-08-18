package com.upc.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("AA1", "Toyota", "Yaris", 15000, (byte)4 );
        Auto auto2 = new Auto("AA5", "Suzuki", "Swift", 14000, (byte)2 );
        List<Auto> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        for (Auto p:autos){
            System.out.println(p.getCodigo() + "  " + p.getMarca() + "  " + p.calcularDescuento() +
                    "  " + p.calcularPrecioFinal());
        }
    }
}
