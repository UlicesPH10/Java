import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId = 0;
    private int indiceProducto = 0;

    public OrdenCompra() {
        productos = new Producto[4];
        id = ultimoId++;
    }

    public OrdenCompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCliente() {
        String cliente = this.cliente.getNombre() + " " + this.cliente.getApellido();
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public StringBuilder listarProductos() {
        StringBuilder productos = new StringBuilder();
        for (int i = 0; i < this.productos.length; i++) {
            productos.append(i + ": marca: ").append(getProductos()[i].getFabricante()).append(" producto: " + getProductos()[i].getNombre()).append(", precio: " + getProductos()[i].getPrecio()).append("\n");
        }

        return productos;
    }

    public OrdenCompra addProducto(Producto producto) {
        if (indiceProducto < productos.length)
            productos[indiceProducto++] = producto;
        return this;
    }

    public int obtenerTotal() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public String getDetalles() {
        String detalles = this.descripcion;
        detalles += " ".repeat(10) + "fecha: " + this.fecha;
        detalles += "\n";
        detalles += listarProductos();
        return  detalles;
    }

}
