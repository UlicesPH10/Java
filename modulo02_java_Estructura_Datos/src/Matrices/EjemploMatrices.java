package Matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        int[][] nums = new int[2][4];

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 4;

        nums[1][0] = 11;
        nums[1][1] = 12;
        nums[1][2] = 13;
        nums[1][3] = 14;


        System.out.println("números de filas: " + nums.length);
        System.out.println("número de columnas: " + nums[0].length);

        System.out.println("Primer elemento de la matriz: " + nums[0][0]);
        System.out.println("Último elemento de la matriz: " + nums[nums.length -1][nums[1].length-1]);

        for (int[] filas : nums){
            for (int numero : filas){
                System.out.println("numero = " + numero);
            }
        }
    }
}
