package Matrices;

public class SumarMatrices {
    public static void main(String[] args) {
        int [][] a = {
                {1, 2, 3},
                {3, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int [][] suma = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Matriz resultante");

        for (int[] fila : suma){
            for(int n : fila){
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}
