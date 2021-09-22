package com.upc.mvc;

public class Main {
    public static void main(String[] args) {
        //código muy limpio
       Vista vista = new Vista();
       Administrador administrador = new Administrador("Lucho");
       Controlador controlador = new Controlador(vista,administrador); //MVC1
        //TDD
        controlador.registrame("100034","Felipe", 19, 17);
        controlador.registrame("100031","Carlos", 15, 16);
        controlador.imprimirListadoAlumnos();

    }
}
