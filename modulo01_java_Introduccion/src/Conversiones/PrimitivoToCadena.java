package Conversiones;

public class PrimitivoToCadena {

    public static void main(String[] args) {
        int numeroInt = 100;
        String numeroStr = Integer.toString(numeroInt);
        System.out.println("numeroStr = " + numeroStr);

        numeroStr = String.valueOf(numeroInt); //otra forma
        System.out.println("numeroStr = " + numeroStr);

        double realDouble = 1.23456e2;
        String realString = Double.toString(realDouble);
        System.out.println("realString = " + realString);

        realString = String.valueOf(1.23456f);
        System.out.println("realString = " + realString);
    }
}

