package Operadores;

import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String n1, n2, n3;

        System.out.println("Ingese el primer nombre completo");
        n1 = in.nextLine().split(" ")[0];

        System.out.println("Ingese el segundo nombre completo");
        n2 = in.nextLine().split(" ")[0];

        System.out.println("Ingese el primer nombre completo");
        n3 = in.nextLine().split(" ")[0];

        String nombreLargo = "";

        nombreLargo = (n1.length() > n2.length() && n1.length() > n3.length() )? n1 : n2.length() > n3.length() ? n2 : n3;

        System.out.println(nombreLargo + " tiene el nombre más largo");

    }
}
