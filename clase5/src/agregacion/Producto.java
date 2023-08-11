package agregacion;

public class Producto {
    private String nombreproducto;
     private int valor;

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Producto(String nombreproducto, int valor) {
        this.nombreproducto = nombreproducto;
        this.valor = valor;

    }
}
