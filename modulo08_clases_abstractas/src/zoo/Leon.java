package zoo;

public class Leon extends Felino{
    private Integer numeroManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombre, float tamGarras, Integer velocidad, Integer numeroManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombre, tamGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;

    }

    public Integer getNumeroManada() {
        return numeroManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "soy el leon " + nombre + " y comere en " + habitat;
    }

    @Override
    public String dormir() {
        return "soy " + nombre + " tengo mucho sueño, me ire a dormir";
    }

    @Override
    public String correr() {
        return "soy " + nombre + " y corro a una velocidad de " + velocidad + " km/h.";
    }

    @Override
    public String comunicarse() {
        return "soy " + nombre + " y hablo con mis " + numeroManada + " para saludarlos.";
    }
}
