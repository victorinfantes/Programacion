package Enero.Prog07_Tarea;

public class CuentaAhorro extends CuentaBancaria{

    private double tipoInteresAnual;

    public CuentaAhorro(Persona titular, double saldo, String iban, double tipoInteresAnual) {
        super(titular, saldo, iban);
        this.tipoInteresAnual = tipoInteresAnual;
    }



    @Override
    public String devolverInfoString() {
        return super.devolverInfoString()+", Tipo Interes Anual:"+this.getTipoInteresAnual();
    }

    public double getTipoInteresAnual() {
        return tipoInteresAnual;
    }

    public void setTipoInteresAnual(double tipoInteresAnual) {
        this.tipoInteresAnual = tipoInteresAnual;
    }
}
