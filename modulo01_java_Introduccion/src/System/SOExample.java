package System;

import java.io.IOException;

public class SOExample {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;

        // El nombre correcto suele ser "Mac OS X"
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("mac")) {
            try {
                // Usamos 'open -a' que es la forma nativa de macOS
                // para lanzar aplicaciones por su nombre.
                proceso =  rt.exec(new String[]{"open", "-a", "Visual Studio Code"});
                System.out.println("✅ Abriendo VS Code...");
                proceso.waitFor();
            } catch (Exception e) {
                System.err.println("❌ No se pudo abrir: " + e.getMessage());
            }
        } else {
            System.out.println("Sistema no soportado: " + os);
        }
        System.out.println("Cerrando el editor....");
        System.exit(0);
    }

}