package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {

        int num,cont_ceros,cont_pos,cont_neg,suma_pos,suma_neg;
        float media_pos,media_neg;

        num=0;cont_ceros=0;cont_neg=0;cont_pos=0;suma_pos=0;suma_neg=0;media_pos=0;media_neg=0;
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<11;i++)
            {
                System.out.println("Introduce un numero :");
                num=sc.nextInt();
                if (num==0)
                    {cont_ceros++;}
                else
                    {
                        if (num>0)
                            {
                                cont_pos++;
                                suma_pos=suma_pos+num;
                            }
                        else
                            {
                                cont_neg++;
                                suma_neg=suma_neg+num;
                            }


                    }
            }

        System.out.println("El numero total de ceros es :"+cont_ceros);
        System.out.println("El numero totol de positivos es :"+cont_pos);
        System.out.println("El numero total de negativos es :"+cont_neg);


        if (cont_pos==0)
            {
                System.out.println("No podemos hacer la media");
            }
        else
            {
                media_pos=(float)suma_pos/cont_pos;
                System.out.println("La media de positivos es : "+media_pos);
            }


        if (cont_neg==0)
        {
            System.out.println("No podemos hacer la media");
        }
        else
        {
            media_neg=(float)suma_neg/cont_neg;
            System.out.println("La media de negativos es : "+media_neg);
        }

    }
}
