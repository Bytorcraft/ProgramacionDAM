package ej_4_11;
import java.util.Scanner;
/**
 * Programa que lee una frase y te dice cuantas letras diferentes tiene.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_11{
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		char letra; char repetido;
		int longitud, x, contador=0;
		
		System.out.println("Introduce la frase: ");
		frase=teclado.nextLine();
		longitud=frase.length();
		
		if (longitud <=59) {
			for (x=0; x<longitud; x++) {
				letra=frase.charAt(x);
				repetido=letra;
				if(repetido== letra) {
					contador++;
				}
				
			}System.out.println("Hay "+ contador+" letras diferentes.");
		}else {System.out.println("Te has pasado de 60 caracteres mi pana");}
		
		
	}
}