package Operadores;

import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {

        String username = "Juan";
        String password = "12345";

        Scanner in = new Scanner(System.in);

        System.out.println("Ingres el username");
        String u = in.next();

        System.out.println("Ingrese la contraseña");
        String p = in.next();

        boolean isauntentication = false;

        if (username.equals(u) && password.equals(p)) isauntentication = true;
        else System.out.println("Usurio o contraseña incorrecto");

        if(isauntentication){
            System.out.println("Bienvendio uaurio ".concat(u).concat("!"));
        } else {
            System.out.println("Lo sineto, requere autenticación");
        }
        System.out.println("isauntentication = " + isauntentication);
    }
}
