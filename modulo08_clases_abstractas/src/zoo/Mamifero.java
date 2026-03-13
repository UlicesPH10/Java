package zoo;

abstract public class Mamifero {
    protected String habitat;
    protected Float altura;
    protected float largo;
    protected float peso;
    protected String nombre;

    public Mamifero(String habitat, Float altura, float largo, float peso, String nombre) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public Float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    abstract public String comer();

    abstract public String dormir();

    abstract public String correr();

    abstract public String comunicarse();
}
