package com.upc.navieras;

public class Ultramaritimos extends Envio{
    private int codigoEmpresaContratante;
    private String nombreRepresentanteLegal;

    public Ultramaritimos() {
    }

    public Ultramaritimos(int codigo, double volumenMetrico, int categoria, int codigoEmpresaContratante, String nombreRepresentanteLegal) {
        super(codigo, volumenMetrico, categoria);
        this.codigoEmpresaContratante = codigoEmpresaContratante;
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public int getCodigoEmpresaContratante() {
        return codigoEmpresaContratante;
    }

    public void setCodigoEmpresaContratante(int codigoEmpresaContratante) {
        this.codigoEmpresaContratante = codigoEmpresaContratante;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public double calcularCosto() {
        double vol_metrico = getVolumenMetrico();
        return (vol_metrico * 500 + (vol_metrico * 10 * getCategoria()) * 10);
    }

    public String obtenerFila(){
        return getCodigo()+ "  "+ getCodigoEmpresaContratante()+"   " + getNombreRepresentanteLegal() + "  " + getVolumenMetrico()+
                "  " + getCategoria() + "  " + calcularCosto();
    }
}
