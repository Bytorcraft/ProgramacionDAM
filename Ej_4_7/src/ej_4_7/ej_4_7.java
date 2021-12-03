package ej_4_7;
import java.util.Scanner;
/**
 * Programa que lee una frase y te dice cuantas mayusculas, minusculas y numeros hay.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_7 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;

		int mayusculas=0,minusculas=0, numeros=0;
		int x=0;
		//lee la cadena
		
		System.out.println("Escriba la frase: ");
		frase= teclado.nextLine();

			for(x=0; x<frase.length(); x++) {
			char letra= frase.charAt(x);
			
				if (letra>='A' && letra<='Z') {
				mayusculas++;}//escribe cuantas mayusculas hay
				
				else if (letra>='a' && letra<='z') {
					minusculas++;}
					
				else if (letra>='0' && letra<='9'){ 
						numeros++;}// escribe cuantas minusculas hay
				
				else if (letra ==32);// escribimos esto para que no cuenten los espacios en blanco
							
			}
			System.out.println("Mayusculas: " + mayusculas);
			System.out.println("Minusculas: " + minusculas);
			System.out.println("Numeros: " + numeros);		
			}	
	}
