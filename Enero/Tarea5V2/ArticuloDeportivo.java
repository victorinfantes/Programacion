package Enero.Tarea5V2;

public class ArticuloDeportivo {

    private String codigoCiudad;
    private String codigoTienda;
    private String codigoArticulo;
    private String descripcion;
    private int digitoControl;
    private int unidades;

    //Creamos constructores


    public ArticuloDeportivo(String codigoCiudad, String codigoTienda, String codigoArticulo, String descripcion, int unidades) {
        this.codigoCiudad = codigoCiudad;
        this.codigoTienda = codigoTienda;
        this.codigoArticulo = codigoArticulo;
        this.descripcion = descripcion;
        this.calcularDigitoControl();
        this.unidades = unidades;
    }

    public ArticuloDeportivo() {
        this.codigoCiudad = "0";
        this.codigoTienda = "0";
        this.codigoArticulo = "0";
        this.digitoControl = 0;
        this.descripcion = "";
        this.unidades = 0;
    }

    //Constructor tipo copia
    public ArticuloDeportivo(ArticuloDeportivo copiaArticulo) {
        this.codigoCiudad = copiaArticulo.getCodigoCiudad();
        this.codigoTienda = copiaArticulo.getCodigoTienda();
        this.codigoArticulo = copiaArticulo.getCodigoArticulo();
        this.digitoControl = copiaArticulo.getDigitoControl();
        this.descripcion = copiaArticulo.getDescripcion();
        this.unidades = copiaArticulo.getUnidades();
    }


    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
        //tenemos que recalcular el codigo de control
        this.calcularDigitoControl();
    }

    public String getCodigoTienda() {
        return codigoTienda;
    }

    public void setCodigoTienda(String codigoTienda) {
        this.codigoTienda = codigoTienda;
        this.calcularDigitoControl();
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
        this.calcularDigitoControl();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDigitoControl() {
        return digitoControl;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void incrementarUnidades(int unidades) {
        this.unidades = this.getUnidades() + unidades;
    }

    public void decrementarUnidades(int unidades) {
        //No podemos dejar las unidades en negativo , lo dejamos a cero
        if (this.getUnidades()-unidades<=0) {
            this.unidades=0;
            System.out.println("El stock esta a cero");
        }else {
            this.unidades=this.getUnidades()-unidades;
        }
    }

    public String getCodigoCompleto() {
        return this.getCodigoCiudad()+this.getCodigoTienda()+this.getCodigoArticulo()+this.getDigitoControl();
    }

    private void calcularDigitoControl() {
        //Convertimos los codigos a enteros
        int ciudad = Integer.parseInt(this.getCodigoCiudad());
        int tienda = Integer.parseInt(this.getCodigoTienda());
        int articulo = Integer.parseInt(this.getCodigoArticulo());
        //Calculamos el digito de control

        this.digitoControl = (ciudad + tienda + articulo) % 99;
    }

    @Override
    public String toString() {
        return "ArticuloDeportivo{" +
                "codigoCiudad='" + codigoCiudad + '\'' +
                ", codigoTienda='" + codigoTienda + '\'' +
                ", codigoArticulo='" + codigoArticulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", digitoControl=" + digitoControl +
                ", unidades=" + unidades +
                '}';
    }
}
