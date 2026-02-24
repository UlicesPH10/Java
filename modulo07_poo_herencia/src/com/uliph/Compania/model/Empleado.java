package com.uliph.Compania.model;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoID;

    private static int ultimoId = 0;


    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoID = ++ultimoId;
        this.remuneracion = remuneracion;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += ((remuneracion / 100) * porcentaje);
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }


    @Override
    public String toString() {
        return super.toString() + "\nremuneracion=" + remuneracion +
                ", empleadoID=" + empleadoID;
    }
}
