package BuclesAnidados;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int tabla,i;
        for (tabla=1;tabla<=10;tabla++) {
            System.out.println("Estoy en la tabla :" + tabla);
            System.out.println("--------------------");
                for(i=1;i<=10;i++){
                    System.out.println(tabla + " x " + i + " = "+ tabla*i);
                }
            System.out.println("-------------NEXT-----------");

        }
    }
}
