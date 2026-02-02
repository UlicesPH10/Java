import java.util.Arrays;

public class ArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        for (int i = 0; i < total; i++) {
            System.out.println("producto = " + productos[i]);
        }
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook Air";
        productos[5] = "Chromecast 4ta genración";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        for (int i = 0; i < total; i++) {
            System.out.println("producto = " + productos[i]);
        }

        System.out.println("\n=== USANDO POR EACH === \n");

        for(String producto : productos){
            System.out.println("producto = " + producto);
        }

        Arrays.sort(productos);
        int i = 0;
        System.out.println("\n=== USANDO WHILE=== \n");
        while (i < total) {
            System.out.println("producto = " + productos[i]);
            i++;
        }


        int[] numbers = new int[4];

    }
}
