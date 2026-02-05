package Matrices;

public class TransponerMatriz {
    public static void main(String[] args) {
        int[][] matriz1 = new int[8][4];
        int[][] matriz2 = new int[4][8];

        int f = matriz1.length;
        int c = matriz1[0].length;

        for(int i = 0; i < f; i++ ){
            for (int j = 0; j < c; j++) {
                matriz1[i][j] = i * j;
            }
        }

        System.out.println("Matriz normal");
        for(int[] fila : matriz1){
            for(int n : fila){
                System.out.print(n + " \t");
            }
            System.out.println();
        }

        for(int i = 0; i < f; i++ ){
            for (int j = 0; j < c; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }

        System.out.println("Matriz 2");
        for(int[] fila : matriz2){
            for(int n : fila){
                System.out.print(n + " \t");
            }
            System.out.println();
        }
    }

}

