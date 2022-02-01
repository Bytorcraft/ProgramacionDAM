import java.util.*;
public class Conjunto {
	 
	Scanner teclado=new Scanner(System.in);
	
	public static ArrayList<Integer> generarAleatoriosNoRepetidos (int cantidad) {// genera 100 numeros
		ArrayList<Integer> respuesta = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			respuesta.add(gen(respuesta));
		}			
		return respuesta;
	}
	
	public static int gen(ArrayList<Integer>a) {// comprueba que no estan repetidos
		Random ra = new Random();	
		int numero = ra.nextInt(11);
		if (!a.contains(numero)) {
			return numero;
		}else {
			return gen(a);
		}
	}
	
	public static void imprimir (ArrayList<Integer>num) {// imprime los nuemeros
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}
}
