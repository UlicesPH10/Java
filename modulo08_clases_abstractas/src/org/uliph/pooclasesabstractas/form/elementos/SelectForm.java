package org.uliph.pooclasesabstractas.form.elementos;

import org.uliph.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");
        for (Opcion opcion : opciones){
            sb.append("\n\t<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(">") ;
            sb.append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("\n</select>");
        return sb.toString();
    }
}
