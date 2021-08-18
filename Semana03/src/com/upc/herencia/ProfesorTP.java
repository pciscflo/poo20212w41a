package com.upc.herencia;

public class ProfesorTP extends Profesor{
    private int horas;
    private double tarifaHora;

    public ProfesorTP(String dni, String nombre, int numeroHijos, int horas, double tarifaHora) {
        super(dni, nombre, numeroHijos);
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSueldo(){
        return (this.horas*this.tarifaHora);
    }
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
}
