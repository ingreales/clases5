package agregacion;

public class Factura {
    private String numeroFActura;
    private  String fecha;
    Producto producto;

    public Factura(String numeroFActura, String fecha, Producto producto) {
        this.numeroFActura = numeroFActura;
        this.fecha = fecha;
        this.producto = producto;
    }
}
