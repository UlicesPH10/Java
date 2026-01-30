package ClassMath;

public class TrigonometriaMath {
    public static void main(String[] args) {
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(16);
        System.out.println("raiz = " + raiz);

        //convertir de radianoes a angulos
        double grados = Math.toDegrees(1.5707963267948966);
        System.out.println("grados = " + grados);

        //grados a radines
        double radianes = Math.toRadians(90);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90); " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));
    }
}
