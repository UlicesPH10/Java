package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // And: las dos se tienen que cumplir
        boolean b1 = i == j && k < l && m == false;

        System.out.println("b1 = " + b1);

        // And: las dos se tienen que cumplir  
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        
    }
}
