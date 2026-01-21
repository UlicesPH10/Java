package String;

public class Inmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";
        curso.concat(profesor); //curso no cambia porque los string son imnutables
        String resultado = curso.concat(profesor);
        System.out.println(resultado);

        String otroStirng = curso.transform(c -> {
            return c.concat(" con " + profesor );
        });
        System.out.println(curso);
        System.out.println(otroStirng);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
