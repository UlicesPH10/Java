package com.uliph.ejemplo;

import com.uliph.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("=".repeat(5)+ " Creando instancia de alumno " + "=".repeat(5));
        Alumno alumno = new Alumno();
        alumno.setNombre("ulices");
        alumno.setApellido("Pérez");
        alumno.setInstitucion("Instituto nacional");
        alumno.setNotaHistoria(4.5);
        alumno.setNotaLenguaje(5.6);
        alumno.setNotMatematica(4.5);
        System.out.println("=".repeat(5)+ " Creando instancia de alumno iternacional " + "=".repeat(5));
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setInstitucion("Instituto nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotMatematica(6.5);

        System.out.println("=".repeat(5)+ " Creando instancia de profesor " + "=".repeat(5));
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Hernández");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor de " + profesor.getAsignatura()+ ": " + profesor.getNombre() + " " +  profesor.getApellido());

        Class claseAlumnnoInt = alumnoInt.getClass();
        while (claseAlumnnoInt.getSuperclass() != null){
            String hija = claseAlumnnoInt.getName();
            String padre = claseAlumnnoInt.getSuperclass().getName();
            System.out.println(hija + " -> " + padre);
            claseAlumnnoInt = claseAlumnnoInt.getSuperclass();
        }

        System.out.println("Prueba");
    }


}

