package com.upc.semana3;

public class FanMasacre extends Participante
{
    private String equipo ;
    private double  puntajeBarra;
    private int puntajeEquipo ;

    public FanMasacre(String nombre, String apellido, String dni, int edad, String equipo, int cantidad_Mensaje_texto, double puntajeBarra, int puntajeEquipo) {
        super(nombre, apellido, dni, edad,cantidad_Mensaje_texto);
        this.equipo = equipo;
        this.puntajeBarra = puntajeBarra;
        this.puntajeEquipo = puntajeEquipo;
    }
    public double calcularPuntaje (){
        return getCantidad_Mensaje_texto()  *4+ puntajeBarra+ puntajeEquipo*2;
    }


    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }



    public double getPuntajeBarra() {
        return puntajeBarra;
    }

    public void setPuntajeBarra(int puntajeBarra) {
        this.puntajeBarra = puntajeBarra;
    }

    public int getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }
}
