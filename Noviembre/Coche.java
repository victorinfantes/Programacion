package Noviembre;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;

    public Coche(){
    }

    public Coche(String matricula, String marca, String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(){
        this.modelo=modelo;
    }
    
    public void imprimirCoche()
    			{
                System.out.println("Matricula : "+matricula+" Marca : "+marca+"Modelo : "+modelo);   	
    			}

}
