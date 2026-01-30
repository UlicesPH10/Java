package System;

import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
    public static void main(String[] args) {
        try {
            InputStream is = ConfigProperties.class.getResourceAsStream("confi2.properties");

            if (is == null) {
                System.out.println("No se encontró el archivo usando getResourceAsStream");
            } else {
                System.out.println("¡Archivo encontrado con éxito!");
                Properties props = new Properties();
                props.load(is);
                // Aquí ya puedes usar tus propiedades
            }
        } catch (Exception e) {
            System.err.println("Erro en el archvo = " + e);
            e.printStackTrace();
        }
    }
}