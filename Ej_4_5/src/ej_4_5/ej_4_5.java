package ej_4_5;
import java.util.Scanner;
/**
 * Programa que lee una cadena y la divide en 2 (par e impar).
 */
/**
 * @author Minaya
 *
 */
public class ej_4_5 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		char letra;
		int par=0, numero;
		char impar;
		
		System.out.println("Escribe la frase: ");
		frase= teclado.nextLine();
		
		if(frase.length() <= 79) {
			for (par=0; par<frase.length() ;par+=2)
			{
				letra= frase.charAt(par);
				System.out.print( letra);
				}
			
			System.out.println("\n");
			
			for (numero=1; numero<frase.length();numero+=2)
			{
				impar= frase.charAt(numero);
				System.out.print(impar);
				
			 }	
		}else {System.out.println("Te has pasado de 80 caracteres mi pana"); }	
	}
	
}