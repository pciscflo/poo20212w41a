package com.upc.semana3;

import java.util.ArrayList;
import java.util.List;

public class Administrador
{
    private String nombre ;
    private List<Participante> lista_Participantes ;

    public Administrador(String nombre) {
        this.nombre = nombre;
        lista_Participantes= new ArrayList<>();

    }
    public void registrarParticipante(Participante p){
        if (p.validarEdad()) {
            lista_Participantes.add(p);
        }else{
            System.out.println("Es menor de edad, no permitido!");
        }
    }
    public Participante obtenerGanador(){
        double maximo = 0;
        Participante mayor=null;
        for(Participante p:lista_Participantes){
            if(p.calcularPuntaje()>maximo){
                maximo = p.calcularPuntaje();
                mayor = p;
            }
        }
        return mayor;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Participante> getLista_Participantes() {
        return lista_Participantes;
    }

    public void setLista_Participantes(List<Participante> lista_Participantes) {
        this.lista_Participantes = lista_Participantes;
    }
}
