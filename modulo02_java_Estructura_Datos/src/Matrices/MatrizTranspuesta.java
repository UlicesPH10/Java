package Matrices;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = i; j <matriz.length ; j++) {
                int aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        for (int[] fila : matriz){
            for (int n : fila){
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}
