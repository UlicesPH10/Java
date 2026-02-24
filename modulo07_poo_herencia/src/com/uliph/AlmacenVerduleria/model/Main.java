package com.uliph.AlmacenVerduleria.model;

public class Main {
    public static void main(String[] args) {
        Lacteo leche = new Lacteo("Leche", 45, 1, 54);
        Lacteo queso = new Lacteo("Queso oaxaca", 50, 1, 23 );

        Fruta manzana = new Fruta("Manzana", 35, 2, "Rojo");
        Fruta sandia = new Fruta("Sandía", 120, 5, "Verde");

        Limpieza fabuloso = new Limpieza("Fabuloso", 48, "Agua, fabuloso", 2);
        Limpieza jabon = new Limpieza("Jabon Ariel", 67, "Jabon Liquido", 2);

        NoPercible pollo = new NoPercible("Milansea Pollo", 99, 1, 23);
        NoPercible pescado = new NoPercible("Filete de pescado", 120, 10, 43);

        Producto[] productos = {leche, queso, manzana, sandia, fabuloso, jabon, pollo, pescado};

        System.out.println();
        for (Producto p : productos){
            System.out.println("=".repeat(100));
            System.out.println(p);
            System.out.println();
        }

    }
}
