package Arreglos;

import java.util.Scanner;

public class ejersicio_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] datos = { -10, 4, 0, -2, 15, 0, 1 };
        int numPos = 0;
        int numNeg  =0;
        int nubZer = 0;
        for (int i = 0; i <7; i++) {
            if (datos[i] > 0) numPos++;
            else if (datos[i] < 0) numNeg++;
            else nubZer++;
        }
        System.out.printf("Ceros: %d%%\nPositivos: %d%% \nNegativos: %d%%\n", 100 / 7 * nubZer, 100 / 7 * numPos, 100 / 7 * numNeg);
    }
}
