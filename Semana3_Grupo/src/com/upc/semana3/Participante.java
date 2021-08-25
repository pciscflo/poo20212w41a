package com.upc.semana3;

public abstract class Participante
{
    private String nombre;
    private String apellido;
    private String dni ;
    private  int edad;
    private int cantidad_Mensaje_texto;

    public Participante(String nombre, String apellido, String dni, int edad, int cantidad_Mensaje_texto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.cantidad_Mensaje_texto= cantidad_Mensaje_texto;
    }
    public boolean  validarLosCampos(){

        return  false;
    }

    public boolean validarEdad(){

        if (edad<18){
            return  false;
        }
        else{
            return  true;
        }

    }

    public abstract double calcularPuntaje();

    public int getCantidad_Mensaje_texto() {
        return cantidad_Mensaje_texto;
    }

    public void setCantidad_Mensaje_texto(int cantidad_Mensaje_texto) {
        this.cantidad_Mensaje_texto = cantidad_Mensaje_texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
