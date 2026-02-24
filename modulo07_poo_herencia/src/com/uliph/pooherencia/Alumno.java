package com.uliph.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: Inciando constructor de alumno");
    }
    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }
    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notMatematica, double notaLenguaje, double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notMatematica = notMatematica;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotMatematica() {
        return notMatematica;
    }

    public void setNotMatematica(double notMatematica) {
        this.notMatematica = notMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        return super.saludar() + " soy alumo y mi nombres es, " + getNombre();
    }

    public double calcularPromedio(){
        return (notaHistoria + notaLenguaje + notMatematica) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "institucion=" + institucion + '\'' +
                ", notMatematica=" + notMatematica +
                ", notaLenguaje=" + notaLenguaje +
                ", notaHistoria=" + notaHistoria +
                ", promedio=" + this.calcularPromedio() ;
    }
}


