import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("primera orden");
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("lala", "leche", 30))
                .addProducto(new Producto("Del valle", "arroz", 32))
                .addProducto(new Producto("Valentina", "Salsa", 15))
                        .addProducto(new Producto("Herdez", "chicaros", 20));
        System.out.println(orden1.getDetalles());
        System.out.println("Total: " + orden1.obtenerTotal());
        System.out.println();

        OrdenCompra orden2 = new OrdenCompra("segunda orden");
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("apple", "mackbook", 45000))
                .addProducto(new Producto("Asus", "monitor", 6500))
                .addProducto(new Producto("Keychron", "teclado", 2200))
                        .addProducto(new Producto("Logitech", "Mouse", 1000));
        System.out.println(orden2.getDetalles());
        System.out.println("Total: " + orden2.obtenerTotal());
        System.out.println();

        OrdenCompra orden3 = new OrdenCompra("primera orden");
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Norma", "Libreta", 37))
                .addProducto(new Producto("Mapita", "Colores", 23))
                .addProducto(new Producto("Bic", "Lapicero", 12))
                        .addProducto(new Producto("Razon","Marcado", 15));

        System.out.println(orden3.getDetalles());
        System.out.println("Total: " + orden3.obtenerTotal());


    }
}