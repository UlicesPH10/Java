package SistemasNumericos;

import javax.swing.*;

public class EntradaDialog {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro debe ingrear un número entero");
            main(args);
            System.exit(0);
        }
        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        String numeroOctal = Integer.toOctalString(numeroDecimal);
        String numeroHexadecimal = Integer.toHexString(numeroDecimal);

        String mensaje = "Número Decimal: " + numeroDecimal + "\n" +
                "Número Binario: " + numeroBinario + "\n" +
                "Número Octal: " + numeroOctal + "\n" +
                "Número Hexadecimal: " + numeroHexadecimal + "\n";

        JOptionPane.showMessageDialog(null, mensaje);
        System.exit(0);
    }
}
