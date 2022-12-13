package Condicionales_Bucles_11_23;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int codigo;
        int litros;
        float precio;
        float importe_factura;
        float facturacion_total;
        int litros_producto1;
        int fact_mas_600;

        facturacion_total = 0;
        litros_producto1 = 0;
        fact_mas_600 = 0;
        precio= 0;
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<5;i++)
        {
            System.out.println("____Factura Numero : "+i+"____");
            System.out.println("Codigo de producto : ");
            codigo=sc.nextInt();
            System.out.println("cantidad (litros) : ");
            litros=sc.nextInt();
            switch (codigo) {
                case 1: {
                    precio = 0.6f;
                    break;
                }
                case 2: {
                    precio = 3f;
                    break;
                }
                case 3: {
                    precio = 1.25f;
                    break;
                }
                default:
                {precio=0;}
            }
            importe_factura=litros*precio;
            System.out.println("____Factura Numero : "+i+"\nCodigo Producto"+codigo+"_importe"+importe_factura);
            facturacion_total=facturacion_total+(importe_factura);
            if (codigo == 1)
            {litros_producto1=litros_producto1+litros;}
            if (importe_factura > 600)
            {fact_mas_600=fact_mas_600+1;}//fact_mas_600++
        }
        System.out.println("La facturación total es de : "+facturacion_total + "€");
        System.out.println("Ventas del producto 1 : "+litros_producto1);
        System.out.println("Factura superior a 600 € :"+fact_mas_600);
    }


}
