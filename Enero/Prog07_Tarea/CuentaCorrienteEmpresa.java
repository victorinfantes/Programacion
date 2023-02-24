package Enero.Prog07_Tarea;

public class CuentaCorrienteEmpresa extends CuentaCorriente{

    private double tipoInteresDescubierto;
    private double maximoDescubierto;
    private double comisionFijaDescubierto;

    public CuentaCorrienteEmpresa(Persona titular, double saldo, String iban, String listaEntidades, double tipoInteresDescubierto, double maximoDescubierto, double comisionFijaDescubierto) {

        super(titular, saldo, iban, listaEntidades);
        this.tipoInteresDescubierto = tipoInteresDescubierto;
        this.maximoDescubierto = maximoDescubierto;
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString()+
                "Maximo Descubierto:"+this.getMaximoDescubierto()+
                "Tipo Interes Descubierto:"+this.getTipoInteresDescubierto()+
                "Comision fija Descubierto:"+this.getComisionFijaDescubierto();
    }

    public double getTipoInteresDescubierto() {
        return tipoInteresDescubierto;
    }

    public void setTipoInteresDescubierto(double tipoInteresDescubierto) {
        this.tipoInteresDescubierto = tipoInteresDescubierto;
    }

    public double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public void setMaximoDescubierto(double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    public double getComisionFijaDescubierto() {
        return comisionFijaDescubierto;
    }

    public void setComisionFijaDescubierto(double comisionFijaDescubierto) {
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }
}
