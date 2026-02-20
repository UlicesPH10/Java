package org.uliph.app.jardin;


import org.uliph.app.hogar.*;
import static org.uliph.app.hogar.Persona.*;
import static org.uliph.app.hogar.ColorPelo.*;
public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setApellido("Perez");
        persona.setColorPelo(CAFE);
        System.out.println("persona = " + persona.getApellido());
        Perro p = new Perro();
        p.nombre = "toby";
        p.rasa = "chihuahua";

        String jugando = p.jugar(persona);
        System.out.println(jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
