package Conversiones;

public class CadenaToPrimitivo {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicStr = "True";
        boolean logicBolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBolean = " + logicBolean);
    }
}
