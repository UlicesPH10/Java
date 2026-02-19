public enum TipoAutomovil {
    SEDAN("Sedan", "Auto normal", 4),
    STATION_WAGON("Sation Wagon", "Auto grande", 4),
    HATCHBACK("Hackback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 2),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4),
    SUV("SUV", "Todo terreno deportivo", 5);

    private final  String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;


    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
