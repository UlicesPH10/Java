package Matrices;

public class Ejersicion2Silla {
    public static void main(String[] args) {
        int n = 9;
        if(n == 0){
            throw new Error("n debe ser mayor a 0");
        }
        int media = n / 2 ;
        int[][] matriz = new int[n][n];

        // llenar fila principal
        for (int i = 0; i < n; i++) {
            matriz[i][0] = 1;
        }

        //Pintar banco
        for (int i = 0; i < n; i++) {
            matriz[media][i] = 1;
        }

        //Pintar pata
        for (int i = media; i < n; i++) {
            matriz[i][n-1] = 1;
        }

        //mostrar silla
        for (int[] fila : matriz){
            for (int p : fila){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
