package Noviembre;

public class ClaseRaiz {
    //propiedades (coeficientes de la raiz )
    private double a;
    private double b;
    private double c;
    //Constructores de la Clase


    public ClaseRaiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//Metodos de la Clases

    public double getDiscriminantes()
                    {
                        return Math.pow(b, 2)-(4*a*c);
                    }


    public boolean tieneRaices()
            {
                return(this.getDiscriminantes()>0);
            }

    public boolean tieneRaiz()
            {
                return(this.getDiscriminantes()==0);
            }

    public void obtenerRaiz()
            {
                double x=-b/(2*a);
                System.out.println("Tiene una unica solucion"+x);
            }

    public void obtenerRaices()
            {
               double x1,x2;
               x1 = (-b+Math.sqrt(this.getDiscriminantes())/2*a);
               x2 = (-b-Math.sqrt(this.getDiscriminantes())/2*a);
               System.out.println("Tiene dos soluciones");
               System.out.println("Solucion 1 : "+x1);
               System.out.println("Solucion 2 : "+x2);
            }

    public void calcular()
            {
                if (this.tieneRaices()){
                    this.obtenerRaices();
                } else if (this.tieneRaiz()) {
                    this.obtenerRaiz();
                }
                else{
                    System.out.println("no tiene raiz");
                }
            }
            }


