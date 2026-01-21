package String;

public class obtenerExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.js";
        int posPunto = archivo.lastIndexOf('.');
        String nombreArchivo = archivo.substring(0, posPunto);
        String extensionArchivo = archivo.substring(posPunto+1);

        System.out.println("nombreArchivo = " + nombreArchivo);
        System.out.println("Extensión = " + extensionArchivo);
    }

}
