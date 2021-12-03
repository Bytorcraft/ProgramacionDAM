package ej_3_5;
import java.util.Scanner;
/**
 * Programa que lee varios num, solo para si es 0, da la suma y la cantidad de sumados.
 */
/**
 * @author Minaya
 *
 */
public class ej_3_5 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma = 0;
		int introducidos = 0;
		//lo lee, lo suma y te dice cuantos
		do {
			System.out.print("Introduce un numero para sumar, se finaliza con el 0: ");
			numero =teclado.nextInt();
			suma += numero;
			introducidos++;
		} while (numero != 0);
		System.out.println("La suma de los  " + --introducidos + " numeros introducidos es: " + suma);
		
		
	}
}