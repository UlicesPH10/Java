package Primitivos;

public class datosReales {

    static float varFlotante;

    public static void main(String[] args) {
        float realFloat =  2120e-3f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);

        double readlDouble = 3.4028235E39;
        System.out.println("\nreadlDouble = " + readlDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("Máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double = " + Double.MIN_VALUE);

        System.out.println("varFlotante = " + varFlotante);
    }
}