package modelo;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;
    public Lacteo(String nombre, double precio) {
        super(nombre, precio);
    }
    public Lacteo(String nombre, double precio, int cantidad, int proteinas){
        this(nombre,precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
