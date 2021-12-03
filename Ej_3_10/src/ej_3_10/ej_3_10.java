package ej_3_10;
import java.util.Scanner;
/**
 * Programa que lee un numero y encuentra el primo mas cercano
 */
/**
 * @author Minaya
 *
 */
public class ej_3_10 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor=1;
		boolean primo;
		// Hacemos que introduzca el numero
		
			System.out.println("Introduzca un numero: ");
			numero = teclado.nextInt();
			int primoPorExceso;
			primoPorExceso= numero+1;
			
		// Hacemos que si el numero es diferente al divisor haga lo siguiente
			primo= false;
			do {
				primoPorExceso++;
				primo= primoPorExceso %2 !=0 || primoPorExceso==2;
				divisor=3;
				while(primo && divisor < primoPorExceso && primoPorExceso !=2) {
					if (primoPorExceso % divisor ==0)
						primo=false;
					divisor +=2;
				}
			}while (primo==false);
			System.out.println("El siguiente primo por exceso es: "+ primoPorExceso);
	}
}