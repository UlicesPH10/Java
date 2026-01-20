package Conversiones;

public class ConversionTipos {
    public static void main(String[] args) {
        int i = 10000;
        short s =  (short) i; //casting es forzar la conversion
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);

        float f = (float) i;
        System.out.println("f = " + f);
    }
}
