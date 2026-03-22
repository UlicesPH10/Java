package org.uliph.poointerfaces.reto;

public class Iphone extends Electronico{
    private String color;
    private String modelo;

    public Iphone(String fabricante, int precio,  String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;

    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.16;
    }

    @Override
    public String toString() {
        return "Iphone [modelo=" + modelo +
                ", color=" + color +
                ", fabricante=" + this.getFabricante()+
                ", precio=$" + this.getPrecio() +
                ", precioVenta=$" + String.format("%.2f", getPrecioVenta()) + "]";
    }
}
