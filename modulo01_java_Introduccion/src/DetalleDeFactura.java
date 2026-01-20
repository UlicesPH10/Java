import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = in.nextLine();

        System.out.println("Ingrese el precio del primer producto");
        double producto1 = in.nextDouble();

        System.out.println("Ingrese el precio del segundo producto");
        double producto2 = in.nextDouble();

        double subtotal = producto1 + producto2;
        double impuesto = subtotal * 0.19;
        double total = subtotal + impuesto;

        System.out.printf("La factura %s tiene un total bruto de %f, con un impuesto de %f y el monto despúes de impuesto es de %f", nombreFactura, subtotal, impuesto, total);

    }
}
