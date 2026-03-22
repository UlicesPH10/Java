package org.uliph.poointerfaces.reto;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada(){
        return this.pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.16;
    }

    @Override
    public String toString() {
        return "TvLcd [fabricante=" + this.getFabricante() +
                ", pulgada=" + pulgada +
                ", precio=$" + this.getPrecio() +
                ", precioVenta=$" + String.format("%.2f", getPrecioVenta()) + "]";
    }
}
