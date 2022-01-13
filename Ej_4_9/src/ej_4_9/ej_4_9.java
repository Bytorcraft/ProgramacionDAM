package ej_4_9;
import java.util.Scanner;
/**
 * Programa que lee una frase y te dice cuantas mayusculas, minusculas y numeros hay.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_9 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		char letra;
		int x;
		int ascii;
		char salida;
		int numero;
		
		System.out.println("Escriba la frase: ");
		frase= teclado.nextLine();
		String mayusculas= frase.toUpperCase();
		System.out.println("Escriba un numero entre el 1 y el 10: ");
		numero= teclado.nextInt();	
		
		for(x=0;x<mayusculas.length();x++) {
			letra=mayusculas.charAt(x);
			ascii= letra+numero;
			salida= (char) ascii;
			
			System.out.print(salida);
		}
	
		
	}
}