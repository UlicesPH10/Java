package zoo;

abstract public class Felino extends Mamifero{
    protected float tamGarras;
    protected Integer velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombre, float tamGarras, Integer velocidad){
        super(habitat, altura, largo, peso, nombre);
        this.tamGarras = tamGarras;
        this.velocidad = velocidad;
    }

    public float getTamGarras() {
        return tamGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
