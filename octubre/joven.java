package octubre;

public class joven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short edad=29;
		short nivel_de_estudios=4;
		int ingresos=30000;
		boolean jasp;
		jasp=true;
		if(((edad<28)&&(nivel_de_estudios>3))||(edad<30&&ingresos>20000))
			{jasp=true;}
		else
			{jasp=false;}
		
		
		
		System.out.println(" ¿está considera como jasp? :"+jasp);
		
		
		
		
	}

}
