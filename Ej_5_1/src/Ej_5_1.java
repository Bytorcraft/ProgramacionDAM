import java.util.Scanner;
/**Programa que te dice si el numero introducido es primo o no.
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_1 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
			int n;
			
			System.out.println("Introduzca el numero, para ver si es primo o no: ");
			n= teclado.nextInt();
	
			boolean siPrimo= primo(n);
			System.out.println("El resultado es: " + siPrimo);
				
				}
		static boolean primo(int n) {
		int contador=0;
		boolean primo=true;
		
			for (int x=2; x<n; x++) {
				if(n%x ==0) {
					primo=false;
				} 
				}return primo;
			}
	}

	


