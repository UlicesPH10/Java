package Matrices;

public class MatricesBuscar {
    public static void main(String[] args) {
        int[][] matrizEnteros = {
            {35, 67, 32, 23},
            {34, 3 , 4, 8},
            {4556, 345, 4545}

        };

        int elementoBuscar = 4545;
        boolean encontrado = false;
        int i = 0, j = 0;
        buscar: for (i = 0; i < matrizEnteros.length; i++) {
            for (j = 0; j < matrizEnteros[i].length; j++) {
                if(matrizEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado) System.out.println("El elmento "+ elementoBuscar + " a sido encontrado en las cordenadas i:" + i + ", j:" + j);
        else System.out.println("El elemento " + elementoBuscar + " no esta dentro de la matriz");
    }
}
