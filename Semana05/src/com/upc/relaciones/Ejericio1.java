package com.upc.relaciones;

import java.util.List;

public class Ejericio1 {
    public static void main(String[] args) {
        Cabecera cabecera = new Cabecera(123,"88888888888","Tienda Mass",
                "Av. Fontana 390","10/02/2021");
        Producto producto1 = new Producto("1002","Fanta",1.8);
        Producto producto2 = new Producto("1005","Leche Ideal",2.5);
        Producto producto3 = new Producto("1203", "Chocolate", 1.0);
        Item item1 = new Item(1,3,producto1);
        Item item2 = new Item(2, 1,producto2);
        Item item3 = new Item(3, 2,producto3);
        Factura factura1 = new Factura(cabecera);
        factura1.registrarItem(item1);
        factura1.registrarItem(item2);
        factura1.registrarItem(item3);
        System.out.println("Numero de Factura:" + factura1.getCabecera().getNumeroFactura());
        System.out.println("Numero de RUC:" + factura1.getCabecera().getRuc());
        System.out.println("Fecha:" + factura1.getCabecera().getFecha());
        System.out.println("Direccion:"+ factura1.getCabecera().getDireccion());
        System.out.println("----------------------------------------------------");
        List<Item> items = factura1.getItems();
        for (Item p:items){
            System.out.println(p.getNumeroItem()+ " " + p.getProducto().getDescripcion()+ "  " +
                               p.getProducto().getPrecio()+"  " + p.getCantidad()+ "  " + p.calcularSubtotal());
        }
        System.out.println("-----------------------");
        System.out.println("Total de Factura:" + factura1.calcularMontoTotal());




    }
}
