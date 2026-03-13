package zoo;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombre, float tamGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombre, tamGarras, velocidad);
        this.especieTigre = especieTigre;
    }


    public String getEspecieTigre(){
        return this.especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre " + nombre + " come con su especie" + especieTigre + " en su habitat "+ habitat + ".";
    }

    @Override
    public String dormir() {
        return "El tigre " + nombre + " duerme " + "en su habitat "+ habitat + ".";
    }

    @Override
    public String correr() {
        return "El tigre " + nombre + " corre a una velocidad de "+ velocidad + " km/h .";
    }

    @Override
    public String comunicarse() {
        return "El tigre" + nombre + " se comunica con su especie " + especieTigre + "." ;
    }
}
