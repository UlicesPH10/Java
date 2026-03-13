package zoo;

public class Perro extends Canino {

    private Integer fuerzaMoridida;

    public Perro(String habitat, float altura, float largo, float peso, String nombre, float tamColmillos, String color, Integer fuerzaMoridida) {
        super(habitat, altura, largo, peso, nombre, tamColmillos, color);
        this.fuerzaMoridida = fuerzaMoridida;
    }

    @Override
    public String comer() {
        return "soy el leon " + nombre + " y comere con mi fuerez de mordida de " + fuerzaMoridida + " .";
    }

    @Override
    public String dormir() {
        return "soy " + nombre + " tengo mucho sueño, me ire a dormir";
    }

    @Override
    public String correr() {
        return "soy " + nombre + " y corro con mi camada";
    }

    @Override
    public String comunicarse() {
        return "soy " + nombre + " y hablo con mis amigos para para saludarlos.";
    }
}