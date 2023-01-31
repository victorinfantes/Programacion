package Enero.Colecciones.GestionTienda;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class GestionTiendaApp {
    static ArrayList<Articulo> a = new ArrayList<Articulo>();

    public static void main(String[] args) {
        HashMap<String, Integer> lineasFra = new HashMap<String, Integer>();
        int opcion;
        int opcion2;
        int i;
        int stockIntro;
        int unidades = 0;
        int unidadesEnFactura = 0;
        double precioDeCompraIntro;
        double precioDeVentaIntro;
        double subtotal;
        double baseImponible;
        double totalFactura;
        String codigo;
        String codigoIntro = "";
        String descripcionIntro;
        String precioDeCompraIntroString;
        String precioDeVentaIntroString;
        String stockIntroString;

        Scanner sc = new Scanner(System.in);
        //Generamos el menu principal de la APP no sale hasta que no metamos un 7
        do {
            System.out.println("\n\n GESTIÓN DE MI TIENDA");
            System.out.println("=======================");
            System.out.println("1. Listados");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificacón");
            System.out.println("5. Entrada de mercancia");
            System.out.println("6. Venta");
            System.out.println("7. Salida");
            System.out.println("Introduzca la opcion deseada");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1://IMPRIMIMOS LOS LISTADOS DE LOS ARTICULOS
                    for (Articulo aux : a) {
                        System.out.println(aux);
                    }
                    break;
                case 2://ALTAS
                    System.out.println("\n NUEVO ARTÍCULO\n==========");
                    System.out.println("Por favor introduce los datos del nuevo articulo");
                    System.out.println("Introduzca el codigo:");
                    codigoIntro=sc.nextLine();
                    if (a.contains(new Articulo(codigoIntro))){
                        System.out.println("Ese codigo ya existe en la tienda. \n Introduzca un nuevo codigo");
                    }else {
                        System.out.println("Introduzca la descripcion:");
                        descripcionIntro=sc.nextLine();
                        System.out.println("Introduce el precio de Compra");
                        precioDeCompraIntro=Double.parseDouble(sc.nextLine());
                        System.out.println("Introduce el precio de Venta");
                        precioDeVentaIntro=Double.parseDouble(sc.nextLine());
                        System.out.println("Introduzca el Stock del artículo");
                        stockIntro=Integer.parseInt(sc.nextLine());
                        a.add(new Articulo(codigoIntro, descripcionIntro, precioDeCompraIntro, precioDeVentaIntro, stockIntro));
                    }
                    break;
                case 3://Bajas
                    System.out.println("\n NUEVO ARTÍCULO\n==========");
                    System.out.println("Introduce el codigo del artículo que quiere dar de baja");
                    System.out.println("Introduzca el codigo");
                    codigoIntro=sc.nextLine();
                    if (!a.contains(new Articulo(codigoIntro))){
                        System.out.println("El codigo que has introducido no existe , introduzca un codigo valido");
                        System.out.println("Puede usar la opcion de listados para consultar codigos");
                    }else {
                        a.remove(new Articulo(codigoIntro));
                        System.out.println("Articulo borrado");
                    }
                    break;
                case 4:
                    System.out.println("\n NUEVO ARTÍCULO\n==========");
                    System.out.println("Introduce el codigo del artículo que quiere modificar");
                    System.out.println("Introduzca el codigo");
                    codigoIntro=sc.nextLine();
                    if (!a.contains(new Articulo(codigoIntro))){
                        System.out.println("El codigo que has introducido no existe , introduzca un codigo valido");
                        System.out.println("Puede usar la opcion de listados para consultar codigos");
                    }else {//Modificar un codigo que existe
                        i=a.indexOf(new Articulo(codigoIntro));
                        System.out.println("Introduzca los nuevos datos del articulo o INTRO para dejarlos igual");
                        System.out.println("Codigo : "+codigoIntro);
                        System.out.println("Codigo "+a.get(i).getCodigo());
                        System.out.println("Nuevo codigo para este articulo INTRO para quedarle el mismo");
                        codigoIntro=sc.nextLine();
                        if (!codigoIntro.equals("")) {
                            a.get(i).setCodigo(codigoIntro);
                        }
                        System.out.println("Descripcion : "+a.get(i).getDescripcion());
                        System.out.println("Nueva descripcion para este articulo INTRO para quedarle el mismo");
                        descripcionIntro=sc.nextLine();
                        if (!descripcionIntro.equals("")) {
                            a.get(i).setDescripcion(descripcionIntro);
                        }
                        System.out.println("Precio de compra : "+a.get(i).getPrecioDeCompra());
                        System.out.println("Nuevo precio de compra para este articulo INTRO para quedarle el mismo");
                        precioDeCompraIntroString=sc.nextLine();
                        if (!precioDeCompraIntroString.equals("")) {
                            a.get(i).setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroString));
                        }
                        System.out.println("Precio de venta : "+a.get(i).getPrecioDeVenta());
                        System.out.println("Nuevo precio de venta para este articulo INTRO para quedarle el mismo");
                        precioDeVentaIntroString=sc.nextLine();
                        if (!precioDeVentaIntroString.equals("")) {
                            a.get(i).setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroString));
                        }
                        System.out.println("Stock : "+a.get(i).getStock());
                        System.out.println("Nuevo Stock para este articulo INTRO para quedarle el mismo");
                        stockIntroString=sc.nextLine();
                        if (!stockIntroString.equals("")) {
                            a.get(i).setStock(Integer.parseInt(stockIntroString));
                        }
                        System.out.println("Producto actualizado"+a.get(i));
                    }
                    break;
                case 5://Entrada de mercancias
                    System.out.println("\n Entrada de mercancias\n============");
                    System.out.println("Por favor introduce el codigo del articulo");
                    codigoIntro=sc.nextLine();
                    if (!a.contains(new Articulo(codigoIntro))) {
                        System.out.println("No hay ningun articulo con ese codigo");
                        System.out.println("Puede usar la opcion de listados para consultar codigos");
                    }else {
                        i=a.indexOf(new Articulo(codigoIntro));

                    }
                    break;
                case 6:
                    break;
            }
        } while (opcion != 7);


    }
}
