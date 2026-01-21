package Operadores;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = in.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = in.nextInt();

        String numOrdenados = num1 >= num2 ? String.valueOf(num1 + " " + num2) : String.valueOf(num2 + " " + num1);

        System.out.printf("Numeros ordenados: \n%s", numOrdenados);
    }
}
