
public class EjercicioRama31 {

	public static char getLetras()
					{
					return (char) (Math.random()*26+'a');
					}
	
	public static void main(String[] args) {
		// Realiza un "método"  para la clase Test que genere letras de forma aleatoria. 
		// investiga el funcionamiento y uso de la Case Math y su función Math

		System.out.println("Primera letra:"+getLetras());
		System.out.println("Segunda letra:"+getLetras());
		System.out.println("Tercera letra:"+getLetras());
		
	}

}
