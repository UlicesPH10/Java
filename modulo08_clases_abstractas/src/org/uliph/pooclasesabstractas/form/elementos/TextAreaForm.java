package org.uliph.pooclasesabstractas.form.elementos;

public class TextAreaForm extends ElementoForm{

    private int filas;
    private int columnas;

    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    @Override
    public String dibujarHtml() {
        return String.format("<texarea name='%s' cols='%s' rows='%s'>%s</textarea>", this.nombre, this.columnas, this.filas, this.valor);
    }
}
