package com.upc.mvc;

import java.util.List;

public class Controlador {
    private Vista vista; // Pantalla GUI
    private Administrador administrador; // MODEL: Negocio

    public Controlador(Vista vista, Administrador administrador) {
        this.vista = vista;
        this.administrador = administrador;
    }

    public void registrame(String codigo, String nombre, int nota1, int nota2) {
       administrador.registrar(codigo,nombre,nota1,nota2);
       vista.mostrar("Alumno registrado");
    }
    public void imprimirListadoAlumnos() {
        List<Alumno> lista = administrador.getAlumnos();
        vista.imprimirListado(lista);
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

}
