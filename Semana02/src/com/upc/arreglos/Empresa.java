package com.upc.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombreEmpresa;
    private List<Auto> autos;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.autos = new ArrayList<>();
    }
    public void registrar(Auto auto){
        this.autos.add(auto);
    }
    public Auto  obtenerDatosMasCaro(){
        double maximo = 0;
        Auto autoMasCaro = null;
        for(Auto auto: autos){
            if (auto.calcularPrecioFinal() > maximo){
                maximo = auto.calcularPrecioFinal();
                autoMasCaro = auto;
            }
        }
        return autoMasCaro;
    }
    public double obtenerPromedio(){
        double suma =0;
        for (Auto p: autos){
            suma+=p.calcularPrecioFinal();
        }
        return suma/autos.size();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
}
