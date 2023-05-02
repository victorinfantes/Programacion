package Enero.Prog07_Tarea;

import java.sql.SQLOutput;

public class Banco {
    private CuentaBancaria[] cuentas;
    private final int MAX_CUENTAS = 100;
    /*Final : es una variable fija*/
    private int numeroCuentas;

    public Banco() {
        this.cuentas = new CuentaBancaria[this.MAX_CUENTAS];
        this.numeroCuentas = numeroCuentas;
    }

    public boolean abrirCuenta(CuentaBancaria c) {
        if (this.numeroCuentas >= this.MAX_CUENTAS) {
            System.out.println("Imposible abrir mas cuentas");
            return false;
        }

        CuentaBancaria existe = buscarCuenta(c.getIban());
        //Comprobar que la cuenta que me pasan no existe ya en el banco
        //Necesito saber IBAN de la cuenta, y buscar si existe ya
        if (existe != null) {
            System.out.println("Esa cuenta ya existe en este banco");
            return false;
        }
        this.cuentas[this.numeroCuentas] = c;
        this.numeroCuentas++;

        return true;
    }

    private CuentaBancaria buscarCuenta(String iban) {
        for (int i = 0; i < this.numeroCuentas; i++) {
            if (this.cuentas[i].getIban().equals(iban)) {
                return this.cuentas[i];
            }
        }
        //Si he llegaod aqui es porque la cuenta no existe
        return null;
    }

    public String[] listadoCuentas() {

        String[] temporalString = new String[this.numeroCuentas];
        for (int i = 0; i < this.numeroCuentas; i++) {
            temporalString[i] = this.cuentas[i].devolverInfoString();
        }
        return temporalString;
    }


    public String informacionCuentas(String IBAN) {

        CuentaBancaria c = this.buscarCuenta(IBAN);
        if (c != null) {
            return c.devolverInfoString();
        }
        //La cuenta que se ha buscado se devuelve null, por lo tanto no se ha encontrado
        return null;
    }

    public boolean ingresoCuenta(String IBAN, double cantidad) {
        CuentaBancaria c = this.buscarCuenta(IBAN);
        if (c != null) {
            c.setSaldo(c.getSaldo() + cantidad);
            return true;
        }
        //La cuenta no se ha encontrado
        return false;
    }

    public boolean retiradaCuenta(String IBAN, double cantidad) {
        CuentaBancaria c = this.buscarCuenta(IBAN);
        if (c != null) {
            boolean sePuedeRetirar = false;
            if (c.getSaldo() - cantidad > 0) {
                sePuedeRetirar = true;

            } else if (c instanceof CuentaCorrienteEmpresa) {
                //ES UNA CUENTA DE EMPRESA , NECESITO SABER MAXIMO DESCUBIERTO
                CuentaCorrienteEmpresa aux = (CuentaCorrienteEmpresa) c;
                if ((c.getSaldo() - cantidad) < aux.getMaximoDescubierto()) {
                    sePuedeRetirar = true;
                }
            }
            if (sePuedeRetirar) {
                c.setSaldo(c.getSaldo() - cantidad);
            }
            return sePuedeRetirar;
        }

        return false;
    }

    public double obtenerSaldo(String IBAN) {
        CuentaBancaria c = this.buscarCuenta(IBAN);
        if (c != null) {
            return c.getSaldo();
        }

        return -1;
    }

}
