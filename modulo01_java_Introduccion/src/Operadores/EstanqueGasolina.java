package Operadores;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cantidadGasolina = in.nextDouble();

        String resp = cantidadGasolina == 70 ? "Estanque lleno" : cantidadGasolina >= 60 && cantidadGasolina < 70 ? "Estanque casi lleno" :
                    cantidadGasolina >= 40 && cantidadGasolina < 60 ? "Estanque 3/4" : cantidadGasolina >= 35 && cantidadGasolina < 40 ? "medio Estanque" :
                            cantidadGasolina >= 20 && cantidadGasolina < 35 ? "Suficiente" : cantidadGasolina > 0 && cantidadGasolina < 20 ? "Insuficiente":
                "Esta vacio";

        System.out.println(resp);
    }
}
