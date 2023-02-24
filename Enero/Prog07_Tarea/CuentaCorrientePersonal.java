package Enero.Prog07_Tarea;

public class CuentaCorrientePersonal extends CuentaCorriente{

    private double comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, double saldo, String iban, String listaEntidades, double comisionMantenimiento) {
        super(titular, saldo, iban, listaEntidades);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString()+"Comision de Mantenimiento aplicada: "+this.getComisionMantenimiento();
    }

    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }
}
