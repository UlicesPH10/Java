package Arreglos;

import java.util.Scanner;

public class NotasAlumnos  {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner in = new Scanner(System.in);
        System.out.println("INgrese 7 notas pde estudicantes para matemáticas");
        for (int i = 0; i < 7; i++){
            claseMatematicas[i] = in.nextDouble();
        }

        System.out.println("INgrese 7 notas pde estudicantes para Historia");
        for (int i = 0; i < 7; i++){
            claseHistoria[i] = in.nextDouble();
        }

        System.out.println("INgrese 7 notas pde estudicantes para Lenguas");
        for (int i = 0; i < 7; i++){
            claseLenguaje[i] = in.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }
        double promMate = sumNotasMatematicas / 7;
        double promHis =  sumNotasHistoria / 7;
        double promLen = sumNotasLenguaje / 7;
        System.out.println("Promedio de la clase matermaticas: " + promMate);
        System.out.println("Promedio de la clase Historia: " + promHis);
        System.out.println("Promedio de la clase Lenguas: "+ promLen);

        System.out.println("Ingrese que alumno quiere consultar su promedio(0,6)");
        int id = in.nextInt();

        double prom = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;
        System.out.println("Promedio del alumon " + id + ": " + prom);
    }
}
