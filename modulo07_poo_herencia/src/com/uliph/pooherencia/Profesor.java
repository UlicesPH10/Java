package com.uliph.pooherencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor() {
        System.out.println("Inicializando constructor de profesor");
    }

    private Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Profesor(String nombre, String apellido, int edad, String asignatura) {
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos dias soy el profesor " + "de " + getAsignatura() + " , mi nombre es " + this.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "asignatura='" + asignatura + '\'' ;
    }
}
