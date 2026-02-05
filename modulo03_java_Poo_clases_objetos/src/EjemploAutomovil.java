public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil();

        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Blanco";
        System.out.println(subaru.detalle());

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo ="BT-50";
        mazda.color = "rojo";
        mazda.cilindrada = 3.0;

        System.out.println("-".repeat(10) + " MAZDA " + "-".repeat(10));
        System.out.println(mazda.detalle());
    }
}
