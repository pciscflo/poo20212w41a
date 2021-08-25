package com.upc.semana3;

public class Televidente extends Participante {
    private  int numeroDeSeguridad;

    private int cantidad_llamadas ;

    public Televidente(String nombre, String apellido, String dni, int edad, int numeroDeSeguridad, int cantidad_mensajeTexto, int cantidad_llamadas) {
        super(nombre, apellido, dni, edad,cantidad_mensajeTexto);
        this.numeroDeSeguridad = numeroDeSeguridad;
        this.cantidad_llamadas = cantidad_llamadas;
    }

    public double calcularPuntaje (){
        return  getCantidad_Mensaje_texto()  *4 + cantidad_llamadas*3;
    }

    public boolean  validarLosCampos(){
        if (super.validarLosCampos() && this.numeroDeSeguridad>0 && this.cantidad_llamadas>0)
        {
            return true;
        }else {
            return false;
        }
    }
    public int getNumeroDeSeguridad() {
        return numeroDeSeguridad;
    }

    public void setNumeroDeSeguridad(int numeroDeSeguridad) {
        this.numeroDeSeguridad = numeroDeSeguridad;
    }



    public int getCantidad_llamadas() {
        return cantidad_llamadas;
    }

    public void setCantidad_llamadas(int cantidad_llamadas) {
        this.cantidad_llamadas = cantidad_llamadas;
    }
}
