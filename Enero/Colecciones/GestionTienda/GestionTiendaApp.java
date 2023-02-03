package Enero.Colecciones.GestionTienda;

import java.sql.SQLOutput;
import java.util.Map;
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
                        System.out.println("Su articulo es : "+a.get(i));
                        System.out.println("Entrando mercanica nueva de ese articulo");
                        System.out.println("Introduce la cantidad de unidades nuevas de ese articulo");
                        stockIntro=Integer.parseInt(sc.nextLine());
                        a.get(i).setStock(stockIntro+a.get(i).getStock());
                        System.out.println("Articulo actualizado en el almacen :");
                        System.out.println(a.get(i));//Imprimimos el articulo actualizado
                    }
                    break;
                case 6://Gestion de ventas necesitamos un submenu para ventas
                    System.out.println("Gestión de ventas");
                    do {
                        System.out.println("\n 1. Añadir articulos a la venta");
                        System.out.println("\n 2. Generar las factura final de la venta ");
                        System.out.println("\n 3. Cancelar la venta ");
                        System.out.println("Introduzca la opcion deseada ");
                        opcion2=Integer.parseInt(sc.nextLine());
                        switch (opcion2) {
                            case 1://Añadimos una linea de factura
                                System.out.println("Por favor introduzca el codigo del articulo ");
                                codigoIntro=sc.nextLine();
                                if (!a.contains(new Articulo(codigoIntro))) {
                                    System.out.println("Ese articulo no existe introduzca uno valido");
                                }else {
                                    i=a.indexOf(new Articulo(codigoIntro));
                                    System.out.println(a.get(i));//Imprime el articulo a vender
                                    if (lineasFra.containsKey(codigoIntro)) {
                                        unidadesEnFactura=lineasFra.get(codigoIntro);
                                    }else {//este articulo existe
                                        unidadesEnFactura=0;
                                    }
                                    System.out.println("Unidades de este articulo que lleva en la factira :"+unidadesEnFactura);
                                    System.out.println("Unidades que quiere incorporar a la factura ");
                                    unidades=Integer.parseInt(sc.nextLine());
                                    if ((a.get(i).getStock())-unidadesEnFactura<unidades){
                                        System.out.println("No hay suficiente stock");
                                        System.out.println("En este caso la venta maxima es :"+(a.get(i).getStock()-unidades));
                                    }else if(lineasFra.containsKey(codigoIntro)) {
                                        lineasFra.put(codigoIntro, lineasFra.get(codigoIntro)+unidades);
                                    }
                                    else {
                                        lineasFra.put(codigoIntro,unidades);
                                    }
                                }
                                System.out.println("\n\n CODIGO | UNIDADES | PRECIO UNIDAD | SUBTOTAL");
                                System.out.println("---------------------------------------------------");
                                for (Map.Entry pareja: lineasFra.entrySet()) {
                                    codigo=pareja.getKey().toString();//consigo el codigo del articulo en el hashmap
                                    i= a.indexOf(new Articulo(codigo));//consigo posicion del articulo en el array
                                    unidades=Integer.parseInt(pareja.getValue().toString());
                                    subtotal=unidades*a.get(i).getPrecioDeVenta();
                                    System.out.println(codigo+a.get(i).getDescripcion()+unidades+a.get(i).getPrecioDeVenta()+subtotal);
                                }

                                break;
                            case 2://Generar factura final con todas las lineas de factura
                                System.out.println("\n\n CODIGO | UNIDADES | PRECIO UNIDAD | SUBTOTAL");
                                System.out.println("---------------------------------------------------");
                                baseImponible=0;
                                for (Map.Entry pareja: lineasFra.entrySet()) {
                                    codigo = pareja.getKey().toString();
                                    i=a.indexOf(new Articulo(codigo));
                                    unidades=Integer.parseInt(pareja.getValue().toString());
                                    subtotal=unidades*a.get(i).getPrecioDeVenta();
                                    System.out.println(codigo+" \n "+a.get(i).getDescripcion()+" \n "+unidades+" \n "+a.get(i).getPrecioDeVenta()+" \n "+subtotal);
                                    baseImponible=baseImponible+subtotal;
                                    a.get(i).setStock(a.get(i).getStock()-unidades);
                                }
                                System.out.println("------------------------FACTURA FINAL-----------------------");
                                System.out.println("------------------------BASE IMPONIBLE: "+baseImponible);
                                System.out.println("------------------------IVA(21%): "+baseImponible*0.21);
                                System.out.println("------------------------TOTAL: "+(baseImponible+(baseImponible*0.21)));
                                System.out.println("\n\n FACTURA GENERADA \n Pulse Intro para volver al menú");
                                sc.nextLine();
                                break;
                        }
                    }while(opcion2==1);
                    break;
            }
        } while (opcion != 7);


    }
}
