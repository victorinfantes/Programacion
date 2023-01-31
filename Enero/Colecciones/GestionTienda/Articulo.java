package Enero.Colecciones.GestionTienda;

import java.util.Objects;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioDeCompra;
    private double precioDeVenta;
    private int stock;

    //Propiedades de los articulos

    public Articulo(String co,String de, double pc, double pv, int st){
        this.codigo=co;
        this.descripcion=de;
        this.precioDeCompra=pc;
        this.precioDeVenta=pv;
        this.stock=st;
    }
    public Articulo(String co){
        this.codigo=co;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioDeCompra() {
        return precioDeCompra;
    }

    public void setPrecioDeCompra(double precioDeCompra) {
        this.precioDeCompra = precioDeCompra;
    }

    public double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioDeCompra=" + precioDeCompra +
                ", precioDeVenta=" + precioDeVenta +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(codigo, articulo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
