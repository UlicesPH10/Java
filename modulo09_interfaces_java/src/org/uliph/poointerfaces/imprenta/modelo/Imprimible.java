package org.uliph.poointerfaces.imprenta.modelo;

public interface Imprimible {
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";
    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible impribible) {
        System.out.println(impribible.imprimir());
    }
}
