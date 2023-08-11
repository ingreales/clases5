package agregacion;

public class FacturaMain {
    public static void main(String[] args) {
        Producto pro = new Producto("gafas",30);
        Factura factura = new Factura("12","11/08/2023",pro);
    }
}
