package zoo;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];


        mamiferos[0] = new Leon("Sabana", 1.2f, 2.0f, 190f, "Simba", 7.5f, 80, 10, 120.5f);
        mamiferos[1] = new Guepardo("Estepa", 0.9f, 1.5f, 60f, "Chester", 5.0f, 110);
        mamiferos[2] = new Lobo("Bosque", 0.8f, 1.2f, 40f, "Balto", 3.5f, "Gris", 5, "Lupus");
        mamiferos[3] = new Tigre("Selvas de la India", 1.1f, 3.2f, 260f, "Shere Khan", 12.5f, 65, "Tigre de Bengala");
        mamiferos[4] = new Perro("Sabana", 0.75f, 1.1f, 28f, "Licaón", 3.5f, "Manchado-Tricolor", 317);

        for (Mamifero animal : mamiferos) {
            System.out.println("------ " + animal.getNombre() + " ------");
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Comer: " + animal.comer());
            System.out.println("Correr: " + animal.correr());
            System.out.println("Comunicación: " + animal.comunicarse());
            System.out.println("Descanso: " + animal.dormir());
        }
    }
}