package ej_4_2;
import java.util.Scanner;
/**
 * Programa que lee una cadena y escriba cuantas mayusculas y minusculas tiene.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_2 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;

		int mayusculas=0,minusculas=0;
		int x=0;
		//lee la cadena
		
		System.out.println("Escriba la frase, menor a 80 caracteres: ");
		frase= teclado.nextLine();

			
		if (frase.length() <=79) {
			for(x=0; x<frase.length(); x++) {
			char letra= frase.charAt(x);
				if (letra>='A' && letra<='Z') {
					mayusculas++;}//escribe cuantas mayusculas hay
				
				else if (letra>='a' && letra<='z') { 
					minusculas++;// escribe cuantas minusculas hay
				}
			}
			System.out.println("Mayusculas: " + mayusculas);
			System.out.println("Minusculas: " + minusculas);
		}
	}
}