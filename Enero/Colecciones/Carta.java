package Enero.Colecciones;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
    private static String[] numeros = {"01as", "02dos", "03tres", "04cuatro", "05cinco", "06seis", "07siete", "08ocho", "09nueve", "010sota", "011caballo", "012rey"};
    private static String[] palos = {"bastos", "copas", "espadas", "oros"};
    private String numero;
    private String palo;

    public Carta() {
        this.numero = numeros[(int) (Math.random() * 10)];
        this.palo = palos[(int) (Math.random() * 4)];

    }

    public String getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero='" + numero + '\'' +
                ", palo='" + palo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(numero, carta.numero) && Objects.equals(palo, carta.palo);
    }



    @Override
    public int compareTo(Carta c) {
        if (palo.equals(c.getPalo())) {
            return numero.compareTo(c.getNumero());
        }else {
            return palo.compareTo(c.getPalo());
        }

    }
}
