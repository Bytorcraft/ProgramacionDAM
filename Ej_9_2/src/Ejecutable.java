import java.util.*;
public class Ejecutable {

	

	public static void main(String[] args) {
		//Votacion v= new Votacion(5);
		final int ELECTORES= 724983;
		final int PARTIDOS=20;
		final int MAXVOTOS=500;
		final int ESCAÑOS=27;
		
		Random r= new Random();
		int numVotos;
		int electores= ELECTORES;
		
		
		//int[] votos= {10000,25000,30000,12000 }; 
		String[] p= new String[PARTIDOS];
		
		for (int i=1; i<= PARTIDOS; i++) {
			p[i-1]= "P_"+ (i<10 ? "0" : "") +i;
		}
		Votacion v = new Votacion(ESCAÑOS);

		/**
		 for(int i=0;i<p.length;i++) {// con lo que esta comentado, se introducen los datos a mano
			v.insertarVotos(p[i], votos[i]);
			v.calcular();
			System.out.println(v);
		}
		 */
		
		
		while (electores >0) {// de esta forma se haria de forma aleatoria
			numVotos = r.nextInt(MAXVOTOS);
			int auxPartido = r.nextInt(PARTIDOS+2);
			if (auxPartido <PARTIDOS) {
				v.insertarVotos(p[auxPartido], numVotos);
			}
			electores-=numVotos;
		} v.calcular();
		System.out.println(v);
	}

}
