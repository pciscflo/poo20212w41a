package com.upc.semana3;

import java.util.List;

public class Main_Semana3 {
    public static void main(String[] args) {
        FanMasacre fanMasacre1 = new FanMasacre("Pepe","Suarez","88888888",20,"nuclear",
                   0,200,150);
        Televidente televidente1 = new Televidente("Juan","Lopez","77777777",13,
                   34889894,140,220);
        FanMasacre fanMasacre2 = new FanMasacre("Luis","Torres","55555555",25,"atomico",
                120,130,200);

        Administrador administrador = new Administrador("Sergio");
        administrador.registrarParticipante(fanMasacre1);
        administrador.registrarParticipante(televidente1);
        administrador.registrarParticipante(fanMasacre2);
        List<Participante> lista;
        lista = administrador.getLista_Participantes();
        for(Participante p:lista){
            System.out.println(p.getNombre()+ "   " + p.getDni()+"   "+ p.calcularPuntaje());
        }
        System.out.println("Ganador:" + administrador.obtenerGanador().getNombre()+ " con puntaje:" +
                administrador.obtenerGanador().calcularPuntaje() );


    }
}
