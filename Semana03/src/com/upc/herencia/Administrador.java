package com.upc.herencia;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private String nombre;
    private List<Profesor> profesores;//liskov

    public Administrador(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
    }

    public void registrar(Profesor profesor){
        profesores.add(profesor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
