package Matrices;

public class MatrizString2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepa", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}};


        System.out.println("Iterando con foreach");
        for (String[] fila : nombres){
            for (String nombre : fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
