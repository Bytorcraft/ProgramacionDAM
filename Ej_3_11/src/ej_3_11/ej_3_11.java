package ej_3_11;
import java.util.Scanner;
/**
 * Programa que lee un numero y te dice los primos hasta ese num.
 */
/**
 * @author Minaya
 *
 */
public class ej_3_11 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor= 1;
		int maximo;
		int contador=0;
		//hacemos que pida el numero
		System.out.println("Introduce el numero hasta el que se quiera contar los primos: ");
		maximo= teclado.nextInt();
		// creamos el proceso para decir los primos
		for( numero=maximo;maximo<numero ;numero++ ) {
			for (divisor=1;divisor<numero;divisor++) {
				if (numero%divisor == 0) {
					contador++;
				}
			}	
			if (contador==2) {System.out.println("El siguiente es: " +divisor); }
		}	
	}
}