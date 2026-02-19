public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);



        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO,  new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipo.getNombre());
        System.out.println("tipo des. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puretas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitatio de transporte, de empresa");
            case HATCHBACK -> System.out.println("Es un automil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camionete");
            case SEDAN -> System.out.println("Es un automil mediano");
            case STATION_WAGON -> System.out.println("Es un automil más grande, con maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos){
            System.out.println(ta + " = > " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", "+
                    ta.getNumeroPuertas());
        }

    }
}
