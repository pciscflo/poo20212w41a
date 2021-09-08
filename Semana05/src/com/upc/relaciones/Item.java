package com.upc.relaciones;

public class Item {
    private int numeroItem;
    private int cantidad;
    private Producto producto;

    public Item() {
    }

    public Item(int numeroItem, int cantidad, Producto producto) {
        this.numeroItem = numeroItem;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public double calcularSubtotal(){
        return cantidad*producto.getPrecio();
    }
    //teòrica para concordar con la composición
    public void asignarProducto(String codigo, String descripcion, double precio){
        this.producto = new Producto(codigo, descripcion, precio);
    }

    public Item(int numeroItem, int cantidad) {
        this.numeroItem = numeroItem;
        this.cantidad = cantidad;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
