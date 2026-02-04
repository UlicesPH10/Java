package Arreglos;

public class maxFrecuencia {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int[] frecuencias = new int[9];
        int pos;
        for (int i = 0; i < numbers.length; i++) {
            frecuencias[numbers[i]-1]++;
        }
        int frec = 0;
        int maxEl = numbers[0];
        for (int i = 0; i < frecuencias.length; i++) {
            if(frecuencias[i] > frec){
                frec = frecuencias[i];
                maxEl = i +1 ;
            }
        }

        System.out.println("La mayor ocurrencia es: "  + frec);
        System.out.println("El elmento con mas repeticiones es: " + maxEl);
    }
}
