package zoo;

public class Guepardo extends Felino{
    public Guepardo(String habitat, float altura, float largo, float peso, String nombre, float tamGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombre, tamGarras, velocidad);
    }

    @Override
    public String comer() {
        return "soy el guepardo " + nombre + " y comere en " + habitat;
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
        return "soy " + nombre + " y hablo con mis " + " mis amigos para saludarlos.";
    }
}
