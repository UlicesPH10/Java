package com.uliph.ejemplo;

import com.uliph.pooherencia.*;

public class EjemploHerenciaConstructores {
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

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo los datos del tipo común Persona:");
        System.out.println("nombre: " +persona.getNombre()
                + ", apellido:  " + persona.getApellido()
                + ", edad: " + persona.getEdad()
        + ", email: " + persona.getEmail());

        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println("Institución: " + ((Alumno)persona).getInstitucion());
            System.out.println("Nota matematicas: " + ((Alumno)persona).getNotMatematica());
            System.out.println("Nota lenguaje: " + ((Alumno) persona).getNotaLenguaje());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional:");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("=".repeat(80));
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
        }

        if (persona instanceof Profesor){
            System.out.println("Iprimeindo los datos del tipo Profesor:");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("=".repeat(80));
        System.out.println(persona.saludar());
        System.out.println("=".repeat(80));
    }
}
