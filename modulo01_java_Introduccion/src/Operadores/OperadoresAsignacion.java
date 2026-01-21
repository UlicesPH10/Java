package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;

        //operadores compuestos
        i = i + 2;
        i +=2;

        j = j - 2;
        j -= 2;

        i *= 3;

        String n = "hola";
        n += " mundo";
        System.out.println("n = " + n);
    }
}
