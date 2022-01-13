package ej_4_8;
import java.util.Scanner;
/**
 * Programa que lee una frase y te dice cuantas mayusculas, minusculas y numeros hay.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_8 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		char letra;
		int x;
		int ascii;
		char salida;
		
		System.out.println("Escriba la frase: ");
		frase= teclado.nextLine();
		String mayusculas= frase.toUpperCase();
			
		for(x=0;x<mayusculas.length();x++) {
			letra=mayusculas.charAt(x);
			ascii= letra+3;
			salida= (char) ascii;
			
			System.out.print(salida);
		}
		
	}
}