public class Producto {
    private String codProd;
    private String nombre;
    private float precioU;
    private boolean aplicaIva;
    private String stock;
    private String estado;

    public Producto(String codProd, String nombre, float precioU, boolean aplicaIva, String stock, String estado) {
        this.codProd = codProd;
        this.nombre = nombre;
        this.precioU = precioU;
        this.aplicaIva = aplicaIva;
        this.stock = stock;
        this.estado = estado;
    }

    public void mostrarProducto() {
        System.out.println("Codigo del Producto: " + codProd);
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio del Producto: " + precioU);
        System.out.println("Aplica Iva: " + aplicaIva);
        System.out.println("Stock: " + stock);
        System.out.println("Estado: " + estado);
    }

    public float getPrecioU() {
        return precioU;
    }

    public boolean getAplicaIva() {
        return aplicaIva;
    }

    public String getEstado() {
        return estado;
    }
}
