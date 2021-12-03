package ej_3_4;
import java.util.Scanner;
/**
 * Programa que lee un num e indica si es primo o no
 */
/**
 * @author Minaya
 *
 */
public class ej_3_4 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor;
		// Hacemos que introduzca el numero
		System.out.println("Introduzca un numero: ");
		numero = teclado.nextInt();
		// Hacemos que lea el numero y que diga si es primo.
		for (divisor=2;divisor<numero /2;divisor++) {
			if (numero%divisor == 0) {
				System.out.println("El " + numero + " no es primo.");
			}
			else System.out.println("El " + numero + " es primo.");
/**
		primo= numero%2 !=0 || numero==2;
		divisor=3;
		boolean primo;
		while (primo && divisor < numero && numeo !=2){
			if (numero% divisor ==0)
			primo = false;
			divisor +=2;
				}
			System.out.println ("El numero" + numero + (primo ? "" : " no") + " es primo.")


*/
		}
	}
}
