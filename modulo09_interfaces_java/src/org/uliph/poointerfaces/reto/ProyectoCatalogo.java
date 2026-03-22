package org.uliph.poointerfaces.reto;
import java.util.Date;
public class ProyectoCatalogo {
    public static void main(String[] args) {

        IProducto[] catalogo = new IProducto[8];

        // iPhones
        catalogo[0] = new Iphone("Apple", 20000, "Negro", "iPhone 15 Pro");
        catalogo[1] = new Iphone("Apple", 15000, "Blanco", "iPhone 14");

        // TVs
        catalogo[2] = new TvLcd(8000, "Samsung", 55);
        catalogo[3] = new TvLcd(12000, "LG", 75);

        // Libros
        catalogo[4] = new Libro(350, new Date(2020 - 1900, 5, 15), "Gabriel García Márquez", "Cien Años de Soledad", "Sudamericana");
        catalogo[5] = new Libro(280, new Date(2018 - 1900, 2, 10), "Octavio Paz", "El Laberinto de la Soledad", "FCE");

        // Comics
        catalogo[6] = new Comics(150, new Date(1963 - 1900, 0, 1), "Stan Lee", "The Amazing Spider-Man", "Marvel", "Spider-Man");
        catalogo[7] = new Comics(200, new Date(1939 - 1900, 3, 25), "Bob Kane", "Batman #1", "DC Comics", "Batman");

        // Imprimir catalogo
        System.out.println("===== CATÁLOGO DE PRODUCTOS =====\n");
        for (IProducto producto : catalogo) {
            System.out.println(producto);
            System.out.println();
        }
    }
}
