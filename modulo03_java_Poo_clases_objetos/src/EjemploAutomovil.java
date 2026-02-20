import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");

        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,0.6f));
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,60));

        System.out.println("-".repeat(10) + " NISSAN " + "-".repeat(10));

        Automovil auto = new Automovil();
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

        System.out.println(" son iguales? " + (nissan == nissan2));
        System.out.println(" son iguales? " + nissan.equals(nissan2));
        System.out.println(nissan.verDetalle());
        System.out.println(nissan.calcularConsumo(300, 60));
        System.out.println(auto.equals(nissan));
        System.out.println("Nissan a string: " + nissan);
        Date Fecha = new Date();
        System.out.println(auto.equals(Fecha));

        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO,  new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));

        System.out.println("-".repeat(10) + " MAZDA " + "-".repeat(10));
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(2000));


    }
}
