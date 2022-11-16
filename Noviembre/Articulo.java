package Noviembre;

public class Articulo {

    private String codigo_barra;
    private String denominacion;
    private int unidades;
    private double precio_compra;
    private double pvp;
    private int beneficio;

public Articulo(){

}

    public Articulo(String codigo_barra, String denominacion, int unidades, double precio_compra, double pvp, int beneficio) {
        this.codigo_barra = codigo_barra;
        this.denominacion = denominacion;
        this.unidades = unidades;
        this.precio_compra = precio_compra;
        this.pvp = pvp;
        this.beneficio = beneficio;
    }

    public String getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = this.calcularPVP();
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }


    public double calcularPVP()
                    {
                        return this.pvp=this.getPrecio_compra()+((this.getPrecio_compra()*this.getBeneficio())/100);
                    }
}
