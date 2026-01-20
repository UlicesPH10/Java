package String;

public class CreacionString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        System.out.println("curso = curso2: " + (curso == curso2));
        System.out.println("curso = curso2 (equals): " + (curso.equals(curso2)));

        String curso3 = "Programción Java";
        boolean esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);
    }
}
