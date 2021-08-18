package com.upc.herencia;

public class ProfesorTC extends Profesor{
    private double sueldoBase;
    private double porcAFP;

    public ProfesorTC(String dni, String nombre, int numeroHijos, double sueldoBase, double porcAFP) {
        super(dni, nombre, numeroHijos);//llama al constructor de la clase padre y le pasa los datos
        //a sus propiedades
        this.sueldoBase = sueldoBase;
        this.porcAFP = porcAFP;
    }

       public double calcularSueldo(){
        return this.sueldoBase - this.porcAFP*this.sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPorcAFP() {
        return porcAFP;
    }

    public void setPorcAFP(double porcAFP) {
        this.porcAFP = porcAFP;
    }
}
