package ej_4_6;
import java.util.Scanner;
/**
 * Programa que lee una frase y te dice cuantas vocales, consonantes y numeros hay.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_6 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;

		int vocales=0,consonantes=0, numeros=0;
		int x=0;
		//lee la cadena
		
		System.out.println("Escriba la frase, menor a 80 caracteres: ");
		frase= teclado.nextLine();

			
		if (frase.length() <=79) {
			for(x=0; x<frase.length(); x++) {
			char letra= frase.charAt(x);
			
				if (letra=='A' || letra=='a'|| letra=='E'|| letra=='e'|| letra=='I'|| letra=='i'|| letra=='O'|| letra=='o'|| letra=='U'|| letra=='u') {
				vocales++;}//escribe cuantas mayusculas hay
				
				else if (letra>='0' && letra <='9') {
					numeros++;
				}
				else if (letra ==32);
				else  { 
					consonantes++;}// escribe cuantas minusculas hay
					
			}
			System.out.println("Vocales: " + vocales);
			System.out.println("Consonantes: " + consonantes);
			System.out.println("Numeros: " + numeros);
			}else {System.out.println("Te has pasado de 80 caracteres mi pana");}
			}
				
		}

