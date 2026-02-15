import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO,  3.0, 50);

        Automovil.setColorPatente(Color.AZUL);

        System.out.println("-".repeat(10) + "SUBARU " + "-".repeat(10));
        System.out.println(subaru.verDetalle());
        System.out.println("-".repeat(10) + " NISSAN " + "-".repeat(10));
        System.out.println(nissan.verDetalle());
        System.out.println("-".repeat(10) + "NISSAN2 " + "-".repeat(10));
        System.out.println(nissan2.verDetalle());
        System.out.println("-".repeat(10) + " MAZDA " + "-".repeat(10));
        System.out.println(mazda.verDetalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Automovil.calcularConsumoEstatico(100, 50) = " + Automovil.calcularConsumoEstatico(100, 50));
        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);

    }
}