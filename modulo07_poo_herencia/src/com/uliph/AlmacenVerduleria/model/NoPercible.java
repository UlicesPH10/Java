package com.uliph.AlmacenVerduleria.model;

public class NoPercible extends Producto {
    private int contenido;
    private int calorias;


    public NoPercible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Contenido: " + this.getContenido() + "\n" +
                "Calorias: " + this.getCalorias();
    }
}
