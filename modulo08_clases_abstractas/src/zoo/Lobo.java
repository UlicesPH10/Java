package zoo;

public class Lobo extends Canino{
    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombre, float tamColmillos, String color,  Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombre, tamColmillos, color);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
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
        return "soy " + nombre + " y corro con mi camada de especie " + especieLobo;
    }

    @Override
    public String comunicarse() {
        return "soy " + nombre + " y hablo con mis " + numCamada + " para saludarlos.";
    }
}
