package com.upc.figuras;

public class Triangulo {
    private int a;
    private int b;
    private  int c;

    public Triangulo() {
    }

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularSemiperimetro(){
        return (this.a + this.b + this.c)/2.0;
    }

    public double calcularArea(){
        double area, p;
        p = calcularSemiperimetro();
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public boolean validarLados(){

        return true;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
