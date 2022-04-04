import java.util.*;
public class Ejecutable {

	

	public static void main(String[] args) {
		Votacion v= new Votacion(5);
		int[] votos= {10000,25000,30000,12000 }; 
		String[] p= {"P1", "P2","P3", "P4"};
		
		
		for(int i=0;i<p.length;i++) {
			v.insertarVotos(p[i], votos[i]);
			v.calcular();
			System.out.println(v);
		}
		
		
	}

}
