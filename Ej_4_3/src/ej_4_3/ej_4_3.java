package ej_4_3;
import java.util.Scanner;
/**
 * Programa que lee una palabra y una frase y diga si la palabra esta en la frase.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_3 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String palabra;
		//pide la frase
		System.out.println("Introduce el texto: ");
		frase= teclado.nextLine();
		
		//pide la palabra
		System.out.println("Introduce la palabra a buscar en el texto: ");
		palabra= teclado.nextLine();
		
		// hacemos que busque dentro de la frase la palabra
		System.out.println("La posicion de " +palabra +" es: " + frase.indexOf(palabra));
	}
}
