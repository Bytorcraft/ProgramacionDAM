package ej_3_2;
import java.util.Scanner;
/**
 * Programa que escribe las tablas de multiplicar del 1 al 10 dependiendo del numero introducido
 */
/**
 * @author Minaya
 *
 */
public class ej_3_2 {
	public static void main (String []args) {
	
		Scanner teclado = new Scanner(System.in);
		int numero, n;
		//Hago que pida un valor del 1 al 10
		System.out.println("Introduzca un numero del 1 al 10: ");
		numero = teclado.nextInt();
		// Hago que pinte La tabla del y el numero introducido anteriormente
		System.out.println("La tabla del " + numero);
		// Creo un bucle for para que se ejecute cuantas veces quiera
		for (n=1; n<=10; n++) {
			System.out.println(numero+" * "+n+"= "+(numero * n));	
		}
	}
}
	