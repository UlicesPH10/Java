package ClassMath;

import java.util.Random;

public class ClassRandom {
    public static void main(String[] args) {
        String colores[] = {"azul", "amarillo", "rojo", "verde", "negro", "blanco"};
        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);


        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores[(int) random] = " + colores[(int) random]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(22,24);
        System.out.println("randomInt = " + randomInt);

        System.out.println("randomObj = " + colores[randomObj.nextInt(colores.length)]);
    }
}
