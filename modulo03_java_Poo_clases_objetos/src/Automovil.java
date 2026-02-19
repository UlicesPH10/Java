import java.util.Objects;

public class Automovil implements Comparable<Automovil>{
    private int id = 0;


    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;

    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas = 0;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadEstanqueEstatica = 40;
    private static int ultimoId = 0;

    public static final int VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static int getCapacidadEstanqueEstatica() {
        return capacidadEstanqueEstatica;
    }

    public static void setCapacidadEstanqueEstatica(int capacidadEstanqueEstatica) {
        Automovil.capacidadEstanqueEstatica = capacidadEstanqueEstatica;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conducto) {
        this.conductor = conducto;
    }

    public Rueda[] getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if (indiceRuedas < this.ruedas.length)
            this.ruedas[indiceRuedas++] = rueda;
        return this;
    }

    public String verDetalle() {
        String detalle = "auto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo;

        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.tipo.getDescripcion();
        }

        detalle += "\nauto.color = " + this.color +
                "\nauto.patenteColor = " + colorPatente ;

        if (this.getMotor() != null)
            detalle += "\nauto.cilindrada = " + this.motor.getCilindrada();

        return detalle;
    }

    public String acelerar(int rpm) {
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km / (porcentajeGasolina * this.getEstanque().getCapacidad());
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {
        return km / (porcentajeGasolina / 100f * this.getEstanque().getCapacidad());
    }

    public static float calcularConsumoEstatico(int km, int porcentajeGasolina) {
        return km / (porcentajeGasolina / 100f * Automovil.capacidadEstanqueEstatica);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Automovil)) return false;
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' + " }";

    }


    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
