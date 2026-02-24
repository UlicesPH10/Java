package com.uliph.Compania.model;

public class Cliente extends Persona{
    private int clienteId;

    private static int ultimoId = 0;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++ultimoId;
    }


    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "clienteId=" + clienteId ;
    }
}
