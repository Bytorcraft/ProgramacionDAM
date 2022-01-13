package ej_4_1;
import java.util.Scanner;
/**
 * Programa que lee una cadena y escriba letra a letra.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_1 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		char[] letra;
		// hacemos que pida la frase, menor de 80 caracteres
		
		System.out.println("Escriba la frase, tiene que ser menor de 80 caracteres: ");
		frase= teclado.nextLine();
		letra= frase.toCharArray();
		
		//hacemos el metodo para que lo escriba letra a letra
		
		if(frase.length() <= 79) {
			int subcadena=0;
			for (int x=0; x< frase.length() ;x++)
				 System.out.println(frase.substring(subcadena, x+1));
				
		}else {System.out.println("Te has pasado de 80 caracteres mi pana"); }	
		
	}
}