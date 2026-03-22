package org.uliph.poointerfaces.imprenta;


import org.uliph.poointerfaces.imprenta.modelo.*;

import static org.uliph.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Carrera laboral...", new Persona("John", "Doe"), "Ingeniero en sistemas");
        cv.addExperiencia("JAVA")
                .addExperiencia("ORACLE DB")
                .addExperiencia("SPRING FRAMEWORK")
                .addExperiencia("DESARROLLADOR FULLSTACK")
                .addExperiencia("ANGULAR")
                .addExperiencia("FLUTTER");
        Informe informe = new Informe("Estudio de microservicios", new Persona("Margin", "Fowler"), new Persona("Carles", "James"));

        Libro libro = new Libro(new Persona("Eirc", "Gamma"), "Patronces de diseño: Elem. Reusables Poo"
                , Genero.PROGRAMACION);

        libro.addPagina(new Pagina("Patrón singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);


        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        });
        System.out.println(TEXTO_DEFECTO);
    }


}