package octubre;



public class NumAleatorios {

	public static void main(String[] args) {
		// Generar numeros aleatorios

		char car;boolean consonante;
		
			for(int i=0;i<10;i++)
				{
				consonante=true;
				car= (char)(Math.random()*26+'A');
				System.out.println("Letra generada : "+car);
				switch(car)
				{
				case 'A':consonante=false;break;
				case 'E':consonante=false;break;
				case 'I':consonante=false;break;
				case 'O':consonante=false;break;
				case 'U':consonante=false;break;
				}
				 if (consonante==true)
					 {System.out.println("El caracter "+car+" es consonante");}
				 else
					 {System.out.println("El caracter "+car+" es vocal");}
				
				
				
				
				
				/*if ((car=='A')||(car=='E')||(car=='I')||(car=='O')||(car=='U'))
				{
					System.out.println("Car vale "+car+" y es una vocal");
				}
				else
					System.out.println("Car vale "+car+" y es consonante");
				}*/
	}

}
}
