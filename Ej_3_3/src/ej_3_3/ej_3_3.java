package ej_3_3;
import java.util.Scanner;
/**
 * Programa que lee un num y calcula sus divisores
 */
/**
 * @author Minaya
 *
 */
public class ej_3_3 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor= 1;
			//Hago que pida un valor 
			System.out.println("Introduzca un numero: ");
			numero = teclado.nextInt();
			//Calculo de sus divisores
			for (divisor=1;divisor<numero;divisor++) {
				if (numero%divisor == 0) {
					System.out.println("Los divisores de " + numero + " son: " + divisor);
				}
			}
		}
		
	}
