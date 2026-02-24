package com.uliph.ejemplo;

import com.uliph.pooherencia.Alumno;
import com.uliph.pooherencia.AlumnoInternacional;
import com.uliph.pooherencia.Persona;
import com.uliph.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("=".repeat(5) + " Creando instancia de alumno " + "=".repeat(5));
        Alumno alumno = new Alumno("Andres", "Guzman", 13, "Instituto nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotMatematica(4.9);
        alumno.setEmail("@ejemplo.com");

        System.out.println("=".repeat(5) + " Creando instancia de alumno iternacional " + "=".repeat(5));
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotMatematica(6.5);
        alumnoInt.setEmail("peter@ejemplo.com");

        System.out.println("=".repeat(5) + " Creando instancia de Profesor " + "=".repeat(5));
        Profesor profesor = new Profesor("Luci", "Pérez", 37, "Matematicas");
        profesor.setEmail("profesor@ejemplo.com");

        System.out.println("======= - ========");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
        System.out.println("=".repeat(100));
    }
}
