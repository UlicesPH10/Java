package String;

public class ValidarString {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (!esNulo)
            System.out.println(curso.toUpperCase()); // esto da un NullPinterException
        else System.out.println("Es un valor nulo");

        if(esNulo) curso = "";

        boolean esVacio = curso.length() == 0;
        boolean esVacio2 = curso.isEmpty();
        boolean esBlanco = curso.isBlank(); //La forma mas segura (valida si es vaciao o espacio blanco)

        if(!esBlanco)
            System.out.println(curso.toUpperCase());

        //System.out.println(curso.concat(" desde cero")); //también da un NullPointerException
        System.out.println("Bienvenido al curso " + curso); //(+) con operador + no da error
    }
}
