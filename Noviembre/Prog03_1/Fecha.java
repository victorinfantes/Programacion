package Noviembre.Prog03_1;
 enum enumMes{
    enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,noviembre,dicienmbre;
}
public class Fecha {


        private enumMes mes;
        private int dia;
        private int annio;

    public Fecha(enumMes mes) {
        this.mes = mes;
    }

    public Fecha(enumMes mes, int dia, int annio) {
        this.mes = mes;
        this.dia = dia;
        this.annio = annio;
    }

    public enumMes getMes() {
        return mes;
    }

    public void setMes(enumMes mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public boolean isSumer(){
        if (this.getMes().equals("junio") ||this.getMes().equals("julio")||this.getMes().equals("agosto")) {
            return true; }
        else{
            return false;
        }
    }


    public String toString() {
        return this.getDia() + " de " + this.getMes() + " de " + this.getAnnio();


    }
}
