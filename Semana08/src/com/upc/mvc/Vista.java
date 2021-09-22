package com.upc.mvc;

import java.util.List;

public class Vista {
    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }

    public void imprimirListado(List<Alumno> lista) {
        System.out.println("---------------------------");
        for(Alumno p:lista){
            System.out.println(p.getCodigo()+ "  " + p.getNombre() + "  " +
                    p.calcularPromedio());
        }
        System.out.println("---------------------------");
    }
}
