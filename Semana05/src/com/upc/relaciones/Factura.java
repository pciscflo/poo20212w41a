package com.upc.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private Cabecera cabecera;
    private List<Item> items;

    public Factura() {
    }
    public Factura(Cabecera cabecera) {
        this.cabecera = cabecera;
        this.items = new ArrayList<>();
    }

    public void registrarItem(Item item){
          this.items.add(item);
    }

    public double calcularMontoTotal(){
        double suma=0;
        for (Item p:this.items){
            suma+=p.calcularSubtotal();
        }
        return suma;
    }

    public Cabecera getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecera cabecera) {
        this.cabecera = cabecera;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
