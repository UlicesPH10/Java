package SistemasNumericos;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EntradaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
       // String numeroStr = in.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = in.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Eror debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        String numeroOctal = Integer.toOctalString(numeroDecimal);
        String numeroHexadecimal = Integer.toHexString(numeroDecimal);

        String mensaje = "Número Decimal: " + numeroDecimal + "\n" +
                "Número Binario: " + numeroBinario + "\n" +
                "Número Octal: " + numeroOctal + "\n" +
                "Número Hexadecimal: " + numeroHexadecimal + "\n";

        System.out.println(mensaje);

    }

}
