package Matrices;

public class MatrizString {
    public static void main(String[] args) {
        String[][] nombres = new String[3][2];

        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";

        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";

        nombres[2][0] = "Lucas";
        nombres[2][1] = "pancha";

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[0].length; j++) {
                System.out.println("nombres" + "[" + i + "]" + "[" + j + "] : " + nombres[i][j]);
            }
        }
        System.out.println("Iterando con foreach");
        for (String[] fila : nombres){
            for (String nombre : fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
