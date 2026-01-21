package String;

public class StringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        
        char[] arreglo = trabalenguas.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        String archivo = "Alguna.imagen.pdf";
        String archivoArr[] = archivo.split("\\.");

        for (int i = 0; i < archivoArr.length; i++) {
            System.out.println(archivoArr[i]);
        }

        System.out.println("Extension = " + archivoArr[archivoArr.length-1]);
    }
}
