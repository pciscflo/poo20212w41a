package com.upc.herencia;

public abstract class Profesor {
    private String dni;
    private String nombre;
    private int numeroHijos;

    public Profesor() {
    }

    public Profesor(String dni, String nombre, int numeroHijos) {
        this.dni = dni;
        this.nombre = nombre;
        this.numeroHijos = numeroHijos;
    }

    public abstract double calcularSueldo();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
}
