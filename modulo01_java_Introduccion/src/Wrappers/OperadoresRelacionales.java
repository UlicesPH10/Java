package Wrappers;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1; // Le psamos la referencia del num1

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = 5;
        System.out.println(num1);
        System.out.println(num2);

    }
}
