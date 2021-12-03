package ej_3_8;
import java.util.Scanner;
/**
 * Programa que calcula el factorial de un numero, para si es 0.
 */
/**
 * @author Minaya
 *
 */
public class ej_3_8 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int factorial=1;
		int temporal;
		//primero introducimos numero
		System.out.println("Introduce un numero: ");
		n= teclado.nextInt();
		// si es 0 no hace nada, si es otro ejecuta todo

			for(temporal=n;temporal>=1; temporal--){
				factorial *=temporal;			
			};
			System.out.println("El factorial de " +n + " es: " + factorial);
			 
	}
}
