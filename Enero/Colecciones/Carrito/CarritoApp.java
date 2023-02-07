package Enero.Colecciones.Carrito;

public class CarritoApp {
    public static void main(String[] args) {
        Carrito miCarrito=new Carrito();
        miCarrito.agrega(new Elemento("Tarjeta 64Gb",19.90,5));
        miCarrito.agrega(new Elemento("Canon EOS 2000D",450,2));
        System.out.println(miCarrito);
        //numero de elementos
        System.out.println("Hay un total de: "+miCarrito.numerodeElementos()+"elementos");
        System.out.println("El total asciende a"+String.format("%.2f",miCarrito.importeTotal()));
    }
}
