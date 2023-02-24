package Enero.Prog07_Tarea;

public class CuentaCorriente extends CuentaBancaria{

    private String listaEntidades;

    public CuentaCorriente(Persona titular, double saldo, String iban, String listaEntidades) {
        super(titular, saldo, iban);
        this.listaEntidades = listaEntidades;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString()+" Lista entidades autorizadas"+this.getListaEntidades();
    }

    public String getListaEntidades() {
        return listaEntidades;
    }

    public void setListaEntidades(String listaEntidades) {
        this.listaEntidades = listaEntidades;
    }
}
