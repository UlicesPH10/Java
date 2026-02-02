public class ArrayBubleSort {
    public static void bubleSort(Object[] arreglo){

        int total = arreglo.length;
        boolean cambio ;


        for (int i = 0; i <total-1; i++) {
            cambio = false;
            for (int j = 0; j < total -1 -i; j++) {
                if ( ((Comparable)  arreglo[j+1]).compareTo(arreglo[j]) > 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                    cambio = true;
                }
            }
            if (!cambio) break;
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samnsung Galaxy", "Disco duro SSD Samnsung Externo",
                "Aus Notebook", "Mackbook Air", "Chromecast 4ta generaicón", "Bicicleta Oxford"};

        bubleSort(productos);

        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }


        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        bubleSort(numeros);
        for(int n : numeros){
            System.out.println("n = " + n);
        }
    }
}
