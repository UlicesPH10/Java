import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ModificarInverso {

    public  static  void arregloInverso(String[] arreglo){
        int total = arreglo.length;

        for (int i = 0; i < total / 2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
        }

    }
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samnsung Galaxy", "Disco duro SSD Samnsung Externo",
                "Aus Notebook", "Mackbook Air", "Chromecast 4ta generaicón", "Bicicleta Oxford"};

        int total = productos.length;

        Arrays.sort(productos);
        for(String producto : productos){
            System.out.println("producto = " + producto);
        }

        arregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos));

        System.out.println("Interporado");
        for(String producto : productos){
            System.out.println("producto = " + producto);
        }

    }

}
