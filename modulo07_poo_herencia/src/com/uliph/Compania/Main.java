package com.uliph.Compania;

import com.uliph.Compania.model.Gerente;public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Andrés", "Guzmán", "123-456", "Calle Falsa 123", 50000.0, 100000.0);

        System.out.println("--- Datos Iniciales del Gerente ---");
        System.out.println(gerente.toString());

        gerente.aumentarRemuneracion(10);

        gerente.setPresupuesto(120000.0);

        System.out.println("\n--- Datos tras Aumento y Cambio de Presupuesto ---");
        System.out.println(gerente.toString());
    }
}