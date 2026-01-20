package Conversiones;

public class PrimitivoToCadena {

    public static void main(String[] args) {
        int numeroInt = 100;
        String numeroStr = Integer.toString(numeroInt);
        System.out.println("numeroStr = " + numeroStr);

        numeroStr = String.valueOf(numeroInt); //otra forma
        System.out.println("numeroStr = " + numeroStr);
    }
}

