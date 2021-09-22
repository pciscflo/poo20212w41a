package com.upc.mvc;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Alumno> alumnos;
    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }
    public void registrar(Alumno alumno){
        alumnos.add(alumno);
    }

    public void registrar(String codigo, String nombre, int nota1, int nota2){
        Alumno alumno = new Alumno(codigo, nombre, nota1, nota2);
        alumnos.add(alumno);
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
