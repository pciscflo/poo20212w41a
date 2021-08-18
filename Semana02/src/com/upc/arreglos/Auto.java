package com.upc.arreglos;

public class Auto {
    private String codigo;
    private String marca;
    private String modelo;
    private double precio;
    private byte numeroPuertas;

    public Auto() {
    }

    public Auto(String codigo, String marca, String modelo, double precio, byte numeroPuertas) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.numeroPuertas = numeroPuertas;
    }

    public double calcularDescuento(){
        double descuento=0;
        if(this.marca.equals("Toyota")){
            descuento = 0.10*this.precio;
        }
        return descuento;
    }

    public double calcularPrecioFinal(){
        return this.precio - calcularDescuento();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(byte numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
