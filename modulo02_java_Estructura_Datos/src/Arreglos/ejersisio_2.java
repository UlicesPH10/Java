package Arreglos;

import java.util.Arrays;

public class ejersisio_2 {
    public static void main(String[] args) {

        int[] nums = {14, 33, 15, 36, 78, 21, 43};

        int mayor = Arrays.stream(nums).max().getAsInt();

        System.out.printf("El numero mayo es: " + mayor);
    }
}
