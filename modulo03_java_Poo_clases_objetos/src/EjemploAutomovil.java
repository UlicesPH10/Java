public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,0.6f));
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,60));

        System.out.println("-".repeat(10) + " NISSAN " + "-".repeat(10));
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);
        System.out.println(nissan.verDetalle());
        System.out.println(nissan.calcularConsumo(300, 60));

        Automovil mazda = new Automovil("mazda", "BT-50", "rojo", 3.0, 50);

        System.out.println("-".repeat(10) + " MAZDA " + "-".repeat(10));
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(2000));



    }
}
