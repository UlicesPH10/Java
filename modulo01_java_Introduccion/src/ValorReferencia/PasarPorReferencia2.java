package ValorReferencia;

class Persona {
    public String getNombre() {
        return nombre;
    }

    private String nombre;

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("Inicimaos el método main");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Antes de llamar el método test");
        test(persona);
        System.out.println("Despues de llamar el método test");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Finaliza el método main");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }

}
