package Matrices;

public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 2, 6},
                {4, 5, 6, 8},
        };

        boolean isSimetrica = true;

        simetrica: for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]){
                    isSimetrica = false;
                    break  simetrica;
                }
            }
        }

        if (isSimetrica) System.out.println("Es una matriz simetrica");
        else System.out.println("La matriz no es simetrica");
    }
}
