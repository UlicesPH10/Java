public class Histograma {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] frecuencias = new int[6];
        int pos;
        for (int i = 0; i < numbers.length; i++) {
            frecuencias[numbers[i]-1]++;
        }

        for (int i = 0; i < frecuencias.length; i++) {
            System.out.println(i+1 + ": " + "*".repeat(frecuencias[i]) );
        }
    }
}
