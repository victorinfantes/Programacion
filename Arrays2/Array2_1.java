package Arrays2;

public class Array2_1 {
    public static void main(String[] args) {
        //Creamos el array
        int numeros[]= {1,2,3,4,5};
        //Creamos un array auxiliar
        int auxiliar[]=new int[numeros.length];
        for(int i=numeros.length-1,j=0;i>=0;i--,j++){

            auxiliar[j]=numeros[i];
            System.out.println(auxiliar[j]);
        }
        for (int i = 0; i < auxiliar.length; i++) {
            System.out.print(auxiliar[i]+";");
        }
        numeros=auxiliar;

    }
}
