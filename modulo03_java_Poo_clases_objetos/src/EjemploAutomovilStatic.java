import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);


        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO,  new Motor(3.0, TipoMotor.DIESEL));
        //mazda.setEstanque(new Estanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
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

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo des. subaru: " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));
    }
}
