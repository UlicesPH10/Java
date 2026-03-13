package zoo;

abstract public class Canino extends Mamifero{
    protected String color;
    protected float tamColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombre, float tamColmillos, String color){
        super(habitat, altura, largo, peso, nombre);
        this.tamColmillos = tamColmillos;
        this.color = color;
    }

    public float getTamColmillos() {
        return this.tamColmillos;
    }

    public String getColor() {
        return color;
    }
}
