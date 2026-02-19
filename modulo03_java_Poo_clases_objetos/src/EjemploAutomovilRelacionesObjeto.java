public class EjemploAutomovilRelacionesObjeto {
    public static void main(String[] args) {
        Rueda[] ruedasSub = new Rueda[5];
        Persona conductorSubaru = new Persona("Luci", "Martinez");

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);

        for (int i = 0; i < 5; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));

        }



        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO,  new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedazMazda);
        for (int i = 0; i < 5; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));

        }

        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setConductor(lalo);
        nissan2.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));


        System.out.println("-".repeat(10) + "SUBARU " + "-".repeat(10));
        System.out.println(subaru.verDetalle());
        System.out.println("-".repeat(10) + " NISSAN " + "-".repeat(10));
        System.out.println(nissan.verDetalle());
        System.out.println("-".repeat(10) + "NISSAN2 " + "-".repeat(10));
        System.out.println(nissan2.verDetalle());
        System.out.println("-".repeat(10) + " MAZDA " + "-".repeat(10));
        System.out.println(mazda.verDetalle());

        System.out.println("Conductor subaru: " + subaru.getConductor());
        System.out.println("Ruedas Subaru: ");
        for (Rueda r : subaru.getRuedas()){
            System.out.println(r.getFabricante() +  ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }

    }
}
