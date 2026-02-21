package org.uliph.appfacturas;

import org.uliph.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-f");
        cliente.setNombre("Ulices");

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura");
        Factura factura = new Factura(in.nextLine(), cliente);

        Producto producto;


        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.println("Ingrese producto n " + producto.getCodigo() + ": ");
            producto.setNombre(in.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(in.nextFloat());

            System.out.print("Ingrese la cantidad: ");;

            factura.addItemFactura(new ItemFactura(in.nextInt(), producto));

            System.out.println();
            in.nextLine();
        }
        System.out.println(factura);
    }
}
