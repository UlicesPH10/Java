package org.uliph.app.jardin;

import org.uliph.app.hogar.Persona;

class Perro {
    protected String nombre;
    protected String rasa;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
