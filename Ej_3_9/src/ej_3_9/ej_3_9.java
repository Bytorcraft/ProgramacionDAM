package ej_3_9;
import java.util.Scanner;
/**
 * Programa que lee un numero y dice si es perfecto o no.
 */
/**
 * @author Minaya
 *
 */
public class ej_3_9 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor= 1;
		int sumadivisores=0;
			//Hago que pida un valor 
			System.out.println("Introduzca un numero: ");
			numero = teclado.nextInt();
			//Calculo de sus divisores
			for (divisor=1;divisor<numero;divisor++) {
				if (numero%divisor == 0) {
					//hago que sume sus divisores y diga si es o no perfecto
					sumadivisores += divisor;
					if (sumadivisores==numero)
						System.out.println("El número " + numero + " es prefecto.");
					if (sumadivisores != numero)
						System.out.println("El número "+ numero + " no es prefecto.");
				}
			}
	}
}