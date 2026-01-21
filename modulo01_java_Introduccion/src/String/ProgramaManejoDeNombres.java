package String;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre");
        String nombre1 = in.nextLine();

        System.out.println("Ingrese el segundo nombre");
        String nombre2 = in.nextLine();

        System.out.println("Ingrese el tercer nombre");
        String nombre3= in.nextLine();

        String nombre1Comp = nombre1.substring(1,2).toUpperCase() + "." + nombre1.substring(nombre1.length()-2);
        String nombre2Comp = nombre2.substring(1,2).toUpperCase() + "." + nombre2.substring(nombre2.length()-2);
        String nombre3Comp = nombre3.substring(1,2).toUpperCase() + "." + nombre3.substring(nombre3.length()-2);

        //System.out.println(nombre1Comp + "_" + nombre2Comp + "_" + nombre3Comp);
        System.out.println(String.join("_" + nombre1Comp, nombre2Comp, nombre3Comp));

    }
}
