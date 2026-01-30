package ClassMath;


public class ClassMathExample {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3); //obtener el absoluto de un numero
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(2.5, 1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(2.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long redondeo = Math.round(3.5);
        System.out.println("redondeo = " + redondeo);

        System.out.println(Math.PI);
    }
}
