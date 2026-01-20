package Primitivos;

import java.util.Arrays;

public class datosChar {
    public static void main(String[] args) {
        var caracter = '\u052A';
        char decimal = 1322;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (caracter == decimal));

        char simbolo = 'Ԫ';
        System.out.println("simbolo = " + simbolo);

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("char minimo  = " + Character.MIN_VALUE);
        System.out.println("char máximo  = " + Character.MAX_VALUE);

        //Carácteres especiales
        char espacio = ' ';
        char retroceso = '\b'; //elimína el caracter anterior
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println( retornoCarro + "h" + nuevaLinea + retornoCarro + 'o' );

    }
}
