import java.util.Objects;

public class Automovil {
    private int id = 0;


    private String fabricante;
    private String modelo;
    private Color color  = Color.GRIS;
    private double cilindrada;
    private int capacidadEstanque = 40;

    private static Color colorPatente = Color.NARANJA;
    private static int  capacidadEstanqueEstatica = 40;
    private static  int ultimoId = 0;

    public static final  int VELOCIDAD_MAX_CARRETERA = 120;
    public static final  int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil() {
        this.id = ++ultimoId;
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

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
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

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }

    public static int getCapacidadEstanqueEstatica() {
        return capacidadEstanqueEstatica;
    }

    public static void setCapacidadEstanqueEstatica(int capacidadEstanqueEstatica) {
        Automovil.capacidadEstanqueEstatica = capacidadEstanqueEstatica;
    }

    public static  void setColorPatente(Color colorPatente) { Automovil.colorPatente = colorPatente; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String verDetalle(){
        return "auto.id = " + this.id  +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color+
                "\nauto.patenteColor = " + colorPatente +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km / (porcentajeGasolina * capacidadEstanque);
    }

    public float calcularConsumo(int km, int porcentajeGasolina){
        return km / (porcentajeGasolina/100f * capacidadEstanque);
    }
    public static  float calcularConsumoEstatico(int km, int porcentajeGasolina){
        return km / (porcentajeGasolina/100f * Automovil.capacidadEstanqueEstatica);
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return  true;
        if (!(obj instanceof Automovil)) return  false;
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}
